/*
    Author @Gaurav Amarnani.

    Published @3 January 4:20 PM.

    Q. Design an application to create form using Label, TextField, TextArea and 
       Button.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Question2 extends Frame {
    
    //Variables : 
    private Label information;
    private Label label;
    private Button button;
    private TextField textField;
    private TextArea textArea;
    private Checkbox checkbox;
    private CheckboxGroup genderCheckboxGroup;
    private Checkbox maleCheckbox;
    private Checkbox femaleCheckbox;
    
    public static void main(String...args) {
        Question2 question2 = new Question2();
        question2.setTitle("Practical 1.");
        question2.setSize(450, 450);
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
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization : 
            information = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            label = new Label("Fill the following information.");
            button = new Button("Submit.");
            textField = new TextField("Enter Name." , 160);
            textArea = new TextArea("Enter Address.", 10, 160);

            //Placement : 
            label.setBounds(20, 60, 200, 30);
            textField.setBounds(20, 110, 400, 30);
            textArea.setBounds(20, 150, 400, 180);
            button.setBounds(120, 350, 200, 30);
            information.setBounds(20, 400, 500, 40);

            //Adding to Frame : 
            add(label);
            add(button);
            add(textField);
            add(textArea);
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}