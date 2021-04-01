

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class XlsController {
	@Autowired    
    EmpDao dao; 
	@RequestMapping(value="/xlsSheet", method=RequestMethod.GET)
	public ModelAndView getExcel(){
	    List<Employee> empList = (List<Employee>) dao.getAllEmployees();		
	    
	    ModelAndView mv = new ModelAndView(new GenerateXlsReport(), "empList", empList);
	    return mv;
	}
}
