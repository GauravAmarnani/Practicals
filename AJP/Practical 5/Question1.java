/*
    Author @Gaurav Amarnani.

    Published @3 January 7:30 PM.

    Q. Write a program which creates Menu for different colors and disable Menu item for 
       Black color.
*/

//Importing Classes : 
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Question1 extends Frame {
    
    //Variables : 
    private Label information;
    private MenuBar menuBar;
    private Menu color;
    private MenuItem red;
    private MenuItem blue;
    private MenuItem black;
    private MenuItem yellow;
    
    public static void main(String...args) {
        Question1 question1 = new Question1();
        question1.setTitle("Practical 5.");
        question1.setSize(400, 200);
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
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization : 
            information = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            red = new MenuItem("Red");
            blue = new MenuItem("Blue");
            black = new MenuItem("Black");
            yellow = new MenuItem("Yellow");
            
            black.setEnabled(false);
            
            menuBar = new MenuBar();
            setMenuBar(menuBar);
            
            color = new Menu("Color");
            
            color.add(red);
            color.add(blue);
            color.add(black);
            color.add(yellow);
            
            menuBar.add(color);
            
            //Placement : 
            information.setBounds(20, 90, 380, 40);

            //Adding to Frame : 
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}