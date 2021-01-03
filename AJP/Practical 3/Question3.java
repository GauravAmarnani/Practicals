/*
    Author @Gaurav Amarnani.

    Published @3 January 5:25 PM.

    Q. Write a program to get following output.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Main Class : 
public class Question3 extends Frame {
    
    //Variables : 
    private GridLayout gridLayout;
    private Font font;
    
    public static void main(String...args) {
        Question3 question3 = new Question3();
        question3.setTitle("Question 3.");
        question3.setSize(600, 200);
        question3.setLocationRelativeTo(null);
        question3.setVisible(true);
        question3.setResizable(false);
        question3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                question3.dispose();
            }
        });
    }
    
    public Question3() {
        init();
    }
    
    public void init() {
        try {
            
            //Initialization : 
            gridLayout = new GridLayout(3, 2, 20, 20);
            font = new Font("Comic Sans MS", Font.BOLD, 30);
            
            //Layout for Frame : 
            setLayout(gridLayout);
            setFont(font);
            
            //Adding to Frame :
            for(int i = 1; i < 6; i++) {
                add(new Button("Button " + i));
            }
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}