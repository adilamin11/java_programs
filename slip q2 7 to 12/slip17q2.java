// import javax.swing.*;
// import java.awt.*;

// public class slip17q2 extends JFrame {
//     JLabel l1, l2;
//     JTextField t1;
//     JPasswordField p1;
//     JButton b1, b2;

//     slip17q2() {
//         this.setVisible(true);
//         this.setSize(500, 500);
//         this.setTitle("application");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setLayout(null);
//         l1 = new JLabel("USERNAME");
//         l1.setBounds(20, 20, 80, 30);
//         this.add(l1);
//         l2 = new JLabel("PASSWORD");
//         l2.setBounds(20, 60, 80, 30);
//         this.add(l2);
//         t1 = new JTextField(100);
//         t1.setBounds(110, 20, 100, 30);
//         this.add(t1);
//         p1 = new JPasswordField(100);
//         p1.setBounds(110, 60, 100, 30);
//         this.add(p1);
//         b1 = new JButton("LOGIN");
//         b1.setBounds(20, 100, 80, 30);
//         this.add(b1);
//         b2 = new JButton("REGISTER");
//         b2.setBounds(130, 100, 100, 30);
//         this.add(b2);

//     }

//     public static void main(String[] args) {
//         slip17q2 obj = new slip17q2();
//     }

// }
import javax.swing.*;
import java.awt.*;

public class slip17q2 extends JFrame {
    JLabel l1, l2;
    JTextField t1;

    JPasswordField p1;
    JButton b1, b2;

    slip17q2() {
        setVisible(true);
        setTitle("adil bahii");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        l1 = new JLabel("user name ");
        l1.setBounds(20, 20, 80, 30);
        this.add(l1);
        l2 = new JLabel("passwprd ");
        l2.setBounds(20, 60, 60, 40);
        this.add(l2);
        t1 = new JTextField(100);
        t1.setBounds(110, 20, 80, 30);
        this.add(t1);
        p1 = new JPasswordField(100);
        p1.setBounds(110, 60, 100, 30);
        this.add(p1);
        b1 = new JButton("sumbit");
        b1.setBounds(20, 100, 80, 30);
        this.add(b1);
        b2 = new JButton("reset");
        b2.setBounds(110, 100, 100, 30);
        this.add(b2);
    }

    public static void main(String[] args) {
        slip17q2 obj = new slip17q2();
    }
}
