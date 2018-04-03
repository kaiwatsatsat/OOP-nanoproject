package nanooop;

import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
/******************************************************************************************************************************/
class LoginForm extends JFrame implements ActionListener,MouseListener {
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
    }
    private void initComponents() {
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabelRegister = new JLabel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        JLabel title = new JLabel("PERSONAL ACCOUNTANT");
        title.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        title.setForeground(new Color(248, 148, 6));
        jLabel4.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new Color(236, 240, 241));
        jLabel4.setText("Username:");
        jLabel5.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new Color(236, 240, 241));
        jLabel5.setText("Password:");
        jTextField1.setBackground(new Color(108, 122, 137));
        jTextField1.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jTextField1.setForeground(new Color(228, 241, 254));
        jPasswordField1.setBackground(new Color(108, 122, 137));
        jPasswordField1.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jPasswordField1.setForeground(new Color(228, 241, 254));
        jButton1.setBackground(new Color(34, 167, 240));
        jButton1.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(this);
        jButton2.setBackground(new Color(242, 38, 19));
        jButton2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(this);
        jLabelRegister.setFont(new Font("SansSerif",2, 15)); // NOI18N
        jLabelRegister.setForeground(new Color(255, 255, 255));
        jLabelRegister.setText("click here to create a new account");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(this);
        //setLayout(new FlowLayout());
        setSize(750,500);
        JPanel p = new JPanel(new GridLayout(9,3,0,15));
        p.setBackground(new Color(44, 62, 80));
        add(p);
        p.add(new JLabel(""));p.add(title);p.add(new JLabel(""));p.add(new JLabel(""));
        p.add(jLabel4); p.add(new JLabel(""));p.add(new JLabel(""));
        p.add(jTextField1);p.add(new JLabel(""));p.add(new JLabel(""));
        p.add(jLabel5); p.add(new JLabel(""));p.add(new JLabel(""));
        p.add(jPasswordField1); p.add(new JLabel(""));p.add(new JLabel(""));
        JPanel p2 = new JPanel(new GridLayout(1,2,20,20));
        p.add(p2);p.add(new JLabel(""));
        p2.add(jButton1);
        p2.add(jButton2);p.add(new JLabel(""));
        p.add(jLabelRegister);p.add(new JLabel(""));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);   
    }
     void jLabelRegisterMouseClicked() {
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       //this.dispose();
    }
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabelRegister;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jButton1)
        {
            NanoOOP.username = jTextField1.getText();
            NanoOOP.pass = jPasswordField1.getText();
            System.out.println(NanoOOP.username+" "+NanoOOP.pass);
            System.out.println("kaka");
            System.out.println(NanoOOP.pass.length() + " " + NanoOOP.pass + " . " +NanoOOP.username.length()+ " "+NanoOOP.username);
            //yahape DB se check bhi krna chihiye ki username exist karta h ya nahi//
            if(NanoOOP.username.length()==0 ||NanoOOP.pass.length()==0)
            {
                   new ErrorForLogin();return;//
                   //f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            } 
            //if(!Macthedfromdb)new ErrorForLogin();return;
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
            NanoOOP.gg=new DashBoard(); 
             Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
             NanoOOP.gg.setLocation(dim.width/2-NanoOOP.gg.getSize().width/2, dim.height/2-NanoOOP.gg.getSize().height/2);        
        }
        if(e.getSource()==jButton2)
        {
            System.exit(0);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {jLabelRegisterMouseClicked();}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e)  {}
}

/************************************************************************************************************************************************/
class RegisterForm extends JFrame implements ActionListener,MouseListener {

