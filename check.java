/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.manegement.system;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class check extends JFrame {
    
    public JPasswordField tfpassword;
    public JCheckBox showPasswordCheckBox;
   

    public check() {
        

   
        setLayout(new java.awt.FlowLayout());

        
        showPasswordCheckBox = new JCheckBox("Show Password");
       

      
        add(showPasswordCheckBox);
        

        // Add action listener to the showPasswordCheckBox
        showPasswordCheckBox.addActionListener(e -> {
            if (showPasswordCheckBox.isSelected()) {
                tfpassword.setEchoChar((char) 0); // Show password
            } else {
                tfpassword.setEchoChar('*'); // Hide password
            }
        });

        

       pack();
        setLocationRelativeTo(null); // Center the JFrame on screen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new check().setVisible(true);
        });
    }
}
