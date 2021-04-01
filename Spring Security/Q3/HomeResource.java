import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
		@RequestMapping(value="/", method=RequestMethod.GET)
		public String sayHelloWorld() {
			
			return ("<h1>HELLO WORLD :)</h1>");
		}
		
		//USERS
		@RequestMapping(value="/user", method=RequestMethod.GET)
		public String sayHelloUser() {
			
			return ("<h1>HELLO USER :)</h1>");
		}
		
		//ADMIN
		@RequestMapping(value="/admin", method=RequestMethod.GET)
		public String sayHelloAdmin() {
			
			return ("<h1>HELLO ADMIN :)</h1>");
		}
}
