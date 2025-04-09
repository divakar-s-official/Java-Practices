
package p6;
import java.util.Arrays;
public class ArrayEx {
    public static void main(String[] args) {
        int [] ar = new int[5];

        ar[0] = 20;
        ar[1] = 10;
        ar[2] = 50;
        ar[3] = 30;
        ar[4] = 40;



        Arrays.sort(ar);

        System.out.println("sorted : " + Arrays.toString(ar));

        int[] copiedAr = Arrays.copyOf(ar, 6);


        System.out.println(ar.length);
        System.out.println(copiedAr.length);


        System.out.println("equals checking : " + Arrays.equals(ar, copiedAr));



        String[][] code = {{"Html", "CSS"}, {"Bootstrap", "Tailwind"}};

        try {
            code[0][0] = "AI";  // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("memory exceeded");
        }
        System.out.println(code[0][0]);


//        fill(arrayName,  sourceIndex , destinationIndex, value-to-be-fill)

        Arrays.fill(ar, 0, 2, 70);
        System.out.println("Arrays fill : " + Arrays.toString(ar));

        // binary search

        // this will only work after sorting the values

        int index = Arrays.binarySearch(ar, 30);

        System.out.println("Binary search : " + index);


        int[] copyRange = Arrays.copyOfRange(ar, 0, 2);

        System.out.println("copying original elements using range : " + Arrays.toString(copyRange));


        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = {1,2,3,4,5};

        boolean result = Arrays.equals(ar1, ar2);

        System.out.println("comparing two arrays values using equals method : " + result);



        // cloning arrays

        int[] cloneAr = ar2.clone();

        System.out.println("cloneAr : " + Arrays.toString(cloneAr));




    }
}

