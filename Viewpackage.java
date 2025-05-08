
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Viewpackage extends JFrame implements ActionListener {
    JButton back;
    Viewpackage(String username){
       setBounds(420,200,900,450); 
       getContentPane().setBackground(Color.white);
       setLayout(null);
       
       JLabel text= new JLabel("VIEW PACKAGE DETAILS" );
        text.setBounds(60, 0, 300, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
       
       JLabel lblusername= new JLabel("Username-" );
        lblusername.setBounds(30, 50, 150, 25);
        lblusername.setForeground(Color.blue);
        add(lblusername);
        
        JLabel lbl2username= new JLabel( );
        lbl2username.setBounds(220, 50, 150, 25);
        add(lbl2username);
       
        JLabel lblpackage= new JLabel("Package-" );
        lblpackage.setBounds(30, 90, 150, 25);
        lblpackage.setForeground(Color.blue);
        add(lblpackage);
        
        JLabel lbl2package= new JLabel( );
        lbl2package.setBounds(220, 90, 150, 25);
        add(lbl2package);
        
        JLabel lblpersons= new JLabel("Total Persons" );
        lblpersons.setBounds(30, 130, 150, 25);
        lblpersons.setForeground(Color.blue);
        add(lblpersons);
        
        JLabel lb2persons= new JLabel( );
        lb2persons.setBounds(220, 130, 150, 25);
        add(lb2persons);
        
        JLabel lblid= new JLabel("Id-" );
        lblid.setBounds(30, 170, 150, 25);
        lblid.setForeground(Color.blue);
        add(lblid);
        
        JLabel lb2id= new JLabel( );
        lb2id.setBounds(220, 170, 150, 25);
        add(lb2id);
        
        JLabel lblnumber= new JLabel("Number" );
        lblnumber.setBounds(30, 210, 150, 25);
        lblnumber.setForeground(Color.blue);
        add(lblnumber);
        
        JLabel lb2number= new JLabel( );
        lb2number.setBounds(220, 210, 150, 25);
        add(lb2number);
        
        JLabel lblphone= new JLabel("Phone-" );
        lblphone.setBounds(30, 250, 150, 25);
        lblphone.setForeground(Color.blue);
        add(lblphone);
        
        JLabel lb2phone= new JLabel( );
        lb2phone.setBounds(220, 250, 150, 25);
        add(lb2phone);
        
        JLabel lblprice= new JLabel("Price-" );
        lblprice.setBounds(30, 290, 150, 25);
        lblprice.setForeground(Color.blue);
        add(lblprice);
        
        JLabel lb2price= new JLabel( );
        lb2price.setBounds(220, 290, 150, 25);
        add(lb2price);
        
        back=new JButton ("Back");
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.setBounds(130,360,100,25);
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450,20,500,400);
        add(image);
        
  
        try{
           conn C = new conn();
           String query="select * from bookpackage1 where username='"+username+"'";
           ResultSet rs=C.s.executeQuery(query);
           while(rs.next()){
               lbl2username.setText(rs.getString("username"));
               lbl2package.setText(rs.getString("package"));
               lb2persons.setText(rs.getString("persons"));
               lb2id.setText(rs.getString("id"));
               lb2number.setText(rs.getString("number"));
               lb2phone.setText(rs.getString("phone"));
               lb2price.setText(rs.getString("price"));
               

           }
        }catch(Exception e){
  
        }
       setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
     }
    public static void main(String [] args){
        new Viewpackage("Talha");
    }
}
