
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustController {
	
	@Autowired
	CustService service;
	
	@RequestMapping("check")
	public String check() {
		return "Okay buddy"+service.checkAll();
	}
	@RequestMapping(value="/add",method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCust(@RequestBody Customer employee) {
		service.addCust(employee);
	}


	@RequestMapping(value="/getEmp/{id}")
	public Optional<Customer> getCustomerByName(@PathVariable long id) {
		return service.getCustomerByID(id);
	}
	@RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	public void deleteCustById(long id) {
		service.deleteCustById(id);
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	


	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public void updateCustById(@PathVariable long id, @RequestBody Customer emp) {
		service.updateCustById(id,emp);
	}
}
