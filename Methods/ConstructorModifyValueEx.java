package Methods;

public class ConstructorModifyValueEx {
    private String name;
    private int age;


    public ConstructorModifyValueEx(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;

    }

    public void displayInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
    public static void main(String[] args) {
        ConstructorModifyValueEx cmve = new ConstructorModifyValueEx("Hinata", 20);
        System.out.println("Initial displayInfo");
        cmve.displayInfo();

        cmve.setName("sasuke");
        cmve.setAge(21);
        System.out.println("After modification");
        cmve.displayInfo();



    }
}
