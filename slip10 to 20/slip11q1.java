import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class slip11q1 {
    public static void main(String args[]) {

        int arr[] = { 10, 20, 30, 40, 50 };
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        // System.out.println("sorted array is ");
        // for (i = 0; i < arr.length; i++) {
        // Arrays.sort(arr);
        // System.out.println(arr[i] + "");
        // }
        System.out.println("second smallest no is " + arr[1]);
    }

}
