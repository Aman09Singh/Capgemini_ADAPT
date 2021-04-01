
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FrontController {
	@Autowired
	RestTemplate template;
	@Autowired
	AllServices service;
	
	@RequestMapping(value = "/consume/add", method=RequestMethod.POST)
	public String add(@RequestBody TwoNums tn) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		//long res = service.add(num1, num2);
		HttpEntity <TwoNums> entity = new HttpEntity<TwoNums>(tn,headers);
		return template.exchange("http://localhost:8080/add", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public long check(@RequestBody TwoNums tn) {
		//return tn;
		return service.add(tn.getN1(), tn.getN2());
	}
}
