/*
    Author @Gaurav Amarnani.

    Published @1 January 4:30 PM.

    Q. Write a program to design a simple Calculator with the help of GridLayout.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Practical3 extends Frame {
    
    //Variables : 
    private TextArea information;
    private GridLayout gridLayout;
    private Font font;
    
    public static void main(String...args) {
        Practical3 practical3 = new Practical3();
        practical3.setTitle("Practical 3.");
        practical3.setSize(600, 500);
        practical3.setLocationRelativeTo(null);
        practical3.setVisible(true);
        practical3.setResizable(false);
        practical3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical3.dispose();
            }
        });
    }
    
    public Practical3() {
        init();
    }
    
    public void init() {
        try {
            
            //Initialization : 
            information = new TextArea("Time : \n" + new Date() + "\nIP Address : \n" + (InetAddress.getLocalHost()).getHostAddress(), 5, 10);
            gridLayout = new GridLayout(4, 4, 5, 5);
            font = new Font("Comic Sans MS", Font.BOLD, 30);
            
            //Layout for Frame : 
            setLayout(gridLayout);
            setFont(font);
            information.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
            
            //Adding to Frame : 
            add(information);
            for(int i = 0; i < 10; i++) {
                add(new Button("" + i));
            }
            add(new Button("Clear"));
            add(new Button("+"));
            add(new Button("-"));
            add(new Button("*"));
            add(new Button("/"));
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
    }
}