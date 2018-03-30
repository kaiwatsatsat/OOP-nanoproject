package nanooop;

import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/******************************************************************************************************************************/


class Login implements ActionListener
{
    
    JFrame f;
    JPanel p;
    JButton signup;
    JButton login;
    JTextField uname = new JTextField();
    JPasswordField passw = new JPasswordField();
    final JLabel un = new JLabel("Username:             ");
    final JLabel pswd = new JLabel("Password:           ");
    final JLabel or = new JLabel("        Or");
    final JLabel emp = new JLabel("");
    public Login()
    {
        f = new JFrame("Login");
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        p = new JPanel(new GridLayout(4,2,20,20));
        p.setSize(300,300);
        f.add(p);
        p.add(un); 
        p.add(uname);
        p.add(pswd); 
        p.add(passw);
        login = new JButton("Login"); login.addActionListener(this);
        uname.addActionListener(this);
        passw.addActionListener(this);
        p.add(login);
        p.add(or);
        uname.setText("");
        passw.setText("");
        signup = new JButton("Signup"); 
        p.add(signup); signup.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==signup)
        {
            new Signup();
        }
        
        if(e.getSource()==login)
        {
            System.out.println("kaka");
            //yahape DB se check bhi krna chihiye ki username exist karta h ya nahi//
            if(NanoOOP.username==null||NanoOOP.pass==null)
            {
                   new ErrorForLogin();return;//
                   //f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            } 
            
             NanoOOP.gg=new DashBoard();
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
             NanoOOP.gg.setLocation(dim.width/2-NanoOOP.gg.getSize().width/2, dim.height/2-NanoOOP.gg.getSize().height/2);
            f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
        }
        if(e.getSource()==uname)
        {
            System.out.println("mama");
            NanoOOP.username=uname.getText();
        }
        if(e.getSource()==passw)
        {
            NanoOOP.pass=passw.getText();
        }
        /*String user = uname.getText();
        String pass = passw.getText();
        if(user==""||pass=="")
            new LoginError();
        System.out.println(user+"\t"+pass);*/
        
    }
}




class Signup implements ActionListener
{
    private JFrame f;
    JPanel p;
    private JButton register;
    private JTextField uname = new JTextField();
    private JPasswordField passw = new JPasswordField();
    private final JLabel un = new JLabel("Username:             ");
    private final JLabel pswd = new JLabel("Password:           ");
    public Signup()
    {
        f = new JFrame("Sign Up");
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        p = new JPanel(new GridLayout(4,2,20,20));
        p.setSize(300,300);
        uname.setText("");
        passw.setText("");
        f.add(p);
        p.add(un); 
        p.add(uname);
        p.add(pswd); 
        p.add(passw);
        register = new JButton("Register"); 
        p.add(register); register.addActionListener(this);
        uname.addActionListener(this);
        passw.addActionListener(this);
        f.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
    }
    @Override
    public void actionPerformed(ActionEvent e1)
    {
        if(e1.getSource()==uname)
        {
            System.out.println("kaka");
            NanoOOP.freshuname=uname.getText();
        }
        if(e1.getSource()==passw)
        {
            System.out.println("mama");
            NanoOOP.freshpass=passw.getText();
        }
        if(e1.getSource()==register)
        {
            if(NanoOOP.freshpass==null||NanoOOP.freshuname==null)
            {
                new ErrorForSignUp();return;
                
            }
            f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
        }
    }
}

class ErrorForSignUp extends JFrame implements ActionListener
{
    JPanel p;
    JLabel l;
    JButton ok;
    ErrorForSignUp()
    {
        p=new JPanel(new GridLayout(2,1));
        l=new JLabel("Enter a valid username or password");
        ok=new JButton("OK");
        l.setFont(new Font("Tahoma", 0, 18));
        ok.setFont(new Font("Tahoma", 0, 18));
        setLayout(new FlowLayout());
        add(p);
        p.add(l);
        p.add(ok);
        setVisible(true);
        setSize(310,130);
        p.setSize(310,130);
        ok.addActionListener(this);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @Override
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource()==ok)
        {
            dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        }
    }
}
class ErrorForLogin extends JFrame implements ActionListener
{
    JPanel p;
    JLabel l;
    JButton ok;
    ErrorForLogin()
    {
        JFrame f;
        
        p=new JPanel(new GridLayout(2,1));
        l=new JLabel("Enter a valid username or password");
        ok=new JButton("OK");
        l.setFont(new Font("Tahoma", 0, 18));
        ok.setFont(new Font("Tahoma", 0, 18));
        setLayout(new FlowLayout());
        add(p);
        p.add(l);
        p.add(ok);
        setVisible(true);
        setSize(310,130);
        p.setSize(310,130);
        ok.addActionListener(this);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    @Override
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource()==ok)
        {
            dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        }
    }
}

