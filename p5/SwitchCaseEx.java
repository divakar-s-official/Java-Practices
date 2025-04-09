package p5;

import java.util.Scanner;

public class SwitchCaseEx {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
       while(true){
           System.out.print("Choose your language : ");
           int cp = userInput.nextInt();

           if (cp == 0) {
               System.out.println("InValid input");
               break;
           } else {
               switch(cp){
                   case 1 :
                       System.out.println("Tamil");
                       break;

                   case 2 :
                       System.out.println("English");
                       break;

                   case 3:
                       System.out.println("Hindi");
                       break;

                   case 4:
                       System.out.println("Arabic");
                       break;

                   default:
                       System.out.println("Invalid input");
               }
           }


       }
    }
}
