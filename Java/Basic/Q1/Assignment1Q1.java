package student.management.system;

import java.util.Scanner;

public class Assignment1Q1 {
    public static void main(String[] args) {

        ArmstrongOrNot a = new ArmstrongOrNot();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to check : ");
        int number = sc.nextInt();

        System.out.println("The validation for the number " +number +" is " +a.armstrongCheck(number));
    }

}
