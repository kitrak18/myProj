import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
class uiTry{
    public static void main(String args[]){
       JFrame frame = new JFrame("Elevator Panel");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,400); // frame size ( width,height)
      
       //creating panel
      JPanel panel1 = new JPanel();   
       JButton button = new JButton("ROOF TOP"); // creating button
       //frame.getContentPane().add(button); // Adds Button to content pane of frame
       JButton button1 = new JButton("G");
       panel1.add(button);
       // setting layout
       frame.setLayout(new GridLayout(7,2, 5, 5));             
        JLabel label = new JLabel(" Press Button");
       // frame.add(label, label.CENTER);
       
        
        JButton button0 = new JButton("F2"); // creating button
        JButton button3 = new JButton("F3"); // creating button
       JButton button4 = new JButton("F4");
       JButton button5 = new JButton("F5");
       JButton button6 = new JButton("F6");
       JButton button7 = new JButton("F7");
       JButton button8 = new JButton("F8");
       JButton button9 = new JButton("F9");
       JButton button10 = new JButton("B1");
       JButton button11 = new JButton("Amenities");
       frame.add(button10);
       frame.add(button1);
       frame.add(button0);
       frame.add(button3);
       frame.add(button4);
       frame.add(button5);
       frame.add(button6);
       frame.add(button7);
       frame.add(button8);
       frame.add(button9);
       frame.add(button11);
        //adding panel to the frame
       frame.add(panel1,frame.BOTTOM_ALIGNMENT);

       //frame.getContentPane().add(panel2, FlowLayout.TRAILING);
        
        // settting the frame to be visible
        frame.setVisible(true);
    }
}
