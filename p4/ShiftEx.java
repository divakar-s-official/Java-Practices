package p4;

public class ShiftEx {
    public static void main(String[] args) {
        System.out.println(5>>2); //Right shift => formula => 5 / 2 ^ 2 => 5 / 4 = 1
        System.out.println(35<<2); //Left shift  => formula => 5 * 2 ^ 2 => 5 * 4 = 20


        /*
        * 5 => 0101
        * 5>>2
        * => 0 1 0 1
        * => 0 0 1 0 => 1st shift
        * => 0 0 0 1 => 2nd shift
        * => 8 4 2 1 => 1
        *
        * 5<<2
        * => 0      0 1 0 1
        * => 0      1 0 1 0 => 1st shift
        * => 1      0 1 0 0 => 2nd shift
        * => 16     8 4 2 1 => 20
        *
        * */
    }
}
