
// SLIP1Q1
// public class slipalltry {
// public static void main(String[] args) {
// int a[] = new int[5];
// int i;
// int max = a[0];
// for (i = 0; i < args.length; i++) {
// a[i] = Integer.parseInt(args[i]);
// if (max < a[i]) {
// max = a[i];

// }

// }
// for (i = 0; i < args.length; i++) {
// System.out.println(a[i] + " ");
// }
// System.out.println();
// System.out.println("max number is " + max);
// }
// }
// SLIP1Q2
// class mynumber {
// int num;

// mynumber() {
// num = 0;
// }

// mynumber(int num) {
// this.num = num;
// }

// void isneg() {
// if (num < 0) {
// System.out.println("number is neg ");
// } else {
// System.out.println("not neg");
// }
// }

// void ispos() {
// if (num > 0) {
// System.out.println("num is positive ");
// } else {
// System.out.println("not positive ");
// }
// }

// void isodd() {
// if (num % 2 != 0) {
// System.out.println("number is odd");
// } else {
// System.out.println("num is not odd");
// }
// }

// void iseven() {
// if (num % 2 == 0) {
// System.out.println("num is even ");
// } else {
// System.out.println("not even ");
// }
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// int b;
// b = Integer.parseInt(args[0]);
// mynumber obj = new mynumber();
// System.out.println("call is neg method");
// obj.isneg();
// System.out.println("call is post method");
// obj.ispos();
// System.out.println("caall is odd ");
// obj.isodd();
// System.out.println("call is even ");
// obj.iseven();
// }
// }
// SLIP2q1
// public class slipalltry {
// public static void main(String[] args) {

// int arr[] = { 1, 2, 3, 4, 5, 6, };
// int add = 0, i;
// for (i = 0; i < arr.length; i++) {
// add = add + i;
// }
// System.out.println("addition of array " + add);
// }
// }
// SLIP2Q2
// import java.util.Scanner;

// class product {
// int pid;
// String name;
// int price;

// product() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter pro id ");
// pid = sc.nextInt();
// System.out.println("enter product name ");
// name = sc.next();
// System.out.println("enter pro price ");
// price = sc.nextInt();
// }

// void display() {
// System.out.println("pro id is " + pid);
// System.out.println("pro name is " + name);
// System.out.println("pro price is " + price);
// }

// }

// public class slipalltry {
// public static void main(String[] args) {
// int i;
// product obj[] = new product[5];
// for (i = 0; i < 2; i++) {
// obj[i] = new product();

// }
// int min = obj[0].price;
// for (i = 0; i < 2; i++) {
// if (min > obj[i].price) {
// min = obj[i].price;
// }
// }
// System.out.println("displaying all prodect de");
// for (i = 0; i < 2; i++) {
// obj[i].display();
// }
// System.out.println("displaying min price ");
// for (i = 0; i < 2; i++) {
// if (min == obj[i].price) {
// obj[i].display();
// }
// }
// }
// }
// SLIP3Q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {
// int n, sum = 0, rem;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number ");
// n = sc.nextInt();

// while (n > 0) {
// rem = n % 10;
// sum = sum + rem;
// n = n / 10;
// }
// System.out.println("sum of digit is " + sum);
// }
// }
// SLIP3Q2
// import java.util.Scanner;

// class invlidnumber extends Exception {
// public String toString() {
// return "invalid number ";
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// int i, num, fact = 1;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number ");
// num = sc.nextInt();
// try {
// if (num <= 0) {
// throw new invlidnumber();
// } else {
// for (i = 1; i <= num; i++) {
// fact = fact * i;
// }

// }
// System.out.println("factor of number are " + fact);
// } catch (Exception e) {
// System.out.println("error " + e);
// }
// }
// }
// SLIP4Q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {
// int num, rem, rev = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// num = sc.nextInt();
// while (num > 0) {
// rem = num % 10;
// rev = rev * 10 + rem;
// num = num / 10;
// }
// System.out.println("reverse of number is " + rev);
// }
// }
// SLIP4Q2

// import java.util.Scanner;

// class emp {
// int eid;
// String ename;
// int salary;

// emp() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter emp id ");
// eid = sc.nextInt();
// System.out.println("enter emp name ");
// ename = sc.next();
// System.out.println("enter emp salary ");
// salary = sc.nextInt();

// }

// void display() {
// System.out.println("id is" + eid);
// System.out.println("emp name is " + ename);
// System.out.println("emp salary is " + salary);
// }

// }

// public class slipalltry {
// public static void main(String[] args) {

