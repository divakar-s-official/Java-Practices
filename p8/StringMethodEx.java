package p8;

import java.util.Scanner;

public class StringMethodEx {
    public static void main(String[] args) {
/*
        Scanner scan =  new Scanner(System.in);

        String name = "Admin";
        String password = "@Admin123";
        System.out.print("Enter you Login UserName : ");
        String LoginUserName = scan.next();
        System.out.print("Enter your Login Password : ");
        String LoginPassword = scan.next();

        if(LoginUserName.equals(name)  && LoginPassword.equalsIgnoreCase(password)){
            System.out.println("Logged in");
        } else {
            System.out.println("Logged out");
        }
*/
        String val1 = new String("Welcome to the java program");

        char res = val1.charAt(5);

        System.out.println(res);


        //toCharArray

        char[] ch1 = new char[30];

        val1.getChars(0, 15, ch1, 2);

        System.out.println("charAr : " + ch1[6]);

//        String val1 = new String("Welcome to the java program");
        char[] ch2 = val1.toCharArray();
        System.out.println(ch2);
        for(char c1 : ch2){
            System.out.println("looping string to converted in a toCharArray : " +c1);
        }

        //substring
        System.out.println("substring : " + val1.substring(4));
        System.out.println("substring : " + val1.substring(4, 10));

        //split
        //jdk 1.4

        String code = "object oriented programming language";
        String[] charr = code.split("\\s");
        System.out.println(charr[0]);
        for (String d1 : charr){
            System.out.println(d1);
        }

        // join
        String para = String.join("-","java", "program");
        System.out.println(para);

        //trim
        String val5 = "                       Hello";
        System.out.println("trimmed values  : " + val5.trim());


        // compare To
        String y1 = "Hello";
        String y2 = "Hello";

        System.out.println(y1.compareTo(y2));



    }
}

