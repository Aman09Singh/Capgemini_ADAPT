import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired  //points the datasource to the H2 Database
	DataSource dataSource;

	@Override //overrides the configure method in ordder to configure pre-existing users
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("User1")
		.password("password")
		.roles("ADMIN")
		.and()
		.withUser("User2")
		.password("user2password")
		.roles("USER");

	//H2 Database
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(dataSource);
		.withDefaultSchema()
		.withUser(
				User.withUsername("User3")
				.password("user123")
				.roles("USER")
				)
		.withUser(
				User.withUsername("admin")
				.password("adminpassword@123456789")
				.roles("ADMIN")
				);
		}
	
	@Bean //to return a bCryptPasswordEndcoding whereever required 
	public PasswordEncoder passEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin().loginPage("/login").permitAll()
		.and()
		.logout()  
	    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	    .and()
	    .rememberMe()
	    .key("rem")
	    .rememberMeParameter("remember-me")
	    .rememberMeCookieName("rememberLogin")
	    .tokenValiditySeconds(10);
	}
	
}
