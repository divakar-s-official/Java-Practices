package p5;

import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);

        System.out.print("Enter your name : ");

        String name = userInput.nextLine();

        System.out.print("Enter your age : ");

        int age = userInput.nextInt();


        if(age >= 18){
            System.out.println("you are eligible");
        } else {
            System.out.println("You are not eligible");
        }

    }
}
