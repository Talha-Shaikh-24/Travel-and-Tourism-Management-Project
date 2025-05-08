
package travel.manegement.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    About(){
         setBounds(600,200,500,550);
         setLayout(null);
         getContentPane().setBackground(Color.white);
         
         JLabel l1=new JLabel("About");
         l1.setBounds(200,10,100,40);
         l1.setForeground(Color.red);
         l1.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(l1);
         
         String s="About Projects            \n"+
                 "  \n"+ 
         "A Travel and Tourism Management System is a software solution designed to streamline"+
                 "and automate various processes involved in the travel and tourism industry. This system"+
                 "can be utilized by travel agencies, tour operators, hotels, airlines, and other entities "+
                 "involved in the travel sector. Here are some key aspects and advantages of a Travel and"+
                 "Tourism Management System:\n"+
                 "\n"+"Advantages ofTourism Management System "+
                 "\n"+"1.Booking and Reservation Management"+
                 "\n"+"2.Customer Management"+
                 "\n"+"3.Inventory Management"+
                 "\n"+"4.Payment and Invoicing"+
                 "\n"+"5.Integration with External Systems"+
                 "\n"+"6.Cost and Time Efficiency\n"+"\n"+
                 "A Travel and Tourism Management System brings efficiency, accuracy, and\n"+" improved customer satisfaction to the travel industry by automating processes,\n"+" integrating with external systems, and providing valuable insights through analytics.";
         
         TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
         area.setEditable(false);
         area.setBounds(20,100,450,300);
         add(area);
         
         JButton back=new JButton ("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);       
         
         setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
     }
    public static void main(String []args){
        new About();
    }
}
