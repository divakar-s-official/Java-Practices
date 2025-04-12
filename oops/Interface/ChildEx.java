package oops.Interface;

public class ChildEx implements ParentInterface1,ParentInterface2 {
    @Override
    public void assetsParent1() {
        System.out.println("parent 1 asset");
    }

    @Override
    public void propertyParent1() {
        System.out.println("parent 1 property");
    }

    @Override
    public void assetsParent2() {
        System.out.println("parent 2 asset");
    }

    @Override
    public void propertyParent2() {
        System.out.println("parent 2 property");
    }


    public static void main(String[] args) {
        ChildEx ce = new ChildEx();

        ce.assetsParent1();
        ce.propertyParent1();
        ce.assetsParent2();
        ce.propertyParent2();
        ce.display();

    }
}