
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControllers {
	
	@RequestMapping("/hello.html")
	public String getHello() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")
    public List getCountries()
    {
        List listOfCountries = new ArrayList();
        listOfCountries=createCountryList();
        return listOfCountries;
    }
 
    @RequestMapping(value = "/country/{id}", method = RequestMethod.GET,headers="Accept=application/json")
    public Country getCountryById(@PathVariable int id)
    {
        List<Country> listOfCountries = new ArrayList();
        listOfCountries=createCountryList();
 
        for (Country country: listOfCountries) {
            if(country.getId()==id)
                return country;
        }
 
        return null;
    }
 
    // Utiliy method to create country list.
    public List createCountryList()
    {
        Country indiaCountry=new Country(1, "India");
        Country chinaCountry=new Country(4, "China");
        Country nepalCountry=new Country(3, "Nepal");
        Country bhutanCountry=new Country(2, "Bhutan");
 
        List listOfCountries = new ArrayList();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry);
        return listOfCountries;
    }

}
