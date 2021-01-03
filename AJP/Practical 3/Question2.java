/*
    Author @Gaurav Amarnani.

    Published @3 January 5:20 PM.

    Q. Write a program to display the numbers from 0 to 9.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Main Class : 
public class Question2 extends Frame {
    
    //Variables : 
    private GridLayout gridLayout;
    private Font font;
    
    public static void main(String...args) {
        Question2 question2 = new Question2();
        question2.setTitle("Question 2.");
        question2.setSize(600, 500);
        question2.setLocationRelativeTo(null);
        question2.setVisible(true);
        question2.setResizable(false);
        question2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                question2.dispose();
            }
        });
    }
    
    public Question2() {
        init();
    }
    
    public void init() {
        try {
            
            //Initialization : 
            gridLayout = new GridLayout(2, 5);
            font = new Font("Comic Sans MS", Font.BOLD, 30);
            
            //Layout for Frame : 
            setLayout(gridLayout);
            setFont(font);
            
            //Adding to Frame :
            for(int i = 0; i < 10; i++) {
                add(new Button("" + i));
            }
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
    }
}