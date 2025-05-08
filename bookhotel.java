
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class bookhotel extends JFrame implements ActionListener{
    Choice chotel,croom,cfood;
    JTextField tfpersons,tfdays;
    JLabel lbl2username,lblid,lblnumber,lblphone,lbl2price,lbl2phone,lbl2number;
    JButton checkprice,bookhotel,back;
    String username;
    bookhotel(String username){
        this.username=username;
        setBounds(350,200,1100,600); 
        getContentPane().setBackground(Color.white);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
         JLabel text= new JLabel("BOOK HOTEL" );
         text.setBounds(100,10,200,30);
         text.setFont(new Font("Tahoma",Font.BOLD,20));
         add(text);
         
        JLabel lblusername= new JLabel("Username" );
        lblusername.setBounds(40, 70, 100, 20);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblusername);
        
        lbl2username= new JLabel( );
        lbl2username.setBounds(250, 70, 200, 20);
        lbl2username.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbl2username);
       
        JLabel selectpack= new JLabel("Select Hotel" );
        selectpack.setBounds(40, 110, 150, 20);
        selectpack.setFont(new Font("Tahoma",Font.BOLD,16));
        add(selectpack);
        
        chotel=new Choice();
        chotel.setBounds(250, 110, 200, 20);
        add(chotel);
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblpersons= new JLabel("Total Persons" );
        lblpersons.setBounds(40, 150, 150, 25);
        lblpersons.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblpersons);
        
        tfpersons=new JTextField("2");
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);
        
        JLabel lbldays= new JLabel("No.of Days" );
        lbldays.setBounds(40, 190, 150, 25);
        lbldays.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbldays);
        
        tfdays=new JTextField("2");
        tfdays.setBounds(250, 190, 200, 25);
        add(tfdays);
        
        JLabel lblac= new JLabel("AC/Non-AC" );
        lblac.setBounds(40, 230, 150, 25);
        lblac.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblac);
        
       croom=new Choice();
       croom.add("AC");
       croom.add("Non-AC");
        croom.setBounds(250, 230, 200, 20);
        add(croom);
        
        JLabel lblfood= new JLabel("Food Included" );
        lblfood.setBounds(40, 270, 150, 25);
        lblfood.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblfood);
        
       cfood=new Choice();
       cfood.add("YES");
       cfood.add("NO");
        cfood.setBounds(250, 270, 200, 20);
        add(cfood);
        
        
        lblid= new JLabel("Id" );
        lblid.setBounds(40, 310, 150, 20);
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblid);
        
        JLabel lbl2id= new JLabel( );
        lbl2id.setBounds(250, 310, 200, 25);
        lbl2id.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lbl2id);
        
        lblnumber= new JLabel("Number" );
        lblnumber.setBounds(40, 350, 150, 25);
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblnumber);
        
        lbl2number= new JLabel( );
        lbl2number.setBounds(250, 350, 150, 25);
        add(lbl2number);
        
        lblphone= new JLabel("Phone" );
        lblphone.setBounds(40, 390, 150, 25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblphone);
        
        lbl2phone= new JLabel( );
        lbl2phone.setBounds(250, 390, 200, 25);
        add(lbl2phone);
        
        JLabel lblprice= new JLabel("Total price" );
        lblprice.setBounds(40, 430, 150, 25);
        lblprice.setFont(new Font("Tahoma",Font.BOLD,16));
        add(lblprice);
        
        lbl2price= new JLabel( );
        lbl2price.setBounds(250, 430, 200, 25);
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
        checkprice.setBounds(60,490,120,25);
        checkprice.setBackground(Color.blue);
        checkprice.setForeground(Color.white);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(200,490,120,25);
        bookhotel.setBackground(Color.blue);
        bookhotel.setForeground(Color.white);
        bookhotel.addActionListener(this);
        add(bookhotel);
        
        back=new JButton("Back");
        back.setBounds(340,490,120,25);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image1=new JLabel(i3);
        image1.setBounds(500,50,600,300);
        add(image1);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
          try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"' ");
            while(rs.next()){
                int cost=Integer.parseInt(rs.getString("costperperson"));
                int food=Integer.parseInt(rs.getString("foodinclude"));
                int room=Integer.parseInt(rs.getString("acroom"));
                
                int persons=Integer.parseInt(tfpersons.getText());
                int days=Integer.parseInt(tfdays.getText());
                
                String acselected=croom.getSelectedItem();
                String foodselected=cfood.getSelectedItem();
                
                if(persons * days>0){
                    int total=0;
                    total +=acselected.equals("AC")? room:0;
                    total +=foodselected.equals("YES")? food:0;
                    total+=cost;
                    total=total*persons * days;
                    lbl2price.setText("Rs"+total);
                }else{
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
                }
            }
          }catch(Exception e){
        e.printStackTrace();
            }
    } else if(ae.getSource()==bookhotel){
            try{
            conn c=new conn();
            c.s.executeUpdate("insert into bookhotel1 values('"+lbl2username.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+croom.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+lblid.getText()+"','"+lbl2number.getText()+"','"+lbl2phone.getText()+"','"+lbl2price.getText()+"')");
        
            JOptionPane.showMessageDialog(null,"Booked Hotel Successfully");

        }catch(Exception e){
            e.printStackTrace();
        }
    }else {
        setVisible(false);
    }
    }
    public static void main(String [] args){
        new bookhotel("Talha");
    }
}
