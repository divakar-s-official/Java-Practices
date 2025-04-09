package p7;

public class Constants {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

//    Enum is a datatype which contains fixed sets of constants
//    All Enum constants in capital letter
//    Java Enum constants are static and final-implicit


    public static final double PI = 3.14159;

    public void display(){
        int radius  = 4;
        double area = Constants.PI * radius * radius;

        System.out.println("Area of Result : " +  area);
    }
    public static void main(String[] args) {

        Constants obj1 = new Constants();
        obj1.display();


        for(Day d : Day.values()){
            System.out.println(d);
        }

    }
}
