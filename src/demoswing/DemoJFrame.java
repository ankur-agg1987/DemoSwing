
package demoswing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoJFrame {
    
    public static void main(String args[]){
        JFrame f = new JFrame();
        JLabel l = new JLabel("Hello");
        JButton b = new JButton("Submit");
        f.add(l);
        f.add(b);
        f.add(new JLabel("How are you?"));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setSize(200,200);
        f.setVisible(true);
    }
}
