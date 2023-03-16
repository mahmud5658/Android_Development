package array;

// print the basic  array element using  java
public class ArrayUtil {
    public static void printArray(int[] array) {
        int n = array.length; // calculate length of the array
        for (int j : array) {  // use for each loop
            System.out.println(j + " ");
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 20, 30, 40, 50}); // passing an array
    }
}
