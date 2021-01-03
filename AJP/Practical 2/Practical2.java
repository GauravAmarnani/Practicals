/*
    Author @Gaurav Amarnani.

    Published @1 January 3:30 PM.

    Q. Write a program to design a form using components like List and Choice.
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
public class Practical2 extends Frame {
    
    //Variables : 
    private Label information;
    private List list1;
    private List list2;
    private Choice choice;
    private Button button;
    private Label label;
    
    public static void main(String...args) {
        Practical2 practical2 = new Practical2();
        practical2.setTitle("Practical 1.");
        practical2.setSize(500, 550);
        practical2.setLocationRelativeTo(null);
        practical2.setVisible(true);
        practical2.setResizable(false);
        practical2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical2.dispose();
            }
        });
    }
    
    public Practical2() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization : 
            information = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            list1 = new List(4);
            list2 = new List(5, true);
            choice = new Choice();
            button = new Button("Submit Choice.");
            label = new Label("");
            
            //Placement : 
            list1.setBounds(20, 40, 200, 100);
            list2.setBounds(250, 40, 200, 100);
            choice.setBounds(20, 160, 200, 100);
            button.setBounds(200, 300, 100, 30);
            label.setBounds(200, 350, 300, 30);
            information.setBounds(20, 500, 500, 30);

            //Adding to Frame :
            list1.add("This is ");
            list1.add("an example");
            list1.add("of non-multiple");
            list1.add("options list.");
            list2.add("This is ");
            list2.add("an example");
            list2.add("of multiple");
            list2.add("options list.");
            add(list1);
            add(list2);
            choice.add("Java");
            choice.add("C++");
            choice.add("Python");
            choice.add("HTML");
            add(choice);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(choice.getSelectedItem().equalsIgnoreCase("Java")) {
                        label.setText("GREAT CHOICE.");
                    }
                    else if(choice.getSelectedItem().equalsIgnoreCase("C++")) {
                        label.setText("OKAYISH CHOICE");
                    }
                    else if(choice.getSelectedItem().equalsIgnoreCase("Python")) {
                        label.setText("HUH. GOOD CHOICE.");
                    }
                    else {
                        label.setText("BRO, GET A LIFE!");
                    }
                }
            });
            add(button);
            add(label);
            add(information);
        }
        catch(Exception exception) {
            System.out.println(exception);
        }
    }
}