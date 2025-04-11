package oops.inheritance.MethodOveriding;

public class PersonRoleOverride extends Person {
    //implicit overriding
    public void in_House(){
        System.out.println("To fulfil the need of their parents");
    }

    public void in_Office(){
        System.out.println("Work as Developer");
    }

    public static void main(String[] args) {
        Person p = new PersonRoleOverride();
        p.in_House();
        p.in_Office();
    }
}
