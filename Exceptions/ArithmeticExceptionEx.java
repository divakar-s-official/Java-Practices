package Exceptions;

import java.util.Scanner;

public class ArithmeticExceptionEx {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter the first number:  ");
            long num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            long num2 = sc.nextInt();


            long result = num1 / num2;

//            if(num1==0){
//                throw new Exception("Infinity Error");
//            }

            System.out.println("The result is :" + result);
        } catch (Exception e) {
            System.out.println("Infinity Error Divided by zero error" + e.getMessage());
            e.printStackTrace();
        }




    }
}
