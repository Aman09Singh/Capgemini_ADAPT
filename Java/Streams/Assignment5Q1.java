import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Fruit{
	private String name;
	private int calories;
	private int price;
	private String color;
	Fruit(){
		
	}
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit{name=" + "'"+name + "'"+", calories=" + calories + ", price=" + price + ", color=" +  "'"+color +"'"+ "}";
	}
	
}
class MySort implements Comparator <Fruit> {

    @Override
    public int compare(Fruit f1, Fruit f2) {
        if(f1.getPrice()<f2.getPrice()) {
        	return 1;
        }else
        	return -1;
    }
}

public class Assignment5Q1 {

    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
    	//Collections.sort(fruits,Collections.reverseOrder());
    	/*List<String> frNames = new ArrayList<>();
    	for(Fruit f:fruits) {
    		frNames.add(f.getName());
    	}
    	Collections.sort(frNames,Collections.reverseOrder());
    	frNames.add("Testing Name for Debug");
    	return frNames;*/
    	ArrayList<Fruit> fs = new ArrayList<>();
    	fs = (ArrayList<Fruit>)fruits.stream().filter(i->i.getCalories()<100)
    			.sorted((f1,f2)->f2.getCalories()-f1.getCalories())
    			.collect(Collectors.toList());
    	fs.stream().sorted();
    	List<String> rList = new ArrayList<String>();
    	fs.stream().forEach(i->{rList.add(i.getName());});
    	return rList;
    }
    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
    	
    	
        List<Fruit> cfruits = new ArrayList<>();
    	
    	cfruits = fruits.stream().sorted((f1,f2)->f1.getColor().compareTo(f2.getColor())).collect(Collectors.toList());
    	
    	return (ArrayList<Fruit>)cfruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
    	ArrayList<Fruit> redFruits;
   
    	List<Fruit> tf = fruits.stream().filter(i->i.getColor().equalsIgnoreCase("Red"))
    	.sorted((f1,f2)->f1.getPrice()-f2.getPrice()).collect(Collectors.toList());
    	redFruits = new ArrayList<>(tf);
    	
    	return redFruits;
    }
    public static ArrayList<Fruit> lowCaloryFruits(ArrayList<Fruit> fruits){
    	ArrayList<Fruit> fs = new ArrayList<>();
    	fs = (ArrayList<Fruit>)fruits.stream().filter(i->i.getCalories()<100)
    			.sorted((f1,f2)->f2.getCalories()-f1.getCalories())
    			.collect(Collectors.toList());
    	fs.stream().sorted();
    	return fs;
    }
    /*public static List<Fruit> colorWiseFruitNames(ArrayList<Fruit> fruits){
    	
    	List<Fruit> cfruits = new ArrayList<>();
    	
    	cfruits = fruits.stream().sorted((f1,f2)->f1.getColor().compareTo(f2.getColor())).collect(Collectors.toList());
    	
    	return cfruits;
    }*/
    public static void main(String[] args) {
    	Fruit f1 = new Fruit("Guava",500,5,"Green");
    	Fruit f2 = new Fruit("Orange",30,10,"Orange");
    	Fruit f3 = new Fruit("Apple",90,6,"Red");
    	Fruit f4 = new Fruit("Soki",160,120,"Red");
    	Fruit f5 = new Fruit("Loki",85,20,"Red");
    	Fruit f6 = new Fruit("Moki",200,50,"Blue");
    	Fruit f7 = new Fruit("Blue Berry",150,15,"Blue");
    	Fruit f8 = new Fruit("Wine Grape",80,10,"Black");
    	ArrayList<Fruit> fruits = new ArrayList<>();
    	fruits.add(f1);
    	fruits.add(f2);
    	fruits.add(f3);
    	fruits.add(f4);
    	fruits.add(f5);
    	fruits.add(f6);
    	fruits.add(f7);
    	fruits.add(f8);
    	//1. LowCaloryFruits and print
    	System.out.println("LowCaloryFruits descending order of their Calories");
    	ArrayList<Fruit> fs = lowCaloryFruits(fruits);
    	fs.stream().forEach(i->System.out.println(i));
    	System.out.println();
    	//sort and print
    	System.out.println("Sorted on Color");
    	ArrayList<Fruit> fs1 = sort(fruits);
    	fs1.stream().forEach(i->System.out.println(i));
    	System.out.println();
    	System.out.println("Filtered Red and sorted on price");
    	ArrayList<Fruit> fs2 = filterRedSortPrice(fruits);
    	fs2.stream().forEach(i->System.out.println(i));
    	System.out.println();
    	
    	System.out.println("Reverse Sorted");
    	List<String> fs4 = reverseSort(fruits);
    	fs4.stream().forEach(i->System.out.println(i));
    	
    }

}
