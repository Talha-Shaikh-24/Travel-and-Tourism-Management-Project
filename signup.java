
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
public class signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfusername,tfname,tfpassword,tfanswer;
    Choice security;
    signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1= new JPanel();
       p1.setBackground(new Color(133,193,233));
       p1.setBounds(0,0,400,400);
       p1.setLayout(null);
       add(p1);
       
       JLabel lb1username=new JLabel("Username");
       lb1username.setBounds(50,20,125,25);
       lb1username.setFont(new Font("Times New Roman",Font.BOLD,14));
       p1.add(lb1username);
       
       tfusername=new JTextField();
       tfusername.setBounds(190,20,180,25);
       tfusername.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfusername);
       
       JLabel lb1name=new JLabel("Name");
       lb1name.setBounds(50,60,125,25);
       lb1name.setFont(new Font("Times New Roman",Font.BOLD,14));
       p1.add(lb1name);
       
       tfname=new JTextField();
       tfname.setBounds(190,60,180,25);
       tfname.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfname);
       
       JLabel lb1password=new JLabel("Password");
       lb1password.setBounds(50,100,125,25);
       lb1password.setFont(new Font("Times New Roman",Font.BOLD,14));
       p1.add(lb1password);
       
       tfpassword=new JTextField();
       tfpassword.setBounds(190,100,180,25);
       tfpassword.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfpassword);
       
       JLabel lb1security=new JLabel("Security");
       lb1security.setBounds(50,140,125,25);
       lb1security.setFont(new Font("Times New Roman",Font.BOLD,14));
       p1.add(lb1security);
       
       security=new Choice();
       security.add("Fav character of boy");
       security.add("Fav Marvel Superhero");
       security.add("Your Lucky Number");
       security.add("Your childhood superhero");
       security.setBounds(190,140,180,25);
       p1.add(security);
       
       
       JLabel lb1answer=new JLabel("Answer");
       lb1answer.setBounds(50,180,125,25);
       lb1answer.setFont(new Font("Times New Roman",Font.BOLD,14));
       p1.add(lb1answer);
       
       tfanswer=new JTextField();
       tfanswer.setBounds(190,180,180,25);
       tfanswer.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfanswer);
       
       create=new JButton("CREATE");
       create.setBounds(80,250,100,30);
       create.setBackground(Color.WHITE);
       create.setForeground(Color.black);
       create.setFont(new Font("Times New Roman",Font.BOLD,14));
       create.setBorder(new LineBorder(new Color(133,193,233)));
       create.addActionListener(this);
       p1.add(create);
       
       back=new JButton("BACK");
       back.setBounds(250,250,100,30);
       back.setBackground(Color.WHITE);
       back.setForeground(Color.black);
       back.setFont(new Font("Times New Roman",Font.BOLD,14));
       back.setBorder(new LineBorder(new Color(133,193,233)));
       back.addActionListener(this);
       p1.add(back);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup3.jpg"));
       Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(580,50,250,250);
       add(image);
       
       
        setVisible(true);
        
    }
     

    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==create){
            String username=tfusername.getText();
            String name=tfname.getText();
            String password=tfpassword.getText();
            String quetion=security.getSelectedItem();
            String answer=tfanswer.getText();
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+quetion+"','"+answer+"') ";
            try{
                conn c=new conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Create successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
          
            }
        }
        else if(ae.getSource()==back){
        setVisible(false);
        new Login();
    }
    }
public static void main(String [] args){
  new signup();
}
}

   
