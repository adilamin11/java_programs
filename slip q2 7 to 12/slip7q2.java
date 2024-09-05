import java.util.Scanner;

class student {
    int roll;
    String name;
    float per;

    student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the roll no ");
        roll = sc.nextInt();
        System.out.println("enter the name ");
        name = sc.next();
        System.out.println("enter the percentage ");
        per = sc.nextFloat();

    }

    student(int roll, String name, float per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    void display() {
        System.out.println("rolll no is " + roll);
        System.out.println("name is " + name);
        System.out.println("percentage is " + per);
    }
}

public class slip7q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the students uhh want ");
        int s = sc.nextInt();
        student obj[] = new student[s];
        for (int i = 0; i < s; i++) {
            obj[i] = new student();
        }
        System.out.println("display studnet details ");
        for (int i = 0; i < s; i++) {
            obj[i].display();
        }
    }
}
