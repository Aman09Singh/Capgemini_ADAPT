package Intermediate;

import java.util.Scanner;

import static java.lang.System.exit;

public class Assignment2Q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Assignment2Q7 ob = new Assignment2Q7();
        int switchA = 0;
        String Owner = "Owner";
        String Customer = "Customer";

        System.out.println("What is your Role? Owner or Customer");
        String Role = sc.nextLine();

        if((Role.equals(Owner))){
            switchA = 1;
        }else if((Role.equals(Customer))){
            switchA = 2;
        }else{
            System.out.println("Enter proper Role");
            exit(0);
        }


        switch (switchA) {

            case 1:
                System.out.println("The Role assigned is Owner");
                Owner objectOwner = new Owner();
                objectOwner.addItems();
                objectOwner.returnAmount();
                break;

            case 2:
                System.out.println("The Role Assigned is Customer");
                Customer customerObject = new Customer();
                customerObject.placeOrder();
                customerObject.getTotalValue();
                break;

            default:
                exit(0);

        }
    }

}
