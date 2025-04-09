import java.util.Scanner;
import p1.Demo;
public class Main {
    static int a = 10; // static variable

    static void display(){
        double d = 56.0145;  // local variable
        System.out.println("Double value :" + d);
    }

    public int value(){
        int c = 20;
        System.out.println("concrete method");
        System.out.println(c);
        return 20;
    }


    public static void main(String[] args) {

        System.out.println(a);
        int output = session_01.name();
        System.out.println(output);

        display();
        Main m1 = new Main();
        m1.value();
        /*
         * Non-static method or variables need to access through object of the class
         * if it's been declared in same class or another class
         *
         * ----> static method or variable can be access directly it its inside the class
         *
         * -----> if static method or variable declared in another class means need through access class name
         *------> static method and variable can be accessed through objects but its shows warning
         * */
        session_01 se = new session_01();
        se.friend();


        Demo.age();

        int output1 = Demo.age();

        System.out.println(output1);

        String returnedVal = Demo.n();
        System.out.println(returnedVal);
        }
    }