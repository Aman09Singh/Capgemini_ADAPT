package Collection_Q;

import practice.Employees;

import java.util.Comparator;
import java.util.TreeSet;

public class Assignment3Q1 {

    public static void main(String[] args) {

        // Objects made to be inserted in the TreeSet
        Person ob = new Person("A",150,56);
        Person ob1 = new Person("B",187,75);
        Person ob2 = new Person("C",167,74);
        Person ob3 = new Person("D",154,55);
        Person ob4 = new Person("E",138,48);
        Person ob5 = new Person("F",159,79);
        Person ob6 = new Person("G",174,75);

        //Making TreeSet
        TreeSet<Person> weightComp = new TreeSet<Person>(new WeightComparison());
        weightComp.add(ob);
        weightComp.add(ob1);
        weightComp.add(ob2);
        weightComp.add(ob3);
        weightComp.add(ob4);
        weightComp.add(ob5);
        weightComp.add(ob6);

        for(Person p: weightComp){

            System.out.println(p);
    }

}

static class WeightComparison implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getWeight() == o2.getWeight()){
            if(o1.getHeight() > o2.getHeight()){
                return 1;
            }else{
                return -1;
            }
        }else if(o1.getWeight() > o2.getWeight()){
            return 1;
        }else{
            return -1;
        }
        }
    }
}

