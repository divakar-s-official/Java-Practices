package Methods;

public class ConstructorOverLoadingEX {
    private String name;
    private int reg_no;
    private String location;

    public ConstructorOverLoadingEX(String name, int regNo, String location){
        this.name = name;
        this.reg_no = regNo;
        this.location = location;
    }

    public void displayInfo(){
        System.out.println("Name :" + this.name);
        System.out.println("Reg-No : "+ this.reg_no);
        System.out.println("Location :" + this.location);
    }

    public ConstructorOverLoadingEX(String name, String location){
        this(name, 0, location); // this is to call another constructor
    }

    public ConstructorOverLoadingEX(String name, int regno){
        this(name, regno, null); // this is to call another constructor
    }



    public static void main(String[] args) {
        ConstructorOverLoadingEX col = new ConstructorOverLoadingEX("Tsunade", 106, "leaf village");
        ConstructorOverLoadingEX col1 = new ConstructorOverLoadingEX("Luffy", 18, "Grand Line");
        col.displayInfo();
        System.out.println("<================================================================================>");
        col1.displayInfo();


    }
}
