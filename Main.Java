/* By Andika Pramudya Wardana 
   2206046645*/

package TP04;


import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        // Create a new JFrame with title "Postfix Calculator"
        JFrame frame = new JFrame("Postfix Calculator");

        // Set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of the InfixtoPostfixGenerator panel
        InfixtoPostfixGenerator panel = new InfixtoPostfixGenerator();

        // Add the panel to the content pane of the frame
        frame.getContentPane().add(panel);

        // Adjust the size of the frame to fit its contents
        frame.pack();

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
