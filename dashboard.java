package travel.manegement.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class dashboard extends JFrame implements ActionListener{
    JButton addpersonaldetail,viewpackage,
            bookpackage1,viwepersonaldetail,about,
            updatepersonaldetail,checkpackage,viewbookhotels,payment,
            viewhotels,deletepersonaldetail,notepad,
            calculator,destination,bookhotels,exit;
    String username;
    dashboard(String username){
        this.username=username;
       // setBounds(0,0,1600,65);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setLocale(null);
        p1.setBackground(Color.blue);
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(0,0, 70, 70);
        p1.add(icon);
        
         JLabel heading =new JLabel("Dashboard");
         heading.setBounds(80, 10, 300, 40);
         heading.setForeground(Color.WHITE);
         heading.setFont(new Font("Times New Roman",Font.BOLD,30));
         p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLocale(null);
        p2.setBackground(Color.blue);
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addpersonaldetail=new JButton ("Add Personal Detail");
        addpersonaldetail.setBounds(0, 60, 500, 50);
        addpersonaldetail.setBackground(Color.blue);
        addpersonaldetail.setForeground(Color.white);
        addpersonaldetail.setFont(new Font("Times New Roman",Font.PLAIN,30));
        addpersonaldetail.setMargin(new Insets(0,0,0,50));
        addpersonaldetail.addActionListener(this);
        p2.add(addpersonaldetail);
        
        updatepersonaldetail=new JButton ("Update Personal Detail");
        updatepersonaldetail.setBounds(0, 60, 500, 50);
        updatepersonaldetail.setBackground(Color.blue);
        updatepersonaldetail.setForeground(Color.white);
        updatepersonaldetail.setFont(new Font("Times New Roman",Font.PLAIN,30));
        updatepersonaldetail.setMargin(new Insets(0,0,0,18));
        updatepersonaldetail.addActionListener(this);
        p2.add(updatepersonaldetail);
        
        viwepersonaldetail=new JButton ("View Detail");
        viwepersonaldetail.setBounds(0, 100, 500, 70);
        viwepersonaldetail.setBackground(Color.blue);
        viwepersonaldetail.setForeground(Color.white);
        viwepersonaldetail.setFont(new Font("Times New Roman",Font.PLAIN,30));
        viwepersonaldetail.setMargin(new Insets(0,0,0,150));
         viwepersonaldetail.addActionListener(this);
        p2.add(viwepersonaldetail);
        
        deletepersonaldetail=new JButton ("Delete Personel Detail");
        deletepersonaldetail.setBounds(0, 150, 500, 50);
        deletepersonaldetail.setBackground(Color.blue);
        deletepersonaldetail.setForeground(Color.white);
        deletepersonaldetail.setFont(new Font("Times New Roman",Font.PLAIN,30));
        deletepersonaldetail.setMargin(new Insets(0,0,0,29));
        deletepersonaldetail.addActionListener(this);
        p2.add(deletepersonaldetail);
        
        checkpackage=new JButton ("Check Package");
        checkpackage.setBounds(0, 200, 500, 50);
        checkpackage.setBackground(Color.blue);
        checkpackage.setForeground(Color.white);
        checkpackage.setFont(new Font("Times New Roman",Font.PLAIN,30));
        checkpackage.setMargin(new Insets(0,0,0,110));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
       bookpackage1=new JButton ("Book Package");
        bookpackage1.setBounds(0, 250, 500, 50);
        bookpackage1.setBackground(Color.blue);
        bookpackage1.setForeground(Color.white);
        bookpackage1.setFont(new Font("Times New Roman",Font.PLAIN,30));
        bookpackage1.setMargin(new Insets(0,0,0,120));
        bookpackage1.addActionListener(this);
        p2.add(bookpackage1);
        
        
        
        viewpackage=new JButton ("View Package");
        viewpackage.setBounds(0, 300, 500, 50);
        viewpackage.setBackground(Color.blue);
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Times New Roman",Font.PLAIN,30));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels=new JButton ("View Hotels");
        viewhotels.setBounds(0, 350, 500, 50);
        viewhotels.setBackground(Color.blue);
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Times New Roman",Font.PLAIN,30));
        viewhotels.setMargin(new Insets(0,0,0,135));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels=new JButton ("Book Hotel");
        bookhotels.setBounds(0, 400, 500, 50);
        bookhotels.setBackground(Color.blue);
        bookhotels.setForeground(Color.white);
        bookhotels.setFont(new Font("Times New Roman",Font.PLAIN,30));
        bookhotels.setMargin(new Insets(0,0,0,150));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookhotels=new JButton ("View Book Hotel");
        viewbookhotels.setBounds(0, 450, 550, 50);
        viewbookhotels.setBackground(Color.blue);
        viewbookhotels.setForeground(Color.white);
        viewbookhotels.setFont(new Font("Times New Roman",Font.PLAIN,30));
        viewbookhotels.setMargin(new Insets(0,0,0,90));
        viewbookhotels.addActionListener(this);
        p2.add(viewbookhotels);
        
        destination=new JButton ("Destination");
        destination.setBounds(0, 500, 550, 50);
        destination.setBackground(Color.blue);
        destination.setForeground(Color.white);
        destination.setFont(new Font("Times New Roman",Font.PLAIN,30));
        destination.setMargin(new Insets(0,0,0,150));
        destination.addActionListener(this);
        p2.add(destination);
        
        payment=new JButton ("Payments");
        payment.setBounds(0, 550, 550, 50);
        payment.setBackground(Color.blue);
        payment.setForeground(Color.white);
        payment.setFont(new Font("Times New Roman",Font.PLAIN,30));
        payment.setMargin(new Insets(0,0,0,175));
        payment.addActionListener(this);
        p2.add(payment);
        
         notepad=new JButton ("Notepad");
        notepad.setBounds(0, 700, 550, 50);
        notepad.setBackground(Color.blue);
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Times New Roman",Font.PLAIN,30));
        notepad.setMargin(new Insets(0,0,0,190));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        calculator=new JButton ("Calculator");
        calculator.setBounds(0, 650, 550, 50);
        calculator.setBackground(Color.blue);
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Times New Roman",Font.PLAIN,30));
        calculator.setMargin(new Insets(0,0,0,170));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        about=new JButton ("About");
        about.setBounds(0, 750, 550, 50);
        about.setBackground(Color.blue);
        about.setForeground(Color.white);
        about.setFont(new Font("Times New Roman",Font.PLAIN,30));
        about.setMargin(new Insets(0,0,0,220));
        about.addActionListener(this);
        p2.add(about);
        
        exit=new JButton ("Exit");
        exit.setBounds(0, 850, 550, 50);
        exit.setBackground(Color.blue);
        exit.setForeground(Color.white);
        exit.setFont(new Font("Times New Roman",Font.PLAIN,30));
        exit.setMargin(new Insets(0,0,0,250));
        exit.addActionListener(this);
        p2.add(exit);
        
   ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("images/dest1.jpg"));
        Image i5=i4.getImage().getScaledInstance(1500,880,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel screen=new JLabel(i6);
        screen.setBounds(5, 5, 1650, 1000);
        add(screen);
        
        JLabel text= new JLabel("Tarvel And Tourism Management System" );
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.DARK_GRAY);
        text.setFont(new Font("Times New Roman",Font.PLAIN,55));
        screen.add(text);
         
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==addpersonaldetail){
            new addcustomer(username);
        }else if(ae.getSource()==viwepersonaldetail){
            new viewcustomer(username);
        }else if(ae.getSource()==updatepersonaldetail){
            new updatecustomer(username);
        }else if(ae.getSource()== checkpackage){
            new  checkpackage();
        }else if(ae.getSource()==bookpackage1){
            new bookpackage(username);
        }else if (ae.getSource()==viewpackage){
            new Viewpackage(username);
        }else if (ae.getSource()==deletepersonaldetail){
            new deletecustomer(username);
        }else if(ae.getSource()==viewhotels){
            new checkhotels();
        }else if(ae.getSource()==destination){
            new Destination();
        }else if(ae.getSource()==bookhotels){
            new bookhotel(username);
        }else if(ae.getSource()==viewbookhotels){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payment){
            new payment();
        }else if(ae.getSource()==calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==about){
            new About();
        }exit.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Alert!!!!", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        /*else if(ae.getSource()==exit){
        setVisible(false);
        new Login();
    }*/
    }
    
    public static void main(String [] args){
         new dashboard("");
         
    }
    
}