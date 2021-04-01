package Intermediate;

import java.util.Scanner;

public class Customer {

    public String Unit;
    public int unitQuantity;
    public int totalCost = 0;
    int arr[] = new int[3];

    public Customer() {

        totalCost = 0;
    }

    Scanner sc = new Scanner(System.in);

    IceCream ob = new IceCream();
    Candy obj = new Candy();
    Cookie object = new Cookie();

    public void placeOrder() {

        System.out.println("Hello Customer");

        System.out.println("Enter the amount of IceCream order. Put 0 is no order of iceCream");
        unitQuantity = sc.nextInt();
        ob.orderUnits(unitQuantity);
        arr[0] = unitQuantity;
        //value has been reduced from the child class


        System.out.println("Enter the amount of Candy. Put 0 if no order of Candy");
        unitQuantity = sc.nextInt();
        obj.orderUnits(unitQuantity);
        arr[1] = unitQuantity;


        System.out.println("Enter the amount of Cookie you want. Put 0 if no order of Cookie");
        unitQuantity = sc.nextInt();
        object.orderUnits(unitQuantity);
        arr[2] = unitQuantity;

    }
    public void getTotalValue(){
        System.out.println("The overall value of the order placed by the customer is");
        totalCost = ob.getCost(arr[0]) + obj.getCost(arr[1]) + object.getCost(arr[2]);
        System.out.println("The total Cost of the order is " +totalCost);
    }
}
