/*
    Author @Gaurav Amarnani.

    Published @3 January 4:10 PM.

    Q. Design an application to demonstrate use of components like Checkbox 
       and RadioButton.
*/

//Importing Classes : 
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Question1 extends Frame {
    
    //Variables :
    private Label information;
    private Checkbox checkbox;
    private CheckboxGroup genderCheckboxGroup;
    private Checkbox maleCheckbox;
    private Checkbox femaleCheckbox;
    private Font font;
    
    public static void main(String...args) {
        Question1 question1 = new Question1();
        question1.setTitle("Question 1.");
        question1.setSize(550, 250);
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
            checkbox = new Checkbox("This is an example of SELECTED chekcbox without a CheckboxGroup.", true);
            genderCheckboxGroup = new CheckboxGroup();
            maleCheckbox = new Checkbox("This is an example of SELECTED checkbox with a CheckboxGroup", genderCheckboxGroup, true);
            femaleCheckbox = new Checkbox("This is an example of NON-SELECTED checkbox with a CheckboxGroup", genderCheckboxGroup, false);
            font = new Font("Comic Sans MS", Font.BOLD, 15);
            setFont(font);
            
            //Placement : 
            checkbox.setBounds(20, 40, 580, 30);
            maleCheckbox.setBounds(20, 90, 580, 30);
            femaleCheckbox.setBounds(20, 140, 580, 30);
            information.setBounds(20, 200, 580, 40);
            
            //Adding to Frame : 
            add(checkbox);
            add(maleCheckbox);
            add(femaleCheckbox);
            add(information);
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
    }
}