import java.util.Scanner;

public class slip17q1 {
    public static void main(String args[]) {
        int n, i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factor of number is " + fact);
    }
}
