package WrapperClass;

public class WrapperClassEx {
    public static void main(String[] args) {
        int a = Integer.valueOf(50);
        System.out.println(a);
        Integer intVal = 50;
        Double doubleVal = 36.456789;
        Boolean bval = true;
        Character cval = 'M';

        System.out.println(intVal);
        System.out.println(doubleVal);
        System.out.println(bval);
        System.out.println(cval);

        int d1 = intVal;
        double d2 = doubleVal;
        boolean d3 = bval;
        char d4 = cval;

        System.out.println(d1 + d2);


        System.out.println(d1);

        int reg = Integer.parseInt("4128");

        System.out.println(reg);




    }
}
