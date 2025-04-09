package Strings;

public class StringBuilderCapacityEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("Default capacity : " + sb.capacity());

        sb.append("Java");
        System.out.println("After appending capacity : " + sb.capacity());

        /*
            formula :
            (old capacity*2) + 2
         */

        sb.append("is a high-level program");
        System.out.println(sb.capacity()); // (16*2)  + 2 = 32 + 2 => 34

        sb.append("language");
        System.out.println(sb.capacity());
    }
}
