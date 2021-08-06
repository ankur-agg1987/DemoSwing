package demoswing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ankur-Agg
 */
public class OurSwingDemo {
    public static void main(String args[]){
        //STEP1: create a contianer
        JFrame myframe = new JFrame("Our Swing Demo example");
        
        //STEP2: create object of components to be added on container
        JLabel mylb = new JLabel("Hello this is example of simple swing application");
        JButton mybtn = new JButton("My Button");
        JButton mybtn2 = new JButton("Our Button");
        
        //STEP3: add component to container, the flow of adding the compoentnt to container
        // will be used as the latest component to be used to display on GUI
        myframe.add(mybtn);
        myframe.add(mylb);
        myframe.add(mybtn2);
        
        //STEP3B: add a lyout manager to your container
        myframe.setLayout(new FlowLayout());
        
        //STEP4: set the sixe of container
        myframe.setSize(400, 200);
        
        //STEP5: set the container visible
        myframe.setVisible(true);
        
        //STEP6: add function to close the program on close of your GUI screen or container
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
