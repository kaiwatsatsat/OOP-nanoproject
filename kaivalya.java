package nanooop;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


 class DashBoard extends JFrame implements ActionListener
{
    JButton button1,button2,button3,button4;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextArea ta;
    JMenuBar mmb;
    JMenu menu;
    JMenuItem mitem;
    JPanel p;
    DashBoard()
    {
        p=new JPanel(null);
        ta=new JTextArea();
        button1=new JButton();
        button2=new JButton();
        button3=new JButton();
        button4=new JButton();
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        l6=new JLabel();
        l7=new JLabel();
        mmb=new JMenuBar();
        menu =new JMenu();
        mitem=new JMenuItem();
        
        button1.setIcon(new ImageIcon(getClass().getResource("/nanooop/plusicon.png")));
        
        button2.setFont(new Font("Tahoma", 1, 18)); 
        button2.setForeground(new Color(0, 0, 255));
        button2.setText("Perodic Transaction");
        button2.setOpaque(false);
        
        button3.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        button3.setForeground(new Color(0, 0, 255));
        button3.setText("Full DB");
        
        l1.setFont(new Font("Tahoma", 0, 18));
        l1.setText("EXPENSES↓:");
        
        button4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        button4.setForeground(new java.awt.Color(0, 0, 255));
        button4.setText("Select Month");
        
        l2.setFont(new Font("Tahoma", 0, 18)); 
        l2.setText("INCOME↑:");
        
        l3.setFont(new Font("Tahoma", 0, 18)); 
        l3.setText("labelforexp");
        
        l4.setFont(new Font("Tahoma", 0, 18)); 
        l4.setText("labelforinc");
        
        l5.setFont(new Font("Tahoma", 0, 20)); 
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        l5.setText("December-2015");
        
        ta.setBackground(new Color(51, 255, 204));
        ta.setColumns(20);
        ta.setFont(new Font("Monospaced", 0, 15));
        ta.setRows(5);
        
        l6.setIcon(new ImageIcon(getClass().getResource("/nanooop/bg1.png"))); // NOI18N
        l6.setText("");
        
        menu.setText("Settings");
        mitem.setText("Sign Out");
        menu.add(mitem);
        mmb.add(menu);
        
        add(p);
        setVisible(true);
        setResizable(false);
        setSize(557,830);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setSize(550,800);
        
        p.add(button1);
        button1.setBounds(440, 667, 110, 103);
        p.add(button2);
        button2.setBounds(0, 680, 220, 90);
        p.add(button3);
        button3.setBounds(199, 620, 140, 40);
        p.add(l1);
        l1.setBounds(10, 90, 100, 30);
        p.add(button4);
        button4.setBounds(429, 0, 120, 40);
        p.add(l2);
        l2.setBounds(10, 120, 100, 30);
        p.add(l3);
        l3.setBounds(120, 90, 90, 30);
        p.add(l4);
        l4.setBounds(120, 120, 90, 30);
        p.add(l5);
        l5.setBounds(160, 200, 200, 40);
        p.add(ta);
        ta.setBounds(80, 300, 380, 160);
        p.add(l6);
        l6.setBounds(0, 0, 550, 780);
        setJMenuBar(mmb);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        mitem.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mitem)
        {
           new Kartikclass();
        }
        if(e.getSource()==button1)
        {
            new Income_Expense();
        }
    }
}


public class NanoOOP {

    
    public static void main(String[] args) {
        new DashBoard();
    }
    
}
