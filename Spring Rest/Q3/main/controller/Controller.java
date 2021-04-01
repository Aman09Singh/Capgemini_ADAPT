
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@RequestMapping(value = "/country/{zipcode}", method = RequestMethod.GET,headers="Accept=application/json")
    public CountryModel getCountryById(@PathVariable int zipcode){
        List<CountryModel> listOfCountries = new ArrayList();
        listOfCountries=createCountryList();
 
        for (CountryModel country: listOfCountries) {
            if(country.getZipcode()==zipcode)
                return country;
        }
 
        return null;
    }
	@RequestMapping("/getCountry")
	public CountryModel getCountry(@RequestParam("code") String zcode) {
		long zipcode = Integer.parseInt(zcode);
		List<CountryModel> listOfCountries = new ArrayList();
        listOfCountries=createCountryList();
 
        for (CountryModel country: listOfCountries) {
            if(country.getZipcode()==zipcode)
                return country;
        }
 
        return null;
	}
	
	public List createCountryList(){
	        CountryModel c1=new CountryModel(500124, "Mumbai","Delhi","India");
	        CountryModel c2=new CountryModel(265622, "London","Woschestershire", "Japan");
	        CountryModel c3=new CountryModel(199522, "New York","Maryland", "US");
	        CountryModel c4=new CountryModel(651652, "tokyo","Kyoto", "japan");
	 
	        List<CountryModel> listOfCountries = new ArrayList();
	        listOfCountries.add(c1);
	        listOfCountries.add(c2);
	        listOfCountries.add(c3);
	        listOfCountries.add(c4);
	        return listOfCountries;
	}
}
