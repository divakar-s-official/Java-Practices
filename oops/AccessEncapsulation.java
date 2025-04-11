package oops;

public class AccessEncapsulation {


    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Divakar");
        obj1.setRollno(22);
        obj1.setDept("MCA");
        obj1.setCollege("KGISL");
        obj1.setLocation("COIMBATORE");

        System.out.println("Name : " + obj1.getName());
        System.out.println("Rollno : " + obj1.getRollno());
        System.out.println("Department : " + obj1.getDept());
        System.out.println("college : " + obj1.getCollege());
        System.out.println("Location : " + obj1.getLocation());


    }
}
