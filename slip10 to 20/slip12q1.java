import java.util.Scanner;

public class slip12q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("enter the number ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("number is perfect");
        } else {
            System.out.println("number is not perfect");
        }

    }

}
