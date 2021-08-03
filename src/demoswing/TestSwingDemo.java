package demoswing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ankur-Agg
 */
public class TestSwingDemo {
    public static void main(String args[]){
        //STEP1: Create a Container to hold all components, JFrame
        JFrame frame = new JFrame("First Swing Demo");
        
        //STEP2: Create objects of componentts to be added to container
        JLabel userlabel = new JLabel("Enter Username: ");
        JTextField userTF = new JTextField(10);
        JButton userBtn = new JButton("Click to submit");
        
        //STEP3: add component to container in some order
        frame.add(userlabel);
        frame.add(userTF);
        frame.add(userBtn);
        
        //STEP 3.1: add a layout manager to your container to maintain the components posistion
        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        //STEP4: set the size of your container
        frame.setSize(400, 200);
        
        //STEP5: make your container visisble
        frame.setVisible(true);
        
        //this code will make sure to close your program on exit of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
