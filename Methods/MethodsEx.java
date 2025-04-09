package Methods;

public class MethodsEx {


    /**
     *
     * Syntax: user-defined
     * public int sum(int a,int b)
     * {
     *     // method body
     * }
     *
     * public int sum(int a, int b) => method Header
     * public  => Access Specifier
     * int => Return type
     * Sum => Method Name
     * (int a, int b) => parameter List
     * sum(int a, int b) => method signature
     *
     * Note:
     * -> If value passed means it's called arguments
     * -> If the value passed for the arguments it's called parameter
     */

    String name;
    int rollNo;

    void display(){ // non parameterized method
        System.out.println("<===== Default method =====>");
        System.out.println("name : " + name);
        System.out.println("rollNo : " + rollNo);
    }

    void print(String name, int rollNo){ // parameterized method
        System.out.println("<===== parameterized method =====>");
        System.out.println("name : " + name);
        System.out.println("rollNo : " + rollNo);
    }


    public static void main(String[] args) {
        MethodsEx me = new MethodsEx();
        me.display();
        me.print("Tsunade",106);

    }
}
