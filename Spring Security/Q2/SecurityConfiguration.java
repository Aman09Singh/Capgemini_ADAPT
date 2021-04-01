
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired //hard coded datasource for H2 database
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//H2 database Authentication 
		
		  auth.jdbcAuthentication().dataSource(dataSource) .withDefaultSchema()
		  .withUser(User.withUsername("akshat").password("akshat").roles("USER"))
		  .withUser(User.withUsername("admin").password("admin").roles("ADMIN")) 
	}

	//Authorization module
	@Override
	protected void configure(HttpSecurity http) throws Exception {		
		 http.authorizeRequests() .antMatchers("/admin").hasRole("ADMIN")
		 .antMatchers("/user").hasAnyRole("USER","ADMIN")
		 .antMatchers("/").permitAll() .and().formLogin() ;
		 
				
				http.authorizeRequests()
					.anyRequest().authenticated()
					.and().formLogin().loginPage("/login").permitAll();
	}
	
	
	
	@Bean
	public PasswordEncoder getEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	
}
