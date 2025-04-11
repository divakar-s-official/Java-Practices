package oops;

public class MethodOverloadingEx {
    public class Me2 {
        int d;

        public void add(int a, int b){
            d = a + b;
            System.out.println("The value of d is : " + d);

        }

        public void add(float a, int b, int c){
            float z = a + b + c;
            System.out.println("The value of d is : " + z);

        }
    }

    public static void main(String[] args) {
        /**
         * //method overloading is a compile time polymorphism
         * 2 ways to overload the method
         * => By changing the number of arguments
         * => By changing the datatype
         */
        MethodOverloadingEx mo = new MethodOverloadingEx();

        MethodOverloadingEx.Me2 inner = mo.new Me2();


        inner.add(10,20);
        inner.add(10.5f,20,30);


    }
}
