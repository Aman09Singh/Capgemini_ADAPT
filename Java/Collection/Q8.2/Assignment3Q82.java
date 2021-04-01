import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
    	list.add(12);
    	list.add(10);
    	list.add(5);
    	Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer num = (Integer)itr.next(); 
            System.out.println(num);
                list.add(14); 
        } 
    	
    	return list;
    }
    public static void main(String args[]) {
    	CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<Integer>();
    	CopyOnWriteArrayList<Integer> list2 = failFast(list1);
    	
    	Iterator itr = list2.iterator(); 
        while (itr.hasNext()) { 
            Integer num = (Integer)itr.next(); 
            System.out.println(num);
                 
        } 
    }
}