import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip19q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Background Color Chooser");
        JPanel panel = new JPanel();
        JButton button = new JButton("Choose Background Color");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color bgColor = JColorChooser.showDialog(frame, "Choose Background Color", Color.WHITE);
                panel.setBackground(bgColor);
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}