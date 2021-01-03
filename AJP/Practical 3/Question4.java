/*
    Author @Gaurav Amarnani.

    Published @3 January 5:30 PM.

    Q. Write a program to get following output.
*/

//Importing Classes : 
import java.awt.Label;
import java.awt.Font;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Main Class : 
public class Question4 extends Frame {
    
    //Variables : 
    private BorderLayout borderLayout;
    private Panel panel;
    private Font font;
    
    public static void main(String...args) {
        Question4 question4 = new Question4();
        question4.setTitle("Question 3.");
        question4.setSize(320, 350);
        question4.setLocationRelativeTo(null);
        question4.setVisible(true);
        question4.setResizable(false);
        question4.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                question4.dispose();
            }
        });
    }
    
    public Question4() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            setLayout(borderLayout);
            setFont(font);
            
            //Initialization : 
            font = new Font("Comic Sans MS", Font.BOLD, 30);
            panel = new Panel();
            borderLayout = new BorderLayout();
            borderLayout.setHgap(10);
            borderLayout.setVgap(10);
            panel.setLayout(borderLayout);        

            //Placement : 
            panel.setBounds(20, 50, 300, 300);
            
            panel.add(new Button("Center"),BorderLayout.CENTER);
            panel.add(new Button("East"),BorderLayout.EAST);   
            panel.add(new Button("West"),BorderLayout.WEST); 
            panel.add(new Button("North"),BorderLayout.NORTH); 
            panel.add(new Button("South"),BorderLayout.SOUTH); 
            add(panel);           
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}