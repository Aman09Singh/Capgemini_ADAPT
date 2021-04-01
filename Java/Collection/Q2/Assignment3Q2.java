package Collection_Q;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
//Hash Set is Unordered and LinkedHashSet is Ordered
public class Assignment3Q2 {



  public static void main(String[] args){

    //to add data in HashSet
    HashSet<String> ob = new HashSet<String>();
    ob.add("Object Add 1");
    ob.add("Object Add 2");
    ob.add("Object Add 3");
    ob.add("Object Add 4");
    ob.add("Object Add 5");
    //Calling function unordered
    HashSet<String> ob1 = new HashSet<String>();
    ob1 = unordered(ob);

    System.out.println("Output for Unordered HashSet");

    Iterator<String> it1 = ob1.iterator();
    while(it1.hasNext()){
      System.out.println(it1.next());
    }
    System.out.println("Order is not preserved, HashSet is unordered");
    System.out.println("=====================================");
    System.out.println("\n\n Output location for Ordered LinkedHashSet");
    //Code for ordered linkedHashset
    LinkedHashSet<String> lob = new LinkedHashSet<String>();
    lob.add("Linked Value 1");
    lob.add("Linked Value 2");
    lob.add("Linked Value 3");
    lob.add("Linked Value 4");
    lob.add("Linked Value 5");

    //calling function for ordered
    LinkedHashSet<String> lob2 = new LinkedHashSet<String>();
    lob2 = ordered(lob);

    Iterator<String> it2 = lob2.iterator();
    while(it2.hasNext()){
      System.out.println(it2.next());
    }

    System.out.println("Order Preserved, LinkedHashSet");
  }

  public static LinkedHashSet ordered(LinkedHashSet linkedHashSet){
  return linkedHashSet;
  }

  public static HashSet unordered(HashSet hashSet){
    return hashSet;
  }

}
