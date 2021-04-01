package Collection;

import practice.Assignment2Q2;

import java.util.HashMap;

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> hm, String empName){

        HashMap<DateClass, String> newMap = new HashMap<>();
        newMap.putAll(hm);
        boolean ab = false;
        ab = hm.containsValue(empName);
        if(ab == false){
            return "No Value as Such";
        }else{
            return "Found";
        }

    }



    public static void main(String[] args) {

    DateClass ob = new DateClass(1,5,1983);
    DateClass ob1 = new DateClass(2,8,1993);
    DateClass ob2 = new DateClass(7,2,2000);
    DateClass  ob3 = new DateClass(23,6,2012);

    HashMap<DateClass, String> mapKey = new HashMap<>();
    Assignment3Q4 object = new Assignment3Q4();

    mapKey.put(ob, "Employee1");
    mapKey.put(ob1, "Employee2");
    mapKey.put(ob2, "Employee 3");
    mapKey.put(ob3, "Employee 4");

    String answer = object.getEmployee(mapKey,"Employee 3");

    System.out.println(answer);

    }
}