    public RegisterForm() {
        initComponents();
    }
    private void initComponents() {
        jLabel2 = new JLabel();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButtonRegister = new JButton();
        jButton2 = new JButton();
        jLabelRegister = new JLabel();
        jLabel6 = new JLabel();
        jTextField2 = new JTextField();
        jLabel7 = new JLabel();
        jTextField3 = new JTextField();
        jLabel8 = new JLabel();
        jPasswordField2 = new JPasswordField();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(475, 325);
        JPanel m = new JPanel(new GridLayout(8, 1));
        m.setBackground(new Color(44, 62, 80));
        JPanel ma = new JPanel(new GridLayout(1, 2));
        ma.setBackground(new Color(248, 148, 6));
        jLabel2.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Register");
        jPanel2.setBackground(new Color(44, 62, 80));
        ma.add(jLabel2);
        ma.add(new JLabel(""));
        m.add(ma);
        JPanel me = new JPanel(new GridLayout(1, 2));
        jLabel6.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new Color(200, 100, 201));
        jLabel6.setText("First Name:");
        jTextField2.setBackground(new Color(108, 122, 137));
        jTextField2.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jTextField2.setForeground(new Color(228, 241, 254));
        me.add(jLabel6);
        me.add(jTextField2);
        m.add(me);
        JPanel mf = new JPanel(new GridLayout(1, 2));
        jLabel7.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new Color(200, 100, 201));
        jLabel7.setText("Last Name:");
        jTextField3.setBackground(new Color(108, 122, 137));
        jTextField3.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jTextField3.setForeground(new Color(228, 241, 254));
        mf.add(jLabel7);
        mf.add(jTextField3);
        m.add(mf);
        JPanel mb = new JPanel(new GridLayout(1, 2));
        jLabel4.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new Color(200, 100, 201));
        jLabel4.setText("Username:");
        mb.add(jLabel4);
        jLabel5.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new Color(200, 100, 201));
        jLabel5.setText("Password:");
        JPanel mc = new JPanel(new GridLayout(1, 2));
        jTextField1.setBackground(new Color(108, 122, 137));
        jTextField1.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jTextField1.setForeground(new Color(228, 241, 254));
        mb.add(jTextField1);
        m.add(mb);
        jPasswordField1.setBackground(new Color(108, 122, 137));
        jPasswordField1.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jPasswordField1.setForeground(new Color(228, 241, 254));
        mc.add(jLabel5);
        mc.add(jPasswordField1);
        m.add(mc);
        JPanel zz = new JPanel(new GridLayout(1, 2));
        jLabel8.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new Color(200, 100, 201));
        jLabel8.setText("Retype Pass:");
        jPasswordField2.setBackground(new Color(108, 122, 137));
        jPasswordField2.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jPasswordField2.setForeground(new Color(228, 241, 254));
        zz.add(jLabel8);
        zz.add(jPasswordField2);
        m.add(zz);
        JPanel md = new JPanel(new GridLayout(1, 2));
        jButtonRegister.setBackground(new Color(34, 167, 240));
        jButtonRegister.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegister.setForeground(new Color(255, 255, 255));
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(this);
        jButton2.setBackground(new Color(242, 38, 19));
        jButton2.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(this);
        md.add(jButtonRegister);
        md.add(jButton2);
        m.add(md);
        jLabelRegister.setFont(new Font("SansSerif", Font.BOLD, 20)); // NOI18N
        jLabelRegister.setForeground(new Color(255, 255, 255));
        jLabelRegister.setText(" CLICK HERE to go back on LOGIN PAGE ");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(this);
       // m.add(jLabelRegister);
        add(m);
        this.setLocationRelativeTo(null);// center form in the screen
    }// </editor-fold>//GEN-END:initComponents
    void jLabelRegisterMouseClicked() {//GEN-FIRST:event_jLabelRegisterMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked
    private JButton jButton2;
    private JButton jButtonRegister;
    private JLabel jLabel2;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabelRegister;
    private JPanel jPanel2;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==jButtonRegister)
            {
                NanoOOP.freshuname= jTextField1.getText();
                NanoOOP.freshpass= jPasswordField1.getText();
                NanoOOP.freshfirstname=jTextField2.getText();
                NanoOOP.freshlastname=jTextField3.getText();
                NanoOOP.freshlyregistered=true;
                System.out.println(NanoOOP.freshpass.length() + " " + NanoOOP.freshpass + " . " +NanoOOP.freshuname.length()+ " "+NanoOOP.freshuname);
                if(NanoOOP.freshpass.length() == 0 ||NanoOOP.freshuname.length() == 0 || jTextField2.getText().length()==0 || jTextField3.getText().length()==0 || NanoOOP.freshpass.compareTo(jPasswordField2.getText())!=0)
                {
                    NanoOOP.freshpass=null;
                    NanoOOP.freshlyregistered=false;
                    new ErrorForSignUp();return;           
                }        
            dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
            //enter in database
            }
            else if(e.getSource()==jButton2)
            {
                dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
            } 
            else{}
            }
        catch(Exception eee){}
    }
    @Override
    public void mouseClicked(MouseEvent e) {jLabelRegisterMouseClicked();}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
/************************************************************************************************************************************************/
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
        l.setFont(new Font("Tahoma", 0, 15));
        ok.setFont(new Font("Tahoma", 0, 15));
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
        p=new JPanel(new GridLayout(2,1));
        l=new JLabel("Invalid valid username or password");
        ok=new JButton("OK");
        l.setFont(new Font("Tahoma", 0, 15));
        ok.setFont(new Font("Tahoma", 0, 15));
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
/************************************************************************************************************************************************/
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
/************************************************************************************************************************************************/
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
        button4.setFont(new Font("Tahoma", 0, 15)); // NOI18N
        button4.setForeground(new Color(0, 0, 255));
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
        //p.add(button2);
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
        if(e.getSource()==button1)
            new Income_Expense();
        if(e.getSource()==button4)
            new SelectMonth();   
         if(e.getSource()==mitem)
        {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            new LoginForm();
            dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));}
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
    static String freshfirstname=null,freshlastname=null,freshuname=null,freshpass=null;
    static boolean freshlyregistered=false;
    //
    static DashBoard gg;
    public static void main(String[] args) 
    {
        /* DashBoard gg=new DashBoard();
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
         gg.setLocation(dim.width/2-gg.getSize().width/2, dim.height/2-gg.getSize().height/2);*/
        new LoginForm();
         Refresher r=new Refresher(gg);
         r.t.start();
    }    
}

class intro extends JFrame
{
    intro()
    {
        setUndecorated(true);
        setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2-300, dim.height/2-getSize().height/2-200);
        JLabel img =new JLabel();
        img.setIcon(new ImageIcon(getClass().getResource("/nanooop/sign in.jpg")));
        img.setText("");
        add(img);
        pack();try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {}
        this.dispose();
    }
}
class success extends JFrame
{
    success()
    {
        setUndecorated(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2-300, dim.height/2-getSize().height/2-200);
        JLabel xx =new JLabel();
        xx.setIcon(new ImageIcon(getClass().getResource("/nanooop/intro.jpg")));
        xx.setText("");
        add(xx);
        pack();
        setVisible(true);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException ex) {}
        this.dispose();
    }
}
