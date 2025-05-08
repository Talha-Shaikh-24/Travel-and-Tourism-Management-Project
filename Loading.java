
package travel.manegement.system;
import java.awt.*;
import javax.swing.*;
public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max=bar.getMaximum();//100
                int value=bar.getValue();
                if(value<max){//101<100
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    new dashboard(username);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    Loading(String username){
        this.username=username;
        t=new Thread(this);
  setBounds(500,200,650,400);
         JLabel text=new JLabel("Travel and Tourism Manegement");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.GREEN);
        text.setFont(new Font("Times New Roman",Font.BOLD,35));
        add(text);
        
        bar=new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading=new JLabel("Loading please wait...");
        loading.setBounds(230,130,150,30);
        loading.setForeground(Color.MAGENTA);
        loading.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(loading);
        
        
        JLabel lb1username=new JLabel(" Welcome "+username);
        lb1username.setBounds(20,310,400,40);
        lb1username.setForeground(Color.MAGENTA);
        lb1username.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(lb1username);
        
        t.start();
        
        setVisible(true);
    }
     public static void main(String [] args){
         new  Loading("");
     }
    
}
