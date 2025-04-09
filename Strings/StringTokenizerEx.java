package Strings;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        /**
         * It allows to break  a string in to tokens
         * It is a legacy class in java
         * It is deprecated now
         */

        StringTokenizer st = new StringTokenizer("Java is a high level language");

        System.out.println("Total no of tokens : "+  st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