/******************************************************************************************************************************/



class SelectMonth extends JFrame implements ActionListener
{    
    JLabel mon,yer;
    JPanel p;
    JComboBox jcb;
    JTextField tf;
    SelectMonth()
    {
        setVisible(true);
        mon=new JLabel();
        yer=new JLabel();
        tf=new JTextField();
        p=new JPanel(new GridLayout(2,2));
        jcb= new JComboBox<>();
        jcb.setModel(new DefaultComboBoxModel<>(new String[] {"January","February","March","April","May","June","July","August","September","October","November","December" }));
        mon.setFont(new Font("Tahoma", 0, 15));
        mon.setText("Month:");
        yer.setFont(new Font("Tahoma", 0, 15));
        yer.setText("Year:");
        tf.setFont(new Font("Tahoma",0,15));
        tf.setText("");
        
        p.setSize(240, 120);
        add(p);
        p.add(mon);
        p.add(yer);
        p.add(jcb);
        p.add(tf);
        setSize(239,119);
        setSize(240,120);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        tf.addActionListener(this);
        jcb.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ee)
    {
        if(ee.getSource()==jcb)
        {
            JComboBox temp=(JComboBox)ee.getSource();
            NanoOOP.tempmonth=(String)temp.getSelectedItem();
        }
        if(ee.getSource()==tf)
        {
           try{ Integer i=new Integer(tf.getText());
            NanoOOP.tempyear=i.intValue();}
            catch(Exception eee){}
           dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

class Income_Expense implements ActionListener
{  
    JFrame f;
    JTabbedPane inexp_buttons;
    GridLayout income_grid,expense_grid;
    JLabel n;
    JTextField amount,amount1;
    Font font1;
    JButton income_add,expense_add;
    JPanel income_panel,expense_panel;
    JList<String> list;
    JComboBox in_catagories,ex_catagories;
    com.toedter.calendar.JDateChooser cal1,cal2;
    
    
    Income_Expense ()
    {  
        cal1 =new com.toedter.calendar.JDateChooser();
        cal2 =new com.toedter.calendar.JDateChooser();
        
        f = new JFrame();
        income_grid = new GridLayout(5,4);
        expense_grid = new GridLayout(5,4);
        amount = new JTextField();
        font1 = new Font("SansSerif", Font.BOLD, 20);
        amount.setFont(font1);
        amount1 = new JTextField();
        amount1.setFont(font1);
        inexp_buttons = new JTabbedPane();
        
        income_panel= new JPanel();
        income_panel.setLayout(income_grid);
        income_panel.setBackground(Color.cyan);
        
        expense_panel= new JPanel();
        expense_panel.setLayout(income_grid);
        expense_panel.setBackground(Color.green);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();                          //this and the following line is used to make window open in center//
        f.setLocation(dim.width/2-f.getSize().width/2-200, dim.height/2-f.getSize().height/2-300);
        //////////////////////////////////////////////////////////////
        income_panel.add(new JLabel(" "));income_panel.add(new JLabel(" "));income_panel.add(new JLabel(" "));
        income_panel.add(cal1); 
        income_panel.add(new JLabel(" "));
        n = new JLabel("AMOUNT : ");
        income_panel.add(n);
        income_panel.add(amount1);
        income_panel.add(new JLabel(" "));income_panel.add(new JLabel(" "));
        n = new JLabel("CATAGORY : ");
        income_panel.add(n);
        in_catagories= new JComboBox<>();
        in_catagories.setModel(new DefaultComboBoxModel<>(new String[] {"SALARY","BONUS","LOTTERY","ADD-ONS"}));
        income_panel.add(in_catagories);
        income_panel.add(new JLabel(" "));
        income_panel.add(new JLabel(" "));
        n = new JLabel(" TYPE : ");income_panel.add(n);
        String[] arr ={" CHEQUE "," CASH "};
        list = new JList<>(arr);
        income_panel.add(list);
        income_panel.add(new JLabel(" "));
        income_panel.add(new JLabel(" "));
        income_add = new JButton("ADD");
        income_panel.add(income_add);JButton x = new JButton("CANCEL");income_panel.add(x);
        income_panel.add(new JLabel(" "));
        //////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////
        expense_panel.add(new JLabel(" "));expense_panel.add(new JLabel(" "));expense_panel.add(new JLabel(" "));
        expense_panel.add(cal2); 
        expense_panel.add(new JLabel(" "));
        n = new JLabel("AMOUNT : ");
        expense_panel.add(n);expense_panel.add(amount);
        expense_panel.add(new JLabel(" "));
        expense_panel.add(new JLabel(" "));
        n = new JLabel("CATAGORY : ");
        expense_panel.add(n);
        ex_catagories= new JComboBox<>();
        ex_catagories.setModel(new DefaultComboBoxModel<>(new String[] {"FUN","EDUCATION","TRAVELLING","BILLS","RENT","OTHER"}));
        expense_panel.add(ex_catagories);
        expense_panel.add(new JLabel(" "));
        expense_panel.add(new JLabel(" "));
        n = new JLabel(" TYPE : ");expense_panel.add(n);
        list = new JList<>(arr);
        expense_panel.add(list);
        expense_panel.add(new JLabel(" "));
        expense_panel.add(new JLabel(" "));
        expense_add = new JButton("ADD");
        expense_panel.add(expense_add);JButton y = new JButton("CANCEL");expense_panel.add(y);
        expense_panel.add(new JLabel(" "));
        //////////////////////////////////////////////////////////////
          
        inexp_buttons.add(" INCOME ",income_panel);
        inexp_buttons.add(" EXPENSE ",expense_panel);
        income_add.addActionListener(this);
        expense_add.addActionListener(this);
        f.add(inexp_buttons);  
        f.setSize(500,250);
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try{f.setVisible(false);
            Integer i;
            if(e.getSource()==income_add)
            { NanoOOP.where=1;NanoOOP.coice_in_category=in_catagories.getSelectedIndex();
              NanoOOP.count++;NanoOOP.date=cal1.getDate().getDate();
              NanoOOP.month=cal1.getDate().getMonth();NanoOOP.year=1900+cal1.getDate().getYear();
              i =new Integer(amount1.getText());NanoOOP.amount_entered= i.intValue(); }
            
            else if(e.getSource()==expense_add)
            { NanoOOP.where=2;NanoOOP.coice_in_category=ex_catagories.getSelectedIndex();
              NanoOOP.count++;NanoOOP.date=cal2.getDate().getDate();
              NanoOOP.month=cal2.getDate().getMonth();NanoOOP.year=1900+cal2.getDate().getYear();
              i =new Integer(amount1.getText());NanoOOP.amount_entered= i.intValue(); } 
            
            else{NanoOOP.where=0;} //cancel
            }
        catch(Exception eee){}
    }
}
/************************************************************************************************************************************************/
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
        l5.setText(NanoOOP.tempmonth+"-"+NanoOOP.tempyear);
        
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
        setSize(560,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setSize(550,800);
        
        p.add(button1);
        button1.setBounds(440, 587, 110, 103);
        p.add(button2);
        button2.setBounds(0, 600, 220, 90);
        p.add(button3);
        button3.setBounds(199, 540, 140, 40);
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
     /*   if(e.getSource()==mitem)
        {
           new Kartikclass();
        }*/
        if(e.getSource()==button1)
            new Income_Expense();
        if(e.getSource()==button4)
            new SelectMonth();   
    }
    void refresh()
    {
        l5.setText(NanoOOP.tempmonth+"-"+NanoOOP.tempyear);
        System.out.println(NanoOOP.date+" "+NanoOOP.month+" "+NanoOOP.year+" "+NanoOOP.count );
    }
}

class Refresher implements Runnable
{
    Thread t;
    DashBoard temp;
    Refresher(DashBoard tt)
    {
        t=new Thread(this,"");
        temp=tt;
    }
   @Override
   public void run()
   {
       while(true)
       {
           try{Thread.sleep(500);}catch(Exception ee){}
           try{NanoOOP.gg.refresh();}catch(Exception eee){}
       }
   }
}

public class NanoOOP {
    static String tempmonth="January";
    static int tempyear=2000;
    //
    static int amount_entered;
    static int where=0,coice_in_category;// where(1-income,2-expense) //what we chose 
    static int count=0;        //count tells us how many entries we added from keshavs window.This is gonna be used when storing in database//
    static int date,month,year;//all int 
    static String username=null,pass=null;
    static String freshuname=null,freshpass=null;
    static boolean freshlyregistered=false;
    //
    static DashBoard gg;
    public static void main(String[] args) 
    {
        /* DashBoard gg=new DashBoard();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         gg.setLocation(dim.width/2-gg.getSize().width/2, dim.height/2-gg.getSize().height/2);*/
        new Login();
         Refresher r=new Refresher(gg);
         r.t.start();
    }    
}
