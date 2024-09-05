import javax.swing.*;
import java.awt.*;

public class slip18q2 extends JFrame {
    JLabel l1, l2; // l3, l4;
    // JTextField t1, t2;
    // JPasswordField p1, p2;
    // JButton b1;

    slip18q2() {
        setVisible(true);
        setTitle("appp");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        l1 = new JLabel("name of customer ");
        l1.setBounds(20, 20, 100, 30);
        this.add(l1);
        l2 = new JLabel("name of bank");
        l2.setBounds(20, 55, 100, 30);
        this.add(l2);

    }

    public static void main(String[] args) {
        slip18q2 obj = new slip18q2();
    }
}
