import javax.swing.*;
class uiTry{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,600); // frame size
       JButton button = new JButton("Button1"); // creating button
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       
       JButton button1 = new JButton("b2");
       frame.getContentPane().add(button1); // Adds Button to content pane of frame
       
       // settting the frame to be visible
       frame.setVisible(true);
    }
}
