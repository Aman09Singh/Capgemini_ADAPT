
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView gotoLogin() {
		ModelAndView mv = new ModelAndView("loginForm");
		return mv;
	}
	@RequestMapping("/loginForm.html")
	public ModelAndView gotoLogin2() {
		ModelAndView mv = new ModelAndView("loginForm");
		return mv;
	}
	
	@RequestMapping("/submitLogin")
	public ModelAndView getStatus() {
		ModelAndView mv = new ModelAndView("status");
		return mv;
	}
}
