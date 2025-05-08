
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ViewBookedHotel extends JFrame implements ActionListener {
    JButton back;
    ViewBookedHotel(String username){
       setBounds(400,200,1000,600); 
       getContentPane().setBackground(Color.white);
       setLayout(null);
       
       JLabel text= new JLabel("VIEW BOOKED HOTEL DETAILS" );
        text.setBounds(60, 0, 400, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
       
       JLabel lblusername= new JLabel("Username" );
        lblusername.setBounds(30, 50, 150, 25);
        lblusername.setForeground(Color.blue);
        add(lblusername);
        
        JLabel lbl2username= new JLabel( );
        lbl2username.setBounds(220, 50, 150, 25);
        add(lbl2username);
       
        JLabel lblhotel= new JLabel("Hotel Name" );
        lblhotel.setBounds(30, 90, 150, 25);
        lblhotel.setForeground(Color.blue);
        add(lblhotel);
        
        JLabel lbl2hotel= new JLabel( );
        lbl2hotel.setBounds(220, 90, 150, 25);
        add(lbl2hotel);
        
        JLabel lblpersons= new JLabel("Total Persons" );
        lblpersons.setBounds(30, 130, 150, 25);
        lblpersons.setForeground(Color.blue);
        add(lblpersons);
        
        JLabel lb2persons= new JLabel( );
        lb2persons.setBounds(220, 130, 150, 25);
        add(lb2persons);
       
        JLabel lbldays= new JLabel("Totel Days" );
        lbldays.setBounds(30, 170, 150, 25);
        lbldays.setForeground(Color.blue);
        add(lbldays);
        
        JLabel lbl2days= new JLabel( );
        lbl2days.setBounds(220, 170, 150, 25);
        add(lbl2days);
        
        JLabel lblroom= new JLabel("AC/Non-AC" );
        lblroom.setBounds(30, 210, 150, 25);
        lblroom.setForeground(Color.blue);
        add(lblroom);
        
        JLabel lb2room= new JLabel( );
        lb2room.setBounds(220, 210, 150, 25);
        add(lb2room);
        
        JLabel lblid= new JLabel("Id" );
        lblid.setBounds(30, 250, 150, 25);
        lblid.setForeground(Color.blue);
        add(lblid);
        
        JLabel lb2id= new JLabel( );
        lb2id.setBounds(220, 250, 150, 25);
        add(lb2id);
        
        JLabel lblfood= new JLabel("Food Included?" );
        lblfood.setBounds(30, 290, 150, 25);
        lblfood.setForeground(Color.blue);
        add(lblfood);
        
        JLabel lb2food= new JLabel( );
        lb2food.setBounds(220, 290, 150, 25);
        add(lb2food);
        
        
        JLabel lblnumber= new JLabel("Number" );
        lblnumber.setBounds(30, 330, 150, 25);
        lblnumber.setForeground(Color.blue);
        add(lblnumber);
        
        JLabel lb2number= new JLabel( );
        lb2number.setBounds(220, 330, 150, 25);
        add(lb2number);
        
        JLabel lblphone= new JLabel("Phone-" );
        lblphone.setBounds(30, 370, 150, 25);
        lblphone.setForeground(Color.blue);
        add(lblphone);
        
        JLabel lb2phone= new JLabel( );
        lb2phone.setBounds(220, 370, 150, 25);
        add(lb2phone);
        
        JLabel lblprice= new JLabel("Price" );
        lblprice.setBounds(30, 410, 150, 25);
        lblprice.setForeground(Color.blue);
        add(lblprice);
        
        JLabel lb2price= new JLabel( );
        lb2price.setBounds(220, 410, 150, 25);
        add(lb2price);
        
        back=new JButton ("Back");
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.setBounds(130,460,100,25);
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
           String query="select * from bookhotel1 where username='"+username+"'";
           ResultSet rs=C.s.executeQuery(query);
           while(rs.next()){
               lbl2username.setText(rs.getString("username"));
               lbl2hotel.setText(rs.getString("name"));
               lb2persons.setText(rs.getString("persons"));
               lb2id.setText(rs.getString("id"));
               lb2number.setText(rs.getString("number"));
               lb2phone.setText(rs.getString("phone"));
               lb2price.setText(rs.getString("price"));
               lb2food.setText(rs.getString("food"));
               lb2room.setText(rs.getString("room"));
               lbl2days.setText(rs.getString("days"));
               
               

           }
        }catch(Exception e){
  
        }
       setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
     }
    public static void main(String [] args){
        new ViewBookedHotel("Talha");
    }
}
