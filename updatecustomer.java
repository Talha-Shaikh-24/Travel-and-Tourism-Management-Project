
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class updatecustomer extends JFrame implements ActionListener{
    JLabel lblusername,lbid,lblname ;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfmail,tfphonenum,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    updatecustomer(String username){
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel iblusername=new JLabel("Username");
        iblusername.setBounds(30,50,150,25);
        add(iblusername);
        
         lblusername=new JLabel();
        lblusername.setBounds(220,50,150,25);
        add(lblusername);
        
         lbid=new JLabel("Id");
        lbid.setBounds(30,90,150,25);
        add(lbid);
        
         tfid=new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);
        
        JLabel iblname=new JLabel("Name");
        iblname.setBounds(30,170,150,25);
        add(iblname);
        
        lblname =new JLabel();
        lblname.setBounds(220,170,150,25);
        add(lblname);
        
        JLabel iblgender=new JLabel("Gender");
        iblgender.setBounds(30,210,150,25);
        add(iblgender);
        
        tfgender=new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);
        
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);
        
        JLabel lblmail=new JLabel("Email");
        lblmail.setBounds(30,330,150,25);
        add(lblmail);
        
        tfmail=new JTextField();
        tfmail.setBounds(220,330,150,25);
        add(tfmail);
        
        JLabel lblphonenum=new JLabel("Phone");
        lblphonenum.setBounds(30,370,150,25);
        add(lblphonenum);
        
        tfphonenum=new JTextField();
        tfphonenum.setBounds(220,370,150,25);
        add(tfphonenum);
        
        add=new JButton("Update");
        add.setBackground(Color.blue);
        add.setForeground(Color.white);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Back");
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/profile.png"));
        Image i2=i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(440,100,450,300);
        add(image);
        try{
            conn c=new conn();
            ResultSet rs =c.s.executeQuery("select * from customer where username = '"+username+"'");
           while( rs.next()){
               lblusername.setText(rs.getString("username"));
               lblname.setText(rs.getString("name"));
               tfnumber.setText(rs.getString("number"));
                 tfid.setText(rs.getString("id"));
               tfgender.setText(rs.getString("gender"));
               tfcountry.setText(rs.getString("country"));
               tfaddress.setText(rs.getString("address"));
               tfphonenum.setText(rs.getString("phone"));
               tfmail.setText(rs.getString("email"));
           }
        }catch(Exception e){
            e.getStackTrace();
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username=lblusername.getText();
            String id=tfid.getText();
            String number=tfnumber.getText();
             String name=lblname.getText();
             String gender=tfgender.getText();
           String country=tfcountry.getText();
           String address=tfaddress.getText();
           String phone=tfphonenum.getText();
           String email=tfmail.getText();
           try{
    conn c=new conn();
    String query="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
    c.s.executeUpdate(query);
    
    JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
    setVisible(false);
    
}catch(Exception e){
    e.getStackTrace();
}


        }else{
          setVisible(false);
        }
    }
    public static void main(String [] args){
        new updatecustomer("Talha");
    }
}
