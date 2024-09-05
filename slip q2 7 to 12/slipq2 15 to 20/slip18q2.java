import javax.swing.*;
import java.awt.*;

public class slip18q2 extends JFrame {
    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2;
    JPasswordField p1, p2;
    JButton b1;

    slip18q2() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("adil's web");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        l1 = new JLabel("customer account details ");
        l1.setBounds(20, 20, 150, 30);
        this.add(l1);
        l2 = new JLabel("name of customer");
        l2.setBounds(20, 55, 70, 30);
        this.add(l2);
        l3 = new JLabel("name of bank ");
        l3.setBounds(20, 90, 70, 30);
        this.add(l3);
        l4 = new JLabel("acc number ");
        l4.setBounds(20, 125, 70, 30);
        this.add(l4);
        l5 = new JLabel("PAN NO");
        l5.setBounds(20, 160, 70, 30);
        this.add(l5);
        t1 = new JTextField(100);
        t1.setBounds(95, 55, 70, 30);
        this.add(t1);
        t2 = new JTextField(100);
        t2.setBounds(95, 90, 70, 30);
        this.add(t2);
        p1 = new JPasswordField(100);
        p1.setBounds(95, 125, 70, 30);
        this.add(p1);
        p2 = new JPasswordField(100);
        p2.setBounds(95, 160, 200, 30);
        this.add(p2);
        b1 = new JButton("submit");
        b1.setBounds(20, 200, 70, 30);
        this.add(b1);

    }

    public static void main(String[] args) {
        slip18q2 obj = new slip18q2();
    }
}