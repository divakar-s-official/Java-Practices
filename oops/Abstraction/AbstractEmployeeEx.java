package oops.Abstraction;

public abstract class AbstractEmployeeEx {

    //concrete method
    public void name(){
        System.out.println("Employee name :  Divakar");

    }
    public void designation(){
        System.out.println("Designation : Web Developer");
    }

    //abstract method
    public abstract void futureDesignation();
}
