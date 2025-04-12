package oops.Interface;

public interface ParentInterface1 {
    public void assetsParent1();    // implicitly abstract

    public void propertyParent1();

    default void display(){
        System.out.println("default");
    }

}
