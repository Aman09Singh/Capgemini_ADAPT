package student.management.system;

import java.util.Scanner;

public class ArmstrongOrNot {

    public boolean armstrongCheck(int num){

        int number = num;

        int flag = number; int sum =0;

        while(number > 0){

            int a = number%10;
            sum += a*a*a;
            number /= 10;
        }

        if(flag == sum){
            return true;
        }else{
            return false;
        }
    }
}
