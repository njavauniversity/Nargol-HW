package mypackage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args)  {
        JFrame firstFrame = new JFrame();
        firstFrame.setBounds(100,100,400,400);
        firstFrame.setBackground(Color.CYAN);

        JPanel firstPanel = new JPanel();

        JLabel nameLabel = new JLabel("Name: ");
        JLabel familyLabel = new JLabel("LastName: ");
        JLabel ageLabel = new JLabel("Age: ");

        JTextField nameTextField = new JTextField(10);
        JTextField familyTextField = new JTextField(10);
        JTextField ageTextField = new JTextField(2);

        JButton okButton = new JButton("OK.");

        JCheckBox lang1 = new JCheckBox("English");
        JCheckBox lang2 = new JCheckBox("French");

        JRadioButton gender1 = new JRadioButton("Female");
        JRadioButton gender2 = new JRadioButton("Male");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(gender1);
        buttonGroup.add(gender2);









        //-------------------ADDING-----------------------
        firstPanel.add(nameLabel);
        firstPanel.add(nameTextField);
        firstPanel.add(familyLabel);
        firstPanel.add(familyTextField);
        firstPanel.add(ageLabel);
        firstPanel.add(ageTextField);
        firstPanel.add(lang1);
        firstPanel.add(lang2);
        firstPanel.add(gender1);
        firstPanel.add(gender2);
        firstPanel.add(okButton);
        firstFrame.add(firstPanel);
        firstFrame.setVisible(true);







    }
}
