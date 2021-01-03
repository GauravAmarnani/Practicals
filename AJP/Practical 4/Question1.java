/*
    Author @Gaurav Amarnani.

    Published @3 January 7:00 PM.

    Q. Write a program to get following output.
*/

import java.awt.Button;  
import java.awt.Dimension;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import javax.swing.JFrame;

public class Question1 extends JFrame {  
    
    //variables : 
    private GridBagLayout gridBagLayout;
    private GridBagConstraints gridBagConstraints;
    
    public static void main(String[] args) {  
        Question1 question1 = new Question1();  
        question1.setTitle("GridBag Layout Example");
        question1.setSize(300, 300);  
        question1.setPreferredSize(new Dimension(300, 300));  
        question1.setVisible(true);
        question1.setLocationRelativeTo(null);
        question1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  

    public Question1() {  
        init();
    }  

    private void init() {
        
        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();
        setLayout(gridBagLayout);
        
        gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        this.add(new Button("Button One"), gridBagConstraints);
        
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        this.add(new Button("Button two"), gridBagConstraints);
        
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        this.add(new Button("Button Three"), gridBagConstraints);
        
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        this.add(new Button("Button Four"), gridBagConstraints);
        
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 2;
        this.add(new Button("Button Five"), gridBagConstraints);
    }
}  