package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

class income_expense //implements ActionListener
{  
    JFrame f;
    JTabbedPane inexp_buttons;
    GridLayout income_grid,expense_grid;
    JLabel n;
    JTextField amount,amount1;
    Font font1;
    JPanel income_panel,expense_panel;
    JList<String> list;
        
    income_expense ()
    {  
        f = new JFrame();
        income_grid = new GridLayout(3,4);
        expense_grid = new GridLayout(3,4);
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
        //////////////////////////////////////////////////////////////
        income_panel.add(new JLabel(" "));
        n = new JLabel("AMOUNT : ");
        income_panel.add(n);
        income_panel.add(amount1);
        income_panel.add(new JLabel(" "));
        income_panel.add(new JLabel(" "));
        n = new JLabel(" TYPE : ");income_panel.add(n);
        String[] arr ={" CHEQUE "," CASH : "};
        list = new JList<>(arr);
        income_panel.add(list);
        income_panel.add(new JLabel(" "));
        income_panel.add(new JLabel(" "));
        JButton x = new JButton("ADD");
        income_panel.add(x);x = new JButton("CANCEL");income_panel.add(x);
        income_panel.add(new JLabel(" "));
        //////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////
        expense_panel.add(new JLabel(" "));
        n = new JLabel("AMOUNT : ");
        expense_panel.add(n);expense_panel.add(amount);
        expense_panel.add(new JLabel(" "));
        expense_panel.add(new JLabel(" "));
        n = new JLabel(" TYPE : ");expense_panel.add(n);
        list = new JList<>(arr);
        expense_panel.add(list);
        expense_panel.add(new JLabel(" "));
        expense_panel.add(new JLabel(" "));
        x = new JButton("ADD");
        expense_panel.add(x);x = new JButton("CANCEL");expense_panel.add(x);
        expense_panel.add(new JLabel(" "));
        //////////////////////////////////////////////////////////////
          
        inexp_buttons.add(" INCOME ",income_panel);
        inexp_buttons.add(" EXPENSE ",expense_panel);
      
       
        f.add(inexp_buttons);  
        f.setSize(350,200);
        f.setVisible(true); 

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class NewMain {
    public static void main(String[] args) {
        new income_expense();
      }  
}
