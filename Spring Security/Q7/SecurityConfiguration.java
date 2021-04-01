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

	
	 @Autowired DataSource dataSource;
	 @Autowired UserDetailsService userDetailsService;
	 
	
	
	@Override //authentication 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
			
		auth.inMemoryAuthentication().withUser("amansingh")
        .password("aman")
        .roles("USER")
        .and()
        .withUser("admin")
        .password("admin123456")
        .roles("ADMIN");
	}

	

	@Override //authorization
	protected void configure(HttpSecurity http) throws Exception {	
		  http.authorizeRequests() .antMatchers("/admin").hasRole("ADMIN")
		  						   .antMatchers("/user").hasAnyRole("USER","ADMIN")
		  						   .antMatchers("/").permitAll()
		  						   .and()
		  						   .formLogin() ;
		 
	}


	@Bean
	public PasswordEncoder getEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	
}
