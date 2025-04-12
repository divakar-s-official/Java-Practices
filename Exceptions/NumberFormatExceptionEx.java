package Exceptions;

import java.util.Scanner;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {

        //Number format Exception
        int num1 , num2, result ;
        String snum1, snum2 ;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: " );
            snum1 = sc.nextLine();
            System.out.println("Enter the second number: " );
            snum2 = sc.nextLine();
            num1 = Integer.parseInt(snum1);
            num2 = Integer.parseInt(snum2);
            result = num1+num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }
}
