package p6;

import java.util.Scanner;

public class NestedForLoopEx {
    public static void main(String[] args) {
        // pattern 1
        /*
        for(int i = 1; i<=5; i++){
            System.out.print(i + " : ");
            for (int j = 1; j<=5; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        System.out.println(" ");

         */

        // pattern 2

//        for(int i = 1; i<=5; i++){
//            for (int j = 1; j<i+1; j++){
//                System.out.print("* ");
//
//            }
//
//            System.out.println();
//
//
//
//        }

        // pattern 3 => inverted right angled triangle

        int num = 5;
        for(int i = 0; i<=num; i++){
            for(int j = 1; j < num - i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        //Diamond

        Scanner userInput = new Scanner(System.in);

        while(true){
            System.out.print("Enter the no of rows : ");
            int rows = userInput.nextInt();
            // top half of the diamond
            if(rows == 0){
                System.out.println("invalid input");
                break;
            }
            for(int i = 1; i <= rows; i++){
                // print leading spaces
                for(int j = i; j<rows; j++){
                    System.out.print(" ");
                }

                //print stars
                for(int k = 1; k<= (2*i-1); k++){
                    System.out.print("*");
                }
                System.out.println();
            }

            //bottom half of the diamond
            for(int i = rows - 1; i >= 1; i--){
                // print leading spaces
                for(int j = i; j<rows; j++){
                    System.out.print(" ");
                }

                //print stars
                for(int k = 1; k<= (2*i-1); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