// int n, max = 0, i;
// Scanner sc = new Scanner(System.in);
// System.out.println("hoe many emp");
// n = sc.nextInt();
// emp obj[] = new emp[n];
// for (i = 0; i < n; i++) {
// obj[i] = new emp();
// if (max < obj[i].salary) {
// max = obj[i].salary;
// }
// }
// System.out.println("display of all ");
// for (i = 0; i < n; i++) {
// obj[i].display();
// }
// System.out.println("dis[lay max salary ]");
// for (i = 0; i < n; i++) {
// if (max == obj[i].salary) {
// max = obj[i].salary;
// obj[i].display();
// }
// }
// }
// }
// SLIP5Q1
// public class slipalltry {
// public static void main(String[] args) {
// int n = 10;
// n = Integer.parseInt(args[0]);
// for (int i = 0; i <= 10; i++) {

// System.out.println(n + "*" + i + "=" + n * i);

// }

// }
// }
// SLIP5Q2
// PENDING
// SLIP6Q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {
// int i, n;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number ");
// n = sc.nextInt();
// for (i = 1; i <= n / 2; i++) {
// if (n % i == 0) {
// System.out.println("facot is " + i);
// }
// }
// }
// }
// SLIP6Q2
// import java.util.Scanner;

// class student {
// int rollno, age;
// String name;
// float per;

// student() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter s rool");
// rollno = sc.nextInt();
// System.out.println("enter name ");
// name = sc.next();
// System.out.println("enter age ");
// age = sc.nextInt();
// }

// student(int rollno, String name, int age) {
// this.rollno = rollno;
// this.name = name;
// this.age = age;
// }

// void display() {
// System.out.println("rolll no is " + rollno);
// System.out.println("name is " + name);
// System.out.println("per is " + age);
// }

// }

// class invalidAge extends Exception {
// public String toString() {
// return "invid age ";
// }
// }

// public class slipalltry {
// public static void main(String[] args) {

// student obj = new student();
// try {
// if (obj.age < 15 || obj.age > 21) {
// throw new invalidAge();
// } else {
// System.out.println("student det");
// obj.display();
// }
// } catch (Exception e) {
// System.out.println("error " + e);
// }
// }
// }
// SLIP7Q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {

// int n, i, sum = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number ");
// n = sc.nextInt();
// for (i = 0; i <= n; i++) {
// sum += i;
// }
// System.out.println("sumf of n " + sum);

// }
// }
// SLIP 7Q2

// import java.util.Scanner;

// class student {
// int rollno;
// String name;
// int per;

// student() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter roll no");
// rollno = sc.nextInt();
// System.out.println("enter name ");
// name = sc.next();

// System.out.println("enter per ");
// per = sc.nextInt();
// }

// student(int rollno, String name, int per) {
// this.rollno = rollno;
// this.name = name;
// this.per = per;
// }

// void display() {
// System.out.println("roll is " + rollno);
// System.out.println("name is " + name);
// System.out.println("per is " + per);
// }
// }

// public class slipalltry {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("enter how many std uhh want ");
// int n = sc.nextInt();
// student obj[] = new student[n];
// for (int i = 0; i < n; i++) {
// obj[i] = new student();
// }
// System.out.println("display details ");
// for (int i = 0; i < n; i++) {
// obj[i].display();
// }
// }
// }
// SLIP8Q1
// public class slipalltry {
// public static void main(String[] args) {
// int i;
// System.out.println("print a to z");
// for (i = 'A'; i <= 'Z'; i++) {
// System.out.printf("%c ", i);
// }
// }
// }
// SLIP8Q2
// import javax.swing.*;
// import java.awt.*;

// public class slipalltry extends JFrame {
// JMenuBar jmr;
// JMenu m1, m2, m3;
// JMenuItem j1, j2, j3;

// slipalltry() {
// this.setVisible(true);
// this.setTitle("adil rather");
// this.setSize(500, 500);
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(new FlowLayout());
// jmr = new JMenuBar();
// this.setJMenuBar(jmr);
// m1 = new JMenu("FILE");
// jmr.add(m1);
// m2 = new JMenu("EDIT");
// jmr.add(m2);
// m3 = new JMenu("view");
// jmr.add(m3);
// j1 = new JMenuItem("new");
// m1.add(j1);
// j2 = new JMenuItem("OPEN");
// m1.add(j2);
// j3 = new JMenuItem("close");
// m1.add(j3);

// }

// public static void main(String[] args) {
// slipalltry obj = new slipalltry();
// }
// }
// SLIP9Q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {
// int age[] = new int[5];
// Scanner sc = new Scanner(System.in);
// System.out.println("enter age of ur family ");

