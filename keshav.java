package asach 1;

/*
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
 */

public class file {
 
   public file() {
        JFrame frame = new JFrame("expense income");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
         frame.setLayout(null);
 
        JButton income = new JButton("income");
        JButton expense = new JButton("expense");
        
        frame.add(expense);
        frame.add(income);
        
        income.setBounds(25, 25, 90, 20);
        expense.setBounds(115, 25, 90, 20);
        
        GridLayout options = new GridLayout(4,2);
      
        
        //amount textbox
        //type textbox
        //cheque cash //dropdown or radiobutton
        // ok   cancel  //button 
     //   frame.add(//Grid);
        
       
        frame.setSize(500,600);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        new file();
    }
}
