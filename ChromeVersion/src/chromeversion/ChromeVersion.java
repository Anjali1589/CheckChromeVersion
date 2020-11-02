package chromeversion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class ChromeVersion extends JFrame implements ActionListener 
{

   
      JButton b1,b2,b3;
      JTextField t1;
      JPasswordField t2;
      ChromeVersion()
    {
        super("Chrome Version");
        setBounds(450,500,400,450);
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        setSize(400,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        javax.swing.border.Border border1 = BorderFactory.createLineBorder(Color.BLUE.darker(), 4);
        
         JPanel j1=new JPanel();
         j1.setBackground(Color.white);
         j1.setBounds(0,0,394,421);
         add(j1);
         j1.setLayout(null);
         j1.setBorder(border1);
       
       
        Font f2=new Font("Arial",Font.BOLD,20);
        Font f1=new Font("Arial",Font.BOLD,20);
        JPanel l=new JPanel();
        l.setLayout(null);
        l.setSize(300,400);
        l.setBackground(new Color(0,0,0,0));
        l.setBounds(70, 50,260 , 300);
        j1.add(l);
        
        JLabel l2=new JLabel("Click here to get Chrome Version ");
        l2.setFont(f1);
        l2.setForeground(Color.blue.darker());
        l2.setBounds(40,20,320,40);
        j1.add(l2);
     
        
         b1 = new JButton("Windows");
         b1.setLayout(null);
         b1.setBackground(Color.blue.darker());
         b1.setForeground(Color.WHITE);
         b1.setBounds(20,60,240,40);
         b1.addActionListener(this);
         b1.setFont(f2);
         b1.setLayout(null);
         l.add(b1); 
         
       
         b2=new JButton("Ubuntu");
         b2.setLayout(null);
         b2.setBackground(Color.blue.darker());
         b2.setForeground(Color.WHITE);
         b2.setBounds(20,200,240,40);
         b2.addActionListener(this);
         b2.setFont(f2);
         b2.setLayout(null);
         l.add(b2);
         
        
         
        
        
        
           setLocationRelativeTo(null);
           setLayout(null);
           setVisible(true); 
    }
     public static void main(String s[])
    {
        new ChromeVersion();
    }


    @Override
    public void actionPerformed(ActionEvent ae) 
    {
            if(ae.getSource() == b1) 
            {
                String command = "wmic datafile where name=\"C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe\" get Version /value";
		try
                {
                    JFrame x=new JFrame();
		    String line;
		    Process process = Runtime.getRuntime().exec(command);
		    BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    while ((line = input.readLine()) != null) 
                    {
                     System.out.println(line);
                    // JOptionPane.showMessageDialog(x,"Chrome "+ line);  
		    }
		} catch (IOException e)
		{
		    e.printStackTrace();
		}
                    
            }
            
            if(ae.getSource() == b2) 
            {
                String command = "google-chrome --version";
                try
                {
                    JFrame x=new JFrame();
		    String line;
		    Process process = Runtime.getRuntime().exec(command);
		    BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    while ((line = input.readLine()) != null) 
                    {
                     System.out.println(line);
                    // JOptionPane.showMessageDialog(x,"Chrome "+ line);  
		    }
		} catch (IOException e)
		{
		    e.printStackTrace();
		}
                    
            }
    }
}
 



