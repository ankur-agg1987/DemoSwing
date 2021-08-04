package demoswing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ankur-Agg
 */
public class MySwingDemo {
    
    public static void main (String []args){
        
       //STEP1: create object of container to hold components
        JFrame myframe = new JFrame("My First Swing Demo");
        
        //STEP2: create components which to be added to container
        JButton mybtn = new JButton("Click ME!");
        JLabel mylb = new JLabel("This is my label component");
        
        //STEP3: add the components to container

        myframe.add(mylb);
        myframe.add(mybtn);
        
        //STEP3B: we need to have a layoutmanager for our container
        myframe.setLayout(new FlowLayout());
        
        //STEP4: we need to set the size of our container
        myframe.setSize(500, 200);
        
        //STEP5: make the container visible
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
}
