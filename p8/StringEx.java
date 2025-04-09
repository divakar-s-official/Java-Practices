package p8;

public class StringEx {
    public static void main(String[] args) {

        /**
         * string-->non--primitive dataType
         * it is immutable(Unchangeable)
         *
         * Initialization can be done in 2 ways:
         * 1.string literal
         * 2.string object
         */

        //1.string literal
        String name="AJ";

        System.out.println("String Literal:"+name);

        //2.string object
        String name1=new String ("AJ");

        System.out.println("String object:"+name1);

        char[] ch={'a','j'};
        String info =new String(ch);//same as 2

        System.out.println("char array to string:"+info);




    }

}
