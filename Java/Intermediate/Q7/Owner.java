package Intermediate;

import java.util.Scanner;

public class Owner {

    public int Unit;
    public String items;
    Scanner sc = new Scanner(System.in);


    IceCream ob = new IceCream();
    Candy ob1 = new Candy();
    Cookie ob2 = new Cookie();


    // add number of items in classes
    public void addItems() {

        System.out.println("Enter the item Name that you want to enter");
        items = sc.nextLine();

        if (items.equals("IceCream")) {

            System.out.println("Enter the amount of IceCream Units that you want to add");
            Unit = sc.nextInt();
            System.out.println("The number of units before updating is" + ob.numberUnits);
            ob.updateUnits(Unit);

        } else if (items.equals("Candy")) {

            System.out.println("Enter the amount of Candy Units that you want to add");
            Unit = sc.nextInt();
            System.out.println("The number of units before updating is" + ob1.numberUnits);
            ob1.updateUnits(Unit);

        } else if (items.equals("Cookie")) {

            System.out.println("Enter the amount of Cookie Units that you want to add");
            Unit = sc.nextInt();
            System.out.println("The number of units before updating is " + ob2.numberUnits);
            ob2.updateUnits(Unit);
        }

    }

    public void returnAmount(){
        System.out.println("IceCream left" );
        ob.getNumberOfItems();
        System.out.println("Candy left" );
        ob1.getNumberOfItems();
        System.out.println("Cookies left" );
        ob2.getNumberOfItems();

    }

}
