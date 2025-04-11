package Methods;

public class CopyConstructorEx {
    /**
     * There are no copy constructor in java
     * However , we can copy the values from one object to another object like the copy constructor in c++
     *
     */

    private String name;
    private int age;


    private  CopyConstructorEx(String name,int age){
        this.name = name;
        this.age = age;
    }

    public CopyConstructorEx(CopyConstructorEx other){
        this.name = other.name;
        this.age = other.age;
    }

    public void displayInfo(){
        System.out.println("name : " + name + " , " + "Age : " + age);
    }
    public static void main(String[] args) {
        CopyConstructorEx original = new CopyConstructorEx("Tsunade", 24);
        CopyConstructorEx copy = new CopyConstructorEx(original);
        System.out.println("<=========original data=========>");
        original.displayInfo();
        System.out.println("<=================copied data======================>");
        copy.displayInfo();
    }
}
