
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class bookpackage extends JFrame implements ActionListener{
    Choice cpackage;
    JTextField tfpersons;
    JLabel lbl2username,lblid,lblnumber,lblphone,lbl2price,lbl2phone,lbl2number;
    JButton checkprice,bookpack,back;
    String username;
    bookpackage(String username){
        this.username=username;
        setBounds(350,200,1100,500); 
        getContentPane().setBackground(Color.white);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JLabel text= new JLabel("BOOK PACKAGE" );
         text.setBounds(100,10,200,30);
         text.setFont(new Font("Tahoma",Font.PLAIN,20));
         add(text);
         
        JLabel lblusername= new JLabel("Username" );
        lblusername.setBounds(40, 70, 100, 20);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblusername);
        
        lbl2username= new JLabel( );
        lbl2username.setBounds(250, 70, 200, 20);
        lbl2username.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbl2username);
       
        JLabel selectpack= new JLabel("Select Package" );
        selectpack.setBounds(40, 110, 150, 20);
        selectpack.setFont(new Font("Tahoma",Font.BOLD,16));
        add(selectpack);
        
        cpackage=new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250, 110, 200, 20);
        add(cpackage);
        
        JLabel lblpersons= new JLabel("Total Persons" );
        lblpersons.setBounds(40, 150, 150, 25);
        lblpersons.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpersons);
        
        tfpersons=new JTextField("2");
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);
        
        lblid= new JLabel("Id" );
        lblid.setBounds(40, 190, 150, 20);
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblid);
        
        JLabel lbl2id= new JLabel( );
        lbl2id.setBounds(250, 190, 200, 25);
        lbl2id.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbl2id);
        
        lblnumber= new JLabel("Number" );
        lblnumber.setBounds(40, 230, 150, 25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblnumber);
        
        lbl2number= new JLabel( );
        lbl2number.setBounds(250, 230, 150, 25);
        add(lbl2number);
        
        lblphone= new JLabel("Phone" );
        lblphone.setBounds(40, 270, 150, 25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblphone);
        
        lbl2phone= new JLabel( );
        lbl2phone.setBounds(250, 270, 200, 25);
        add(lbl2phone);
        
        JLabel lblprice= new JLabel("Total price" );
        lblprice.setBounds(40, 310, 150, 25);
        lblprice.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblprice);
        
        lbl2price= new JLabel( );
        lbl2price.setBounds(250, 310, 200, 25);
        add(lbl2price);
        
        try{
           conn C = new conn();
           String query="select * from customer where username='"+username+"'";
           ResultSet rs=C.s.executeQuery(query);
           while(rs.next()){
               lbl2username.setText(rs.getString("username"));
               lbl2id.setText(rs.getString("Id"));
               lbl2number.setText(rs.getString("Number"));
               lbl2phone.setText(rs.getString("Phone"));

           }
        }catch(Exception e){
            e.printStackTrace();
        }
        checkprice=new JButton("Check Price");
        checkprice.setBounds(60,380,120,25);
        checkprice.setBackground(Color.blue);
        checkprice.setForeground(Color.white);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpack=new JButton("Book Package");
        bookpack.setBounds(200,380,120,25);
        bookpack.setBackground(Color.blue);
        bookpack.setForeground(Color.white);
        bookpack.addActionListener(this);
        add(bookpack);
        
        back=new JButton("Back");
        back.setBounds(340,380,120,25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image1=new JLabel(i3);
        image1.setBounds(550,50,500,300);
        add(image1);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            String cpack=cpackage.getSelectedItem();
            int cost=0;
        if (cpack.equals("Gold Package")){
            cost+=12000;
        }else if(cpack.equals("Silver Package")){
            cost+=25000;
        }else{
            cost+=32000;
        }
        int persons=Integer.parseInt(tfpersons.getText());
          cost*=persons;
          lbl2price.setText("Rs"+cost);
    } else if(ae.getSource()==bookpack){
        try{
            conn c=new conn();
            c.s.executeUpdate("insert into bookpackage1 values('"+lbl2username.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+lblid.getText()+"','"+lbl2number.getText()+"','"+lbl2phone.getText()+"','"+lbl2price.getText()+"')");
        
            JOptionPane.showMessageDialog(null,"Booked Package Successfully");

        }catch(Exception e){
            e.printStackTrace();
        }
    }else {
        setVisible(false);
    }
    }
    public static void main(String [] args){
        new bookpackage("");
    }
}
