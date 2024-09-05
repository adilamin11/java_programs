import java.util.Scanner;

class person {
    int pid, age;
    String pname, gender;

    person() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the pid ");
        pid = sc.nextInt();
        System.out.println("enter the p age ");
        age = sc.nextInt();
        System.out.println("enter the pname ");
        pname = sc.next();
        System.out.println("enter th p gender ");
        gender = sc.next();

    }

    person(int pid, int age, String pname, String gender) {
        this.pid = pid;
        this.age = age;
        this.pname = pname;
        this.gender = gender;
    }

    void display() {
        System.out.println("the pid is " + pid);
        System.out.println("the age is " + age);
        System.out.println("the p name is " + pname);
        System.out.println("the gender is " + gender);
    }

    public String toString() {
        return " person id " + pid + " person age " + age + " person name " + pname + " person gendr " + gender;
    }
}

public class slip9q2 {
    public static void main(String args[]) {
        int n, i;
        // int age ,pid;
        // String pname,gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of person ");
        n = sc.nextInt();
        person obj[] = new person[n];
        for (i = 0; i < n; i++) {
            obj[i] = new person();
        }
        for (i = 0; i < n; i++) {
            System.out.println(obj[i].toString());
        }
    }

}
