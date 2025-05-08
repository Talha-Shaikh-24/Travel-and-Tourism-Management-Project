
package travel.manegement.system;
import javax.swing.*;
import java.awt.*;
public class splash extends JFrame implements Runnable {
    Thread thread;
    splash(){
        /*setSize(1200,600);
        setLocation(300,200);*/
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash34.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
       
        setVisible(true);
        thread=new Thread(this);
        thread.start();
    }
    public void run(){
        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }
        catch(Exception e){
            
        }
        
    }
    public static void main(String [] args){
      
        splash frame=new splash();
        int x=1;
        for(int i=1;i<=500;x+=7,i+=6){
            frame.setLocation(750-(x+i)/2,400-(i/2));
            frame.setSize(x+i,i);
            try{
                Thread.sleep(5);
             
            }
            catch(Exception e){
        }}
        
    }
}
