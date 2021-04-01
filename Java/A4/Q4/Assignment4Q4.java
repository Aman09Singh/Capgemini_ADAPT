
import java.util.ArrayList;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	employeeList.removeIf(s->(s.length()%2 !=0));
    	return employeeList;
    }
    public static void main(String[] args) {
    	
    }
}