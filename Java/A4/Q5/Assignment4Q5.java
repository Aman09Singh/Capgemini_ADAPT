
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) { }

    public static String processWords(List<String> list) {
    	StringBuilder sb = new StringBuilder();
    	Consumer<List<String> > select = lis -> 
        { 
            for (int i = 0; i < lis.size(); i++) {
            	String wor = lis.get(i);
            	sb.append(wor.charAt(0));
            }
                //list.set(i, 2 * lis.get(i)); 
        }; 
        select.accept(list);
        return sb.toString();
    }
}