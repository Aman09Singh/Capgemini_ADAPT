import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

	@GetMapping("/")
	public String welcomeHome() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String userHome() {
		return "Welcome to User perspective";
	}
	
	@GetMapping("/admin")
	public String adminHome() {
		return "Welcome to admin perspective";
	}
}
