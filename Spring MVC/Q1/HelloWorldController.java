

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld.html")
	public ModelAndView helloController() {
		ModelAndView mv = new ModelAndView("helloWorld");
		return mv;
	}
}
