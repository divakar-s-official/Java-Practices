package p3;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = userInput.nextLine();
        System.out.print("Enter your id : ");
        int id = userInput.nextInt();

        userInput.nextLine();

        System.out.print("Enter your address : ");
        String address = userInput.nextLine();

        System.out.print("Enter your department : ");
        String department = userInput.nextLine();

        System.out.print("Enter your work experience : ");
        double exp = userInput.nextInt();

        System.out.println("name : " + name + "\n" + "id : " + id + "\n" + "address : " + address + "\n" + "department : " + department + "\n" + "experience : " + exp);
    }
}
