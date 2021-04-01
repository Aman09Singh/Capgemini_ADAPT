
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	ServiceClass service;
	
	@RequestMapping(value="/placeOrder", method=RequestMethod.POST)
	public void placeOrder(@RequestBody Orders orders) {
		service.placeOrder(orders);
	}
	
	@RequestMapping(value="/updateOrder/{id}",method=RequestMethod.PUT)
	public void updateOrder(@PathVariable String id, @RequestBody Orders order) {
		service.updateOrder(id, order);
	}
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	public Optional<Orders> viewOrder(@PathVariable String id) {
		return service.viewOrder(id);
	}
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Orders> viewOrders() {
		return service.viewOrders();
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteOrder(@PathVariable String id) {
		service.deleteOrder(id);
	}
}
