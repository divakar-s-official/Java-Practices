package p2;

import java.util.Scanner;

public class ArithmeticEx {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String c;


        while(true){
            System.out.println("Do you want to still continue.....");
            c = userInput.nextLine();
            if(c.equalsIgnoreCase("yes")) {

                System.out.print("Enter the value of a : ");
                int a = userInput.nextInt();

                System.out.print("Enter the value of b : ");
                int b = userInput.nextInt();

                if(a==0 && b==0){
                    System.out.println("Exited the program");
                    break;
                }



                //BODMAS rule follows
                System.out.println("Addition : " + (a + b) );
                System.out.println("Subtraction : " + (a-b));
                System.out.println("Multiplication : " + (a*b));

                System.out.println(" : " + (a-b));
                if(a == 0 || b == 0 ){
                    System.out.println("Infinity error");
                    continue;
                }
                System.out.println("Division : " + (a / b));

                System.out.println("Modulus : " + (a%b));

            }
                else {
                    break;
            }

        }



        }
    }

