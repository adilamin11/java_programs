import javax.swing.*;
import java.awt.*;

public class slip20q1 extends JFrame {
    JScrollBar hsb, vsb;
    JLabel l1;

    slip20q1() {
        this.setVisible(true);
        this.setTitle("app");
        this.setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hsb = new JScrollBar(JScrollBar.HORIZONTAL);
        vsb = new JScrollBar(JScrollBar.VERTICAL);
        this.add(hsb, BorderLayout.SOUTH);
        this.add(vsb, BorderLayout.EAST);
        l1 = new JLabel("I WELCOME TO UHH");
        l1.setBounds(20, 20, 200, 40);
        this.add(l1);

    }

    public static void main(String[] args) {
        slip20q1 obj = new slip20q1();
     }
}
