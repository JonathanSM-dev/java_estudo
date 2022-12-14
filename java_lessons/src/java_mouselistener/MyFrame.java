package java_mouselistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    int i;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("Mouse Clicked");
        label.setBackground(Color.GREEN);
        i++;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        System.out.println("Mouse Pressed");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("Mouse Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("Mouse Enter");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        System.out.println("Mouse Exited");
        System.out.println("Cliks: " + i);
    }
}
