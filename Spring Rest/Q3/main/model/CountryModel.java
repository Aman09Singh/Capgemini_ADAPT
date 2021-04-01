
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CountryModel {
	private long zipcode;
	private String state;
	private String city;
	private String country;
	public CountryModel() {
	
	}
	public CountryModel(long zipcode, String state, String city, String country) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	@JsonIgnore
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "CountryModel [zipcode=" + zipcode + ", state=" + state + ", city=" + city + ", country=" + country
				+ "]";
	}
	
	
}
