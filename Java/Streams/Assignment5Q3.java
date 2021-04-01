import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Trader {
    private String name;
    private String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader1{name=" + "'"+name+"'" + ", city=" + "'"+city +"'"+ "}";
	}
    
}

public class Assignment5Q3 {
    public static List<String> printUniqueCities (List <Trader> traders) { 
    	List<String> aCities = new ArrayList<>();
    	List<String> uCities = new ArrayList<>();
    	traders.stream().forEach(i->aCities.add(i.getCity()));
    	uCities = aCities.stream().distinct().collect(Collectors.toList());
    	return uCities;
    }

    public static List<String> trader2sFromPuneSortByName(List<Trader> traders) {
    	List<String> puneTraders = new ArrayList<>();
    	traders.stream().filter(i->i.getCity().equalsIgnoreCase("Pune")).forEach(i->puneTraders.add(i.getName()));
    	puneTraders.stream().sorted((t1,t2)->t1.compareTo(t2));
    	return puneTraders;
    	
    }
    public static String allTrader3Names(List<Trader> traders) {
    	List<String> aTraders = new ArrayList<>();
    	
    	traders.stream().forEach(i->aTraders.add(i.getName()));
    	aTraders.stream().sorted((t1,t2)->t1.compareTo(t2));
    	//StringBuilder sb = new StringBuilder();
    	//sb.append(aTraders);
    	String line="";
    	for(String s: aTraders) {
    		line+=s;
    	}
    	return line;
    }
    public static ArrayList<Trader> areAnyTrader4sFromIndore(ArrayList<Trader> traders) {
    	ArrayList<Trader> iTraders = new ArrayList<>();
    	iTraders = (ArrayList<Trader>) traders.stream().filter(i->i.getCity().equalsIgnoreCase("Indore")).collect(Collectors.toList());
    	return iTraders;
    }

    public static void main(String[] args) {}
    
    
    
    
    
      
}


























