/*
    Author @Gaurav Amarnani.

    Published @3 January 5:10 PM.

    Q. Write a program to demonstrate GridLayout of 5 * 5.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Question1 extends Frame {
    
    //Variables : 
    private TextArea information;
    private GridLayout gridLayout;
    private Font font;
    
    public static void main(String...args) {
        Question1 question1 = new Question1();
        question1.setTitle("Question 1.");
        question1.setSize(600, 500);
        question1.setLocationRelativeTo(null);
        question1.setVisible(true);
        question1.setResizable(false);
        question1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                question1.dispose();
            }
        });
    }
    
    public Question1() {
        init();
    }
    
    public void init() {
        try {
            
            //Initialization : 
            information = new TextArea("Time : \n" + new Date() + "\nIP Address : \n" + (InetAddress.getLocalHost()).getHostAddress(), 5, 10);
            gridLayout = new GridLayout(5, 5);
            font = new Font("Comic Sans MS", Font.BOLD, 30);
            
            //Layout for Frame : 
            setLayout(gridLayout);
            setFont(font);
            information.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
            
            //Adding to Frame : 
            add(information);
            for(int i = 1; i < 25; i++) {
                add(new Button("" + i));
            }
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
    }
}