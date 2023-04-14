import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test implements ActionListener {
    JButton button;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    public static void main(String[] args) {
        Test testGUI = new Test();
        testGUI.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me..");
        button1 = new JButton("Click me..");
        button2 = new JButton("Click me..");
        button3 = new JButton("Click me..");
        button4 = new JButton("Click me..");
        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.CENTER, button1);
        frame.getContentPane().add(BorderLayout.WEST, button2);
        frame.getContentPane().add(BorderLayout.EAST, button3);
        frame.getContentPane().add(BorderLayout.NORTH, button4);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event){
        button.setText("I have been clicked!");
    }


}
