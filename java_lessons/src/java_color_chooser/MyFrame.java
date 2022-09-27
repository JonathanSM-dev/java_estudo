package java_color_chooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("Text Here...");
        label.setFont(new Font("Arial", Font.BOLD, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Color chooser 2000", Color.black);
            label.setForeground(color);
            //label.setBackground(color);
        }
    }
}