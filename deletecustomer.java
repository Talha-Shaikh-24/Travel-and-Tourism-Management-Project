
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class deletecustomer extends JFrame implements ActionListener {
    JButton delete;
    String username;
    deletecustomer(String username){
       this.username=username;
       setBounds(450,180,870,625); 
       getContentPane().setBackground(Color.white);
       setLayout(null);
       
       JLabel lblusername= new JLabel("Username:-" );
        lblusername.setBounds(30, 50, 150, 25);
        lblusername.setForeground(Color.blue);
        add(lblusername);
        
        JLabel lbl2username= new JLabel( );
        lbl2username.setBounds(220, 50, 150, 25);
        add(lbl2username);
       
        JLabel lblid= new JLabel("Id:-" );
        lblid.setBounds(30, 110, 150, 25);
        lblid.setForeground(Color.blue);
        add(lblid);
        
        JLabel lbl2id= new JLabel( );
        lbl2id.setBounds(220, 110, 150, 25);
        add(lbl2id);
        
        JLabel lblnumber= new JLabel("Number:-" );
        lblnumber.setBounds(30, 170, 150, 25);
        lblnumber.setForeground(Color.blue);
        add(lblnumber);
        
        JLabel lbl2number= new JLabel( );
        lbl2number.setBounds(220, 170, 150, 25);
        add(lbl2number);
        
        JLabel lblname= new JLabel("Name:-" );
        lblname.setBounds(30, 230, 150, 25);
        lblname.setForeground(Color.blue);
        add(lblname);
        
        JLabel lbl2name= new JLabel( );
        lbl2name.setBounds(220, 230, 150, 25);
        add(lbl2name);
        
        JLabel lblgender= new JLabel("Gender:-" );
        lblgender.setBounds(30, 290, 150, 25);
        lblgender.setForeground(Color.blue);
        add(lblgender);
        
        JLabel lbl2gender= new JLabel( );
        lbl2gender.setBounds(220, 290, 150, 25);
        add(lbl2gender);
        
        JLabel lblcountry= new JLabel("Country:-" );
        lblcountry.setBounds(500, 50, 150, 25);
        lblcountry.setForeground(Color.blue);
        add(lblcountry);
        
        JLabel lbl2country= new JLabel( );
        lbl2country.setBounds(690, 50, 150, 25);
        add(lbl2country);
        
        JLabel lbladdress= new JLabel("Address:-" );
        lbladdress.setBounds(500, 110, 150, 25);
        lbladdress.setForeground(Color.blue);
        add(lbladdress);
        
        JLabel lbl2address= new JLabel( );
        lbl2address.setBounds(690, 110, 150, 25);
        add(lbl2address);
        
        JLabel lblphone= new JLabel("Phone:-" );
        lblphone.setBounds(500, 170, 150, 25);
        lblphone.setForeground(Color.blue);
        add(lblphone);
        
        JLabel lbl2phone= new JLabel( );
        lbl2phone.setBounds(690, 170, 150, 25);
        add(lbl2phone);
        
        JLabel lblemail= new JLabel("Email:-" );
        lblemail.setBounds(500, 230, 150, 25);
        lblemail.setForeground(Color.blue);
        add(lblemail);
        
        JLabel lbl2email= new JLabel( );
        lbl2email.setBounds(690, 230, 150, 25);
        add(lbl2email);
        
        delete=new JButton ("Delete");
        delete.setBackground(Color.blue);
        delete.setForeground(Color.white);
        delete.setBounds(350,350,100,25);
        delete.addActionListener(this);
        add(delete);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(20,400,600,200);
        add(image);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5=i4.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image2=new JLabel(i6);
        image2.setBounds(600,400,600,200);
        add(image2);
        try{
           conn C = new conn();
           String query="select * from customer where username='"+username+"'";
           ResultSet rs=C.s.executeQuery(query);
           while(rs.next()){
               lbl2username.setText(rs.getString("username"));
               lbl2id.setText(rs.getString("Id"));
               lbl2number.setText(rs.getString("Number"));
               lbl2name.setText(rs.getString("Name"));
               lbl2gender.setText(rs.getString("Gender"));
               lbl2country.setText(rs.getString("Country"));
               lbl2address.setText(rs.getString("Address"));
               lbl2phone.setText(rs.getString("Phone"));
               lbl2email.setText(rs.getString("Email"));

           }
        }catch(Exception e){
  
        }
       setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
          try{
             conn c=new conn();
             c.s.executeUpdate("delete from account where  username='"+username+"'");
             c.s.executeUpdate("delete from customer where  username='"+username+"'");
             c.s.executeUpdate("delete from bookpackage1 where  username='"+username+"'");
             c.s.executeUpdate("delete from bookhotel1 where  username='"+username+"'");
           JOptionPane.showMessageDialog(null,"Customer Details Deleted Successfully");
           System.exit(0);
         }catch(Exception e){
            e.printStackTrace();
         }
     }
    public static void main(String [] args){
        new deletecustomer("");
    }
}
