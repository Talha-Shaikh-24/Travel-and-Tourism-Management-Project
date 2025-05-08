
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class addcustomer extends JFrame implements ActionListener{
    JLabel lblusername,lbid,lblname ;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfmail,tfphonenum;
    JRadioButton rmale,rfemale;
    JButton add,back;
    addcustomer(String username){
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel iblusername=new JLabel("Username");
        iblusername.setBounds(30,50,150,25);
        add(iblusername);
        
         lblusername=new JLabel();
        lblusername.setBounds(220,50,150,25);
        add(lblusername);
        
         lbid=new JLabel("Id");
        lbid.setBounds(30,90,150,25);
        add(lbid);
        
        comboid=new JComboBox(new String[]{"Passport","Adharcard","Pancard","Ration Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);
        
        JLabel lblnumber=new JLabel(" Id Number");
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
        
        rmale=new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        add(rmale);

        rfemale=new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.white);
        add(rfemale);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        
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
        
        tfmail=new JTextField(20);
        tfmail.setBounds(220,330,150,25);
        add(tfmail);
        
        JLabel lblphonenum=new JLabel("Phone");
        lblphonenum.setBounds(30,370,150,25);
        add(lblphonenum);
        
        tfphonenum=new JTextField();
        tfphonenum.addKeyListener(new KeyAdapter() {
            
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume(); 
                }
            }
        });
        tfphonenum.setBounds(220,370,150,25);
        add(tfphonenum);
        
        add=new JButton("Add");
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
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(440,40,450,420);
        add(image);
        try{
            conn c=new conn();
            ResultSet rs =c.s.executeQuery("select * from account where username = '"+username+"'");
           while( rs.next()){
               lblusername.setText(rs.getString("username"));
               lblname.setText(rs.getString("name"));
           }
        }catch(Exception e){
            e.getStackTrace();
        }
        
        setVisible(true);
    }
   
    
    public void actionPerformed(ActionEvent ae){
        
         
        if(ae.getSource()==add){
            String username=lblusername.getText();
            String id=(String)comboid.getSelectedItem();
            String number=tfnumber.getText();
             String name=lblname.getText();
             String gender=null;
             if(rmale.isSelected()){
                 gender="Male";
             }else{
                 gender="Female";
             }
           String country=tfcountry.getText();
           
           String address=tfaddress.getText();
           String phone=tfphonenum.getText();
           String email = tfmail.getText();
               
      
           try{
               
               
    conn c=new conn();
    String query="insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
    c.s.executeUpdate(query);
    
    JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
    
    setVisible(false);
    
}catch(Exception e){
    e.getStackTrace();
}


        }else{
          setVisible(false);
        }
        
       
    }
    
      public static void main(String [] args){
        new addcustomer("");
    }

    
}
