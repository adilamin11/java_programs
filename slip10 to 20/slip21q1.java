
import java.util.ArrayList;
import java.util.Scanner;

public class slip21q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("Elements of ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
