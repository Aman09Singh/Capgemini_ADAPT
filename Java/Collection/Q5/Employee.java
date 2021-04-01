package Collection;

import java.util.Map;

public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(obj == null || obj.getClass()!=this.getClass()){
            return false;
        }

    Employee ee = (Employee) obj;

        return (ee.name.equals(this.name) && ee.id ==this.id);
    }


    @Override
    public int hashCode() {

        return this.id;

    }
}
