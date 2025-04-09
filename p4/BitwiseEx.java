package p4;

public class BitwiseEx {
    public static void main(String[] args) {
        int a = 5, b = 3;

        /*
        * Binary ---> 0 and 1
        *
        * 8 4 2 1
        *
        * 0 1 0 1 ==> 5
        * 0 0 1 1 ==> 3
        *
        * 16 8 4 2 1 ==> hexa ==> 16 bit
        *
        * 32 16 8 4 2 1 ==> 32 bit
        *
        * 64 32 16 8 4 2 1 ==> 64 bit
        *
        *   Formula ==> - ( n + 1)
        *   0 1 0 1 => 5
        *   0 0 0 1 => 1
        *
        *
        *
        *
        * XOR
        * operand1  operand2   output(operand1 ^ operand2)
        *   0           0          0
        *   0           1          1
        *   1           0          1
        *   1           1          0
        * */

        System.out.println("Bitwise OR : " + (a|b));
        System.out.println("Bitwise AND: " + (a&b));
        System.out.println("Bitwise NOT: " + (~a));
        System.out.println("Bitwise XOR: " + (a ^ b));

    }

}
