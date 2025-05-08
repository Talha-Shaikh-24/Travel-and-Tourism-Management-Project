
package travel.manegement.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login,signup,password;
    JTextField tfusername;
    JPasswordField tfpassword;
    JCheckBox showPasswordCheckBox;
    Login(){
       setSize(900,500);
       setLocation(300,200);
       setLayout(null);
       
       getContentPane().setBackground(Color.white);
       
       JPanel p1= new JPanel();
       p1.setBackground(new Color(133,193,233));
       p1.setBounds(0,0,400,450);
       p1.setLayout(null);
       add(p1);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/user-login-icon.png"));
       Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(100,120,300,300);
       p1.add(image);
       JPanel p2 =new JPanel();
       p2.setLayout(null);
       p2.setBounds(400,30,450,400);
       
       add(p2);
       
       JLabel lb1username=new JLabel("Username");
       lb1username.setBounds(60,20,100,25);
       lb1username.setFont(new Font("Times New Roman",Font.PLAIN,20));
       p2.add(lb1username);
       
       tfusername=new JTextField();
       tfusername.setBounds(60,60,300,30);
       tfusername.setBorder(BorderFactory.createEmptyBorder());
       p2.add(tfusername);
       
       JLabel lb1password=new JLabel("Password");
       lb1password.setBounds(60,110,100,25);
       lb1password.setFont(new Font("Times New Roman",Font.PLAIN,20));
       p2.add(lb1password);
       
        tfpassword=new JPasswordField(); 
       tfpassword.setBounds(60,150,300,30);
       tfpassword.setBorder(BorderFactory.createEmptyBorder());
       p2.add(tfpassword);
       
       showPasswordCheckBox = new JCheckBox("Show Password.");
       showPasswordCheckBox.setBounds(300, 200, 200, 50);
        p2.add(showPasswordCheckBox);
         showPasswordCheckBox.addActionListener(e -> {
            if (showPasswordCheckBox.isSelected()) {
                tfpassword.setEchoChar((char) 0); // Show password
            } else {
                tfpassword.setEchoChar('*'); // Hide password
            }
        });
        
        
  
       
       login=new JButton("LOGIN");
       login.setBounds(60,250,130,30);
       login.setBackground(new Color(133,193,233));
       login.setForeground(Color.black);
       login.setBorder(new LineBorder(new Color(133,193,233)));
       login.addActionListener(this);
       p2.add(login);
       
       signup=new JButton("SIGNUP");
       signup.setBounds(230,250,130,30);
       signup.setBackground(new Color(133,193,233));
       signup.setForeground(Color.black);
       signup.setBorder(new LineBorder(new Color(133,193,233)));
       signup.addActionListener(this);
       p2.add(signup);
       
       password=new JButton("FORGET PASSWORD");
       password.setBounds(130,300,130,30);
       password.setBackground(new Color(133,193,233));
       password.setForeground(Color.black);
       password.setBorder(new LineBorder(new Color(133,193,233)));
       password.addActionListener(this);
       p2.add(password);
       
       JLabel text=new JLabel("Trouble in login...");
       text.setBounds(300,300,130,30);
       text.setForeground(Color.red);
       p2.add(text);
       
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        
        if (ae.getSource()==login){
            try{
                 String username=tfusername.getText();
                 String pass=tfpassword.getText();
                 String query="select * from account where username='"+username+"'AND password='"+pass+"'";
                 conn c=new conn();
                 ResultSet rs=c.s.executeQuery(query);
                 
                 
                 if(rs.next()){
                     setVisible(false);
                     new Loading(username);
                 }else{
                     JOptionPane.showMessageDialog(null,"Incorrect username or password");
                 }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource()==signup){
            setVisible(false);
            new signup();
        }
        else{
            setVisible(false);
            new forgetpassword();
        }
        
        
    }
    
        
    public static void main(String [] args){
        new Login();
       
        
    }
}


  
