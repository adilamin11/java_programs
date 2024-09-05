
import java.util.Scanner;

class Student {
    int rollno, age;
    String name, course;

    Student() {
        Scanner sx = new Scanner(System.in);
        System.out.println("enter roll no ");
        rollno = sx.nextInt();
        System.out.println("enter the age ");
        age = sx.nextInt();
        System.out.println("enter the name ");
        name = sx.next();
        System.out.println("enter the course ");
        course = sx.next();
    }

    Student(int rollno, int age, String name, String course) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("roll no is " + rollno);
        System.out.println("age is " + age);
        System.out.println("name is " + name);
        System.out.println("course is " + course);
    }
}

class invalidrollno extends Exception {
    public String toString() {
        return "invalid rollno ";
    }

}

public class slip10q2 {
    public static void main(String[] args) throws invalidrollno {
        int rollno, age;
        String name, course;
        Student obj = new Student();
        try {
            if (obj.rollno < 13001 || obj.rollno > 13080) {
                throw new invalidrollno();

            } else {
                System.out.println("display students deatils ");
                obj.display();
            }
        } catch (Exception e) {
            System.out.println("exception occur" + e);
        }
    }

}