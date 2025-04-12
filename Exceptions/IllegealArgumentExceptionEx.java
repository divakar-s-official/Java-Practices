package Exceptions;

public class IllegealArgumentExceptionEx {
    public static void validateAge(int age){
        if(age<=18){
            throw new IllegalArgumentException("Invalid age");
        }else{
            System.out.println("Age is valid : " + age);
        }
    }

    // exceptions throws through method
    public static int divideNum(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException {

        int res = a / b;
        String[] name = {"python", "java", "Django"};

        System.out.println(name[3]);
        return res;
    }

    public static void main(String[] args) {
        try{
            validateAge(15);
        }catch (IllegalArgumentException e){
            System.out.println("Caught an exception : " + e.getMessage());
        }

        try{
            validateAge(25);
        }catch (IllegalArgumentException e){
            System.out.println("Caught an exception : " + e.getMessage());
        }


        try{
           divideNum(35, 25);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot divided by zero : " +  "\n"+e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of length exception");
            e.printStackTrace();
        }


    }
}
