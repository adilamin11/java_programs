import java.util.Scanner;

public class slip19q2 {
    public static void main(String[] args) {
        int age[] = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of family ");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }
        System.out.println("family age is ");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        int eage = age[0];
        int yage = age[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] > eage) {
                eage = age[i];
            }
            if (age[i] < yage) {
                yage = age[i];
            }
        }
        System.out.println("eldest age of family is " + eage);
        System.out.println("youngest age of family is " + yage);
    }

}