// for (int i = 0; i < age.length; i++) {
// age[i] = sc.nextInt();
// if (age[i] >= 60) {
// System.out.println("member is old ");
// } else if (age[i] >= 20 && age[i] < 60) {
// System.out.println("member young");
// } else {
// System.out.println("member is teen");
// }
// }
// }
// }
// SLIP9Q2
// import java.util.Scanner;

// class person {
// int pid, age;
// String pname, gender;

// person() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter pid ");
// pid = sc.nextInt();
// System.out.println("enter p age ");
// age = sc.nextInt();
// System.out.println("enter pname ");
// pname = sc.next();
// System.out.println("enetr genedr ");
// gender = sc.next();
// }

// person(int pid, int age, String pname, String gender) {
// this.age = age;
// this.pid = pid;
// this.pname = pname;
// this.gender = gender;
// }

// void display() {
// System.out.println("pd is " + pid);
// System.out.println("p age " + age);
// System.out.println("name is " + pname);
// System.out.println("gender is " + gender);
// }

// public String toString() {
// return " person id " + pid + " person age " + age + " person name " + pname +
// " person gendr " + gender;
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// int n, i;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the no of object");
// n = sc.nextInt();
// person obj[] = new person[n];
// for (i = 0; i < n; i++) {
// obj[i] = new person();
// }
// for (i = 0; i < n; i++) {

// System.out.println(obj[i].toString());
// }
// }
// }
// SLIP10Q1

// public class slipalltry {
// public static void main(String[] args) {
// int n, rem, rev = 0;

// n = Integer.parseInt(args[0]);
// while (n != 0) {
// rem = n % 10;
// rev = rev * 10 + rem;
// n = n / 10;
// }
// System.out.println("reverse of number " + rev);
// }
// }
// SLIP10Q2

// import java.util.Scanner;

// class student {
// int rollno, age;
// String name, course;

// student() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter roll no ");
// rollno = sc.nextInt();
// System.out.println("enter age ");
// age = sc.nextInt();
// System.out.println("enter name ");
// name = sc.next();
// System.out.println("enter course ");
// course = sc.next();
// }

// student(int age, int rollno, String name, String course) {
// this.age = age;
// this.name = name;
// this.course = course;
// this.rollno = rollno;
// }

// void display() {
// System.out.println("roll is " + rollno);
// System.out.println("age is " + age);
// System.out.println("name is " + name);
// System.out.println("course is " + course);
// }

// }

// class invalidrollno extends Exception {
// public String toString() {
// return "invalid age ";
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// student obj = new student();
// try {
// if (obj.rollno < 13001 || obj.age > 13080) {
// throw new invalidrollno();
// } else {
// System.out.println("display det ");
// obj.display();
// }
// } catch (Exception e) {
// System.out.println("eroor " + e);
// }
// }
// }
// SLIP11Q1
// public class slipalltry {
// public static void main(String[] args) {
// int i;
// int arr[] = { 10, 22, 3, 34, 55 };
// for (i = 0; i < arr.length; i++) {
// System.out.println(arr[i] + " ");
// }
// System.out.println("second small arary is " + arr[1]);
// }
// }
// SLIP11Q2
// import java.util.Scanner;

// abstract class shapes {
// int radius;

// abstract void area(int radius);

// abstract void volume(int radius);
// }

// class sphere extends shapes {
// public void area(int radius) {
// double a = 4 * 3.14 * radius * radius;
// System.out.println("sphere arae is " + a);
// }

// public void volume(int radius) {
// double v = (4 * 3.14 * radius * radius * radius) / 3;
// System.out.println("spere volume is " + v);
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int radius;
// System.out.println("enter the radius ");
// radius = sc.nextInt();
// sphere obj = new sphere();
// obj.area(radius);
// obj.volume(radius);
// }
// }
// SLIP12Q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n, i, sum = 0;
// System.out.println("enter the number ");
// n = sc.nextInt();
// for (i = 1; i < n; i++) {
// if (n % i == 0) {
// sum = sum + 1;
// }
// }
// if (sum == n) {
// System.out.println("num is perfect");
// } else {
// System.out.println("not a perfect");
// }
// }
// }
// SLIP12Q2
// tryed
// SLIP13Q1
// tred
// SLIP13Q2
// import java.util.Scanner;

// class emp {
// String name;
// float salary;

// public void accept() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter name ");
// name = sc.next();
// System.out.println("enter salary ");
// salary = sc.nextFloat();
// }

// public void display() {
// System.out.println("name " + name + "salary" + salary);
// }
// }

// class developer extends emp {
// String prname;

// public void accept() {
// super.accept();
// Scanner sc = new Scanner(System.in);
// System.out.println("enter project name ");
// prname = sc.next();

// }

