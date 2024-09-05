import javax.swing.*;

public class slip20q1 {

    public static void main(String args[]) {
        JFrame frame = new JFrame("scrollbar");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea("hi,I AM LEARNNING JAVA");
        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollPane horizontalJScrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(horizontalJScrollPane);
        frame.setVisible(true);
    }
}
