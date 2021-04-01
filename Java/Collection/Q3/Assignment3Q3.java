package Collection_Q;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment3Q3 {

    public static void main(String[] args) {

        ArrayList<Integer> ob = new ArrayList<>();
        ob.add(5);
        ob.add(654);
        ob.add(31);
        ob.add(987);
        ob.add(65);
        ob.add(654);
        ob.add(65);

       // ArrayList<Integer> ob1 = new ArrayList<>();


        ListIterator<Integer> it = ob.listIterator();

        System.out.println("This is forward iteration");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("This is backward iteration");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }
}



