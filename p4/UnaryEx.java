package p4;

public class UnaryEx {
    public static void main(String[] args) {
        int a = 10, b = 8, c;

        //negative
        System.out.println("negative: " + (-a));

        //positive
        System.out.println("positive : " + (+a));

        c =  a++ + ++a + --a - a-- + b++ + --b - --b + ++b + ++a + ++b;
//      c = 10(11) + 12 + 11 - 11(10) + 8(9) + 8 - 7 + 8


        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("The result c is : " + c);

        /*
        * pre-increment  => ++expr
        * post-increment => expr++
        * pre-decrement  => --expr
        * post-decrement => expr--
        * */
    }
}
