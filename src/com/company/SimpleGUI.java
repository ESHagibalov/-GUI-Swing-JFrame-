package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton ("Press me");
    private JLabel label1 = new JLabel("This is test window. Input your name");
    private JTextField text = new JTextField("", 5);
    private JLabel label2 = new JLabel("you are...");
    private JRadioButton radio1 = new JRadioButton("Student");
    private JRadioButton radio2 = new JRadioButton("Teacher"); //elements of form

    public SimpleGUI () {
        super("test example");
        this.setBounds(400, 400, 500, 300); //size of form
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close operation

        Container container = this.getContentPane();
        container.setLayout( new GridLayout(3, 2, 2, 2));
        container.add(label1);
        container.add(text);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String massege = "";
            massege += "";
            massege += "Button was pressed\n";
            massege +=  "Name is " + text.getText() + "\n";
            massege += radio1.isSelected() ? "You are student" : "You are teacher";
            JOptionPane.showMessageDialog(null, massege, "OutPut", JOptionPane.PLAIN_MESSAGE);


        }
    }

}
