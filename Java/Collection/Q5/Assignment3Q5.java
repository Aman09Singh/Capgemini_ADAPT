package Collection;

import java.util.HashMap;
import java.util.Map;

public class Assignment3Q5 {
    public static void main(String[] args) {

        Employee ob = new Employee("Employee 1", 1);
        Employee ob1 = new Employee("Employee 1", 1);


        Map<Employee, String > map = new HashMap<>();

        map.put(ob,"Computer");
        map.put(ob1, "IT");

        for(Employee e : map.keySet()){
            System.out.println(map.get(e).toString());
        }

    }
}
