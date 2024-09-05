import java.util.Scanner;

class emp {
    String name;
    float salary;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter emp name and salary ");
        name = sc.next();
        salary = sc.nextFloat();
    }

    public void display() {
        System.out.println("emp name is " + name + " salary  is " + salary);
    }
}

class developer extends emp {
    String pname;

    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter project name ");
        pname = sc.next();

    }

    public void display() {
        super.display();
        System.out.println("project name is " + pname);
    }
}

public class slip13q2 {
    public static void main(String[] args) {
        developer obj = new developer();
        obj.accept();
        obj.display();
    }
}
