import java.util.Scanner;

abstract class order {
    int mid;
    String desc;

    abstract void accept();

    abstract void display();
}

class purchaseOrder extends order {
    String cname;

    void accept() {
        Scanner dc = new Scanner(System.in);
        System.out.println("enter the member id ");
        mid = dc.nextInt();
        System.out.println("enter the m dec ");
        desc = dc.next();
        System.out.println("enter the c name ");
        cname = dc.next();
    }

    void display() {
        System.out.println("mem id is " + mid);
        System.out.println("m dec is " + desc);
        System.out.println("c name is " + cname);
    }
}

public class slip14q2 {
    public static void main(String[] args) {
        purchaseOrder obj[] = new purchaseOrder[3];
        for (int i = 0; i < 3; i++) {
            obj[i] = new purchaseOrder();
            obj[i].accept();
        }
        for (int i = 0; i < 3; i++) {
            obj[i].display();
        }
    }
}
