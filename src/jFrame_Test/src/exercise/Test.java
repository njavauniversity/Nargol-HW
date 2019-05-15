package exercise;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,400,400);
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        JLabel namelabel = new JLabel("NAME");
        namelabel.setBackground(Color.white);
        JTextField name = new JTextField(10);

        JButton ok = new JButton("OK.");
        panel.add(namelabel);
        panel.add(name);
        panel.add(ok);
        frame.add(panel);
        frame.setVisible(true);




    }
}
