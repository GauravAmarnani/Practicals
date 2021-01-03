/*
    Author @Gaurav Amarnani.

    Published @3 January 4:45 PM.

    Q. Design an Application using List Components to add names of 10 different cities.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;


//Main Class : 
public class Question2 extends Frame {
    
    //Variables : 
    private Label information;
    private List list1;
    private Button button;
    private Label label;
    
    public static void main(String...args) {
        Question2 question2 = new Question2();
        question2.setTitle("Question 2.");
        question2.setSize(400, 500);
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
            list1 = new List(4);
            button = new Button("Submit Choice.");
            label = new Label("");
            
            //Placement : 
            list1.setBounds(100, 40, 200, 300);
            button.setBounds(150, 350, 100, 30);
            label.setBounds(150, 400, 300, 30);
            information.setBounds(20, 450, 500, 30);

            //Adding to Frame :
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText("Your selected country : " + list1.getSelectedItem());
                }
            });
            list1.add("INDIA.");
            list1.add("PAKISTAN.");
            list1.add("CHINA.");
            list1.add("IRNA.");
            list1.add("IRAQ.");
            list1.add("NORTH KOREA.");
            list1.add("SOUTH KOREA.");
            list1.add("JAPAN.");
            list1.add("RUSSIA.");
            list1.add("SRI-LANKA.");
            add(list1);
            add(button);
            add(label);
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}