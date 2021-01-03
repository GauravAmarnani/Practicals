/*
    Author @Gaurav Amarnani.

    Published @1 January 1:35 PM.

    Q. Write a program to demonstrate use of components like Label, TextField, TextArea, 
       Button, Checkbox, RadioButton.
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
import java.net.UnknownHostException;
import java.util.Date;

//Main Class : 
public class Practical1 extends Frame {
    
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
        Practical1 practical1 = new Practical1();
        practical1.setTitle("Practical 1.");
        practical1.setSize(500, 550);
        practical1.setLocationRelativeTo(null);
        practical1.setVisible(true);
        practical1.setResizable(false);
        practical1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical1.dispose();
            }
        });
    }
    
    public Practical1() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization : 
            information = new Label("Time : " + new Date() + " IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            label = new Label("This is an example of Label.");
            button = new Button("This is an example of Button.");
            textField = new TextField("This is an example of TextField with 160 columns." , 160);
            textArea = new TextArea("This is an example of TextArea with 10 rows and 30 columns.", 10, 160);
            checkbox = new Checkbox("This is an example of SELECTED chekcbox without a CheckboxGroup.", true);
            genderCheckboxGroup = new CheckboxGroup();
            maleCheckbox = new Checkbox("This is an example of SELECTED checkbox with a CheckboxGroup", genderCheckboxGroup, true);
            femaleCheckbox = new Checkbox("This is an example of NON-SELECTED checkbox with a CheckboxGroup", genderCheckboxGroup, false);

            //Placement : 
            label.setBounds(20, 35, 200, 20);
            button.setBounds(20, 60, 200, 30);
            textField.setBounds(20, 110, 400, 30);
            textArea.setBounds(20, 150, 400, 180);
            checkbox.setBounds(20, 360, 500, 30);
            maleCheckbox.setBounds(20, 400, 500, 30);
            femaleCheckbox.setBounds(20, 440, 500, 30);
            information.setBounds(20, 500, 500, 40);

            //Adding to Frame : 
            add(label);
            add(button);
            add(textField);
            add(textArea);
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