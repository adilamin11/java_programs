import java.util.Scanner;

interface operation {
    static final double pi = 3.142;

    void area();

    void volume();

}

class circle implements operation {
    int r, h;

    circle(int r, int h) {
        this.h = h;
        this.r = r;
    }

    public void area() {
        System.out.println("area of circle " + pi * r * r);
    }

    public void volume() {
        System.out.println("volume of circle " + pi * r * r * h);
    }
}

public class slip12q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, h;
        System.out.println("enter the radius");
        r = sc.nextInt();
        h = sc.nextInt();
        operation obj = new circle(r, h);
        obj.area();
        obj.volume();
    }
}