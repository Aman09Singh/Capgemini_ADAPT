package LambdaExercises;

import javax.management.OperationsException;

public class Assignment4Q1 {

    public static void main(String[] args) {

        int varA = 10;
        int varB = 4;

        Operation addition  = (int a, int b) -> (a+b);
        System.out.println("On Addition :" +addition.operation(varA,varB));

        Operation subtraction = (int a, int b) -> (a-b);
        System.out.println("On Subtraction :" + subtraction.operation(varA,varB));

        Operation multiplication = (int a, int b) ->(a*b);
        System.out.println("On Multiplication :" +multiplication.operation(varA, varB));

        Operation division = (int a, int b) -> (a/b);
        System.out.println("On Division :" +division.operation(varA, varB));


    }

}

interface Operation{

    int operation(int a, int b);
}