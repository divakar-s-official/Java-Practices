package oops.inheritance.Hierarchical;

public class Child2 extends Parent1{
    public void property(){
        System.out.println("can built small apartment");
    }

    public static void main(String[] args) {
        Parent1 p1 = new Child1();
        Parent1 p2 = new Child2();

        p1.property();
        p2.property();
    }
}
