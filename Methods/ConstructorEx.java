package Methods;

public class ConstructorEx {
    /**
     *
     * => Constructor is a block of code similar to method
     *
     * usage:
     *  =>  It is called when instance of the class is created
     *  =>  At thr time of calling constructor , memory for the object is allocated in the memory
     *  =>  Every time an object is created using new() keyword, at least one constructor is called .
     *
     *  2 types of constructors:
     *  =>  Non parameterized constructor(no-arguments) or default constructor
     *  =>  parameterized constructor(with arguments)
     */

    String location;
    int zipCode;

    public ConstructorEx(){
        System.out.println("Default Constructor");
        location = "coimbatore";
        zipCode = 641029;
    }
    public ConstructorEx(String name, int age){
        System.out.println("Name : "+ name);
        System.out.println("Age : " + age);
    }

    void displayInfo(){
        System.out.println("Location : " + location);
        System.out.println("ZipCode : " + zipCode);
    }
    public static void main(String[] args) {
        ConstructorEx ce = new ConstructorEx();
        ConstructorEx ce1 = new ConstructorEx("Tsunade", 106);

        ce.displayInfo();


    }
}
