package Exceptions;

public class ArrayIndexOutOfBoundExceptionsEx {
    public static void main(String[] args) {
        try {
            //outer block
            int[] numbers = {1, 2, 3};
            int a = numbers[8];
            System.out.println("The value of a is : " + a);

            try {
                int b = numbers[3];
                System.out.println("The value of b is : " + b);

            } catch (ArrayIndexOutOfBoundsException e) {
                // inner catch block
                System.out.println("Inner block exception caught :" + e.getMessage());
                e.getMessage();
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            // outer catch block
            System.out.println("outer block exception caught :" + e.getMessage());
            e.getMessage();
        }
    }
}