// public void display() {
// super.display();
// System.out.println("project name is " + prname);
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// developer obj = new developer();
// obj.accept();
// obj.display();
// }
// }
// SLIP14Q1
// class trackobjects {
// static int count;

// public trackobjects() {
// count++;
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// trackobjects obj = new trackobjects();
// trackobjects obj1 = new trackobjects();
// trackobjects obj2 = new trackobjects();
// System.out.println("total objects " + trackobjects.count);
// }

// }
// SLIP14Q2
// import java.util.Scanner;

// abstract class order {
// int id;
// String dec;

// abstract void accept();

// abstract void display();

// }

// class purchaseOrder extends order {
// String cname;

// void accept() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter id ");
// id = sc.nextInt();
// System.out.println("enter dec");
// dec = sc.next();
// System.out.println("enter cname");
// cname = sc.next();
// }

// void display() {
// System.out.println("id is " + id);
// System.out.println("dec is " + dec);
// System.out.println("c name is " + cname);
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// purchaseOrder obj[] = new purchaseOrder[3];
// for (int i = 0; i < 3; i++) {
// obj[i] = new purchaseOrder();
// obj[i].accept();
// }
// for (int i = 0; i < 3; i++) {
// obj[i].display();
// }

// }
// }
// SLIP16Q1
// public class slipalltry {
// public static void main(String[] args) {
// int add = 0;
// int arr[] = { 1, 2, 3, 4, 5 };
// for (int i = 0; i < arr.length; i++) {
// add = add + i;
// }
// System.out.println("addition id " + add);
// }
// }
// slip16q2
// pending
// slip17q1
// public class slipalltry {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int i, fact = 1;
// System.out.println("enter the numbe r");
// int n = sc.nextInt();
// for (i = 1; i <= n; i++) {
// fact = fact * i;
// }
// System.out.println("factor of numbe r" + fact);
// }
// }
// SLIP17Q2
// import javax.swing.*;
// import java.awt.*;

// public class slipalltry extends JFrame {
// JLabel l1, l2;
// JTextField t1;

// JPasswordField p1;
// JButton b1, b2;

// slipalltry() {
// setVisible(true);
// setTitle("adil bahii");
// setSize(500, 500);
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setLayout(null);
// l1 = new JLabel("user name ");
// l1.setBounds(20, 20, 80, 30);
// this.add(l1);
// l2 = new JLabel("passwprd ");
// l2.setBounds(20, 60, 60, 40);
// this.add(l2);
// t1 = new JTextField(100);
// t1.setBounds(110, 20, 80, 30);
// this.add(t1);
// p1 = new JPasswordField(100);
// p1.setBounds(110, 60, 100, 30);
// this.add(p1);
// b1 = new JButton("sumbit");
// b1.setBounds(100, 60, 100, 30);
// this.add(b1);
// b2 = new JButton("reset");
// b2.setBounds(110, 200, 100, 30);
// this.add(b2);
// }

// public static void main(String[] args) {
// slipalltry obj = new slipalltry();
// }
// }
// slip2q1
// public class slipalltry {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6 };
// int add = 0, i;
// for (i = 0; i < arr.length; i++) {
// add = add + i;

// }
// System.out.println("the sum of array is " + add);
// }
// }
// slip2q2
// import java.util.Scanner;

// class product {
// int pid;
// String pname;
// int price;

// product() {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter product id ");
// pid = sc.nextInt();
// System.out.println("enter product name ");
// pname = sc.next();
// System.out.println("enter product price ");
// price = sc.nextInt();

// }

// void display() {
// System.out.println("product id is 😘 " + pid);
// System.out.println("product name is🤩 " + pname);
// System.out.println("product price is 🚓" + price);
// System.out.println();
// }
// }

// public class slipalltry {
// public static void main(String[] args) {
// int i;
// product obj[] = new product[5];
// for (i = 0; i < 2; i++) {
// obj[i] = new product();

// }
// int min = obj[0].price;
// for (i = 0; i < 2; i++) {
// if (min > obj[i].price) {
// min = obj[i].price;

// }
// System.out.println("display all product items ");
// for (i = 0; i < 2; i++) {
// obj[i].display();
// }
// }
// System.out.println("display salary whose mini mum");
// for (i = 0; i < 2; i++) {
// if (min == obj[i].price) {
// obj[i].display();
// }
// }
// }
// }
// slip3q1
// import java.util.Scanner;

// public class slipalltry {
// public static void main(String[] args) {
// int n, rem, sum = 0;
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number ");
// n = sc.nextInt();
// while (n > 0) {
// rem = n % 10;
// sum = sum + rem;
// n = n / 10;

// }
// System.out.println("the sum of digit is " + sum);
// }
// }