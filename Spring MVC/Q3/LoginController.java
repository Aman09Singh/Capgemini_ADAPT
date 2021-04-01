
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login.html")
	public ModelAndView getLoginPage() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/submitLogin")
	public ModelAndView auth(@ModelAttribute("userModel1") UserModel userModel1) {
		ModelAndView mv;
		UserAuth auth = new UserAuth();
		boolean isValid = auth.isValid(userModel1.getUsername(), userModel1.getPassword());
		if(isValid) {
			mv = new ModelAndView("loginSuccess");
		}else {
			mv = new ModelAndView("loginFailure");
		}
		return mv;
	}
}
