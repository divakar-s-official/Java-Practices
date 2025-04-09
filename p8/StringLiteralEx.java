package p8;

import java.util.Locale;

public class StringLiteralEx {
    public static void main(String[] args) {
        String s1 = "Hello";

        System.out.println(s1);
        String s2 = "Hello";

        System.out.println(s2);

        String s3 = "World";

        System.out.println(s3);

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        String s4 = s1+s3;

        s1 = s1 + s3;

        System.out.println(s1==s2);

        System.out.println(s1 == s4);

        System.out.println(s1.length());

        System.out.println(s1.toUpperCase());

        System.out.println(s1.toLowerCase());
    }
}
