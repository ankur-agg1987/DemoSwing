package demoswing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DemoSwing extends JFrame{
    
    Container c = getContentPane();
    
    public static void main(String[] args) {
       new DemoSwing();  
    }
    
    DemoSwing(){
        JLabel username = new JLabel("Enter Username:");
        c.add(username);
        c.setSize(400,400);
        c.setVisible(true);
    }
    
}
