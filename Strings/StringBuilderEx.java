package Strings;

public class StringBuilderEx {
    public static void main(String[] args) {
      //  StringBuilder sb = new StringBuilder("Hello"); // faster
        StringBuffer sb = new StringBuffer("Hello"); // Delay

        //Append
        sb.append("World");

        System.out.println("After append : " + sb);

        sb.insert(5, "Diva");
        System.out.println("After insert : " + sb);

        sb.replace(1,4, "Hiii");
        System.out.println("After replace : " + sb);

        sb.reverse();
        System.out.println("After reverse : " + sb);

        // contains  => used for debugging ( only works in strings )



        sb.delete(0,10);
        System.out.println("After deletion : " + sb);

        String st = "Java Program";
        System.out.println("Check string present or not : " + st.contains("Pro"));

    }
}
