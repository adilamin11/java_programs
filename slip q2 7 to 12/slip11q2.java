import java.util.Scanner;

abstract class shapes {
    int radius;

    abstract void area(int radius);

    abstract void volume(int radius);
}

class sphere extends shapes {
    public void area(int radius) {
        double a = 4 * 3.14 * radius * radius;
        System.out.println("area of sphere is " + a);
    }

    public void volume(int radius) {
        double v = (4 * 3.14 * radius * radius * radius) / 3;
        System.out.println("volume of sphere is " + v);
    }
}

public class slip11q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of sphere ");
        int radius = sc.nextInt();
        sphere obj = new sphere();
        obj.area(radius);
        obj.volume(radius);
    }
}
