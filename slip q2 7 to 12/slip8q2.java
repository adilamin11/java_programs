import javax.swing.*;
import java.awt.*;

public class slipalltry extends JFrame {
    JMenuBar jmr;
    JMenu m1, m2, m3;
    JMenuItem j1, j2, j3;

    slipalltry() {
        this.setVisible(true);
        this.setTitle("adil rather");
        this.setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        jmr = new JMenuBar();
        this.setJMenuBar(jmr);
        m1 = new JMenu("FILE");
        jmr.add(m1);
        m2 = new JMenu("EDIT");
        jmr.add(m2);
        m3 = new JMenu("view");
        jmr.add(m3);
        j1 = new JMenuItem("new");
        m1.add(j1);
        j2 = new JMenuItem("OPEN");
        m1.add(j2);
        j3 = new JMenuItem("close");
        m1.add(j3);

    }

    public static void main(String[] args) {
        slipalltry obj = new slipalltry();
    }
}
