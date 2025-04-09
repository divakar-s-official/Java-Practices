package p8;

public class StringObjectsEx {
    public static void main(String[] args) {
        String s1 = "Hello";  // string  literal

        String s2 = new String("Hello");  // string object

        String s3 = s2.intern(); // intern methods convert string object into string literal

        System.out.println(s1 == s3);

        System.out.println(s1 == s2);

        System.out.println(s2 == s3);

        System.out.println(s2.equals(s3));

        System.out.println(s1.equals(s3));
    }
}
