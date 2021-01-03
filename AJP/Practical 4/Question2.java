/*
    Author @Gaurav Amarnani.

    Published @3 January 7:10 PM.

    Q. Write a program to get following output.
*/

import java.awt.Button;  
import java.awt.Dimension;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JFrame;

public class Question2 extends JFrame {  
    
    //Variables :
    private GridBagConstraints gridBagConstraints;
    private GridBagLayout gridBagLayout;
    
    public static void main(String[] args) {  
        Question2 question2 = new Question2();  
        question2.setTitle("GridBag Layout Example");
        question2.setSize(600, 500);  
        question2.setPreferredSize(new Dimension(600, 500));  
        question2.setVisible(true);
        question2.setLocationRelativeTo(null);
        question2.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  

    public Question2() {  
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
        this.add(new Label("Name : "), gridBagConstraints);
        
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        this.add(new TextField(), gridBagConstraints);
        
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        this.add(new Label("Comments : "), gridBagConstraints);
        
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        this.add(new TextArea(), gridBagConstraints);
        
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 2;
        this.add(new Button("Submit"), gridBagConstraints);
    }
}  