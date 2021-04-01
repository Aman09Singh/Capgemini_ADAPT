import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public c
lass HomeResource {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}

	 @RequestMapping(value="/", method=RequestMethod.GET) public String
	 sayHelloWorld() {
	 return ("<h1>HELLO WORLD</h1>"); }
	
	 //Users
	 @RequestMapping(value="/user", method=RequestMethod.GET) public String
	 sayHelloUser() {
	 
	 return ("<h1>HELLO USER Hi :)</h1>"); }
	 
	 //ADMIN
	 @RequestMapping(value="/admin", method=RequestMethod.GET) public String
	 sayHelloAdmin() {
	  
	 return ("<h1>HELLO ADMIN</h1>"); }
	 
}
