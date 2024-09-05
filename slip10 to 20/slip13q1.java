import java.util.Arrays;

public class slip13q1 {
    public static void main(String args[]) {

        int arr[] = new int[3];
        System.out.println("array elemnt ");
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            System.out.println(arr[i] + " ");

        }
        System.out.println("sorted array ");
        for (int i = 0; i < args.length; i++) {
            Arrays.sort(arr);
            System.out.println(arr[i] + " ");
        }
    }

}
