
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface getMe{
	public double get(int val);
}
public class Assignment4Q3 {
    static void modifyValue(){ 
    	 double x = 8.9;
        Supplier<Double> randomValue = () -> x + Math.random(); 
  
        System.out.println(randomValue.get()); 
        
        
    }
    
    static void modifyValue(int val,getMe cv) {
    	Supplier<Double> id = ()->(double)val+10;
    	System.out.println(id.get());
    }
    static class Product { 
    	
    	
    }
    static void display() { 
    	Consumer<Integer> display = a -> System.out.println(a);
    	display.accept(20);
    	Function<Integer, Double> half = a -> a / 2.0; 
    	System.out.println(half.apply(10)); 
    	Predicate<Integer> pr = a -> (a > 10);
        System.out.println(pr.test(11));  
    }
    public static void main(String[] args) {
    	modifyValue();
    	modifyValue(5,val->val+10);
    	display();
    }
}