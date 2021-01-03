/*
    Author @Gaurav Amarnani.

    Published @3 January 5:00 PM.

    Q. Design an Application to select Multiple names of news papers.
*/

//Importing Classes : 
import java.awt.Button;
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
public class Question3 extends Frame {
    
    //Variables : 
    private Label information;
    private List list1;
    private Button button;
    private Label label;
    
    public static void main(String...args) {
        Question3 question3 = new Question3();
        question3.setTitle("Question 3.");
        question3.setSize(400, 400);
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
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization : 
            information = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            list1 = new List(4, true);
            button = new Button("Submit Choice.");
            label = new Label("");
            
            //Placement : 
            list1.setBounds(100, 40, 200, 150);
            button.setBounds(150, 250, 100, 30);
            label.setBounds(20, 300, 300, 30);
            information.setBounds(20, 350, 500, 30);

            //Adding to Frame :
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String[] papers = list1.getSelectedItems();
                    String allPapers = new String("");
                    label.setText("Your selected paper : ");
                    for(String eachPaper : papers) {
                        allPapers = allPapers.concat(" , " + eachPaper);
                    }
                    label.setText(label.getText() + allPapers);
                }
            });
            list1.add("Times of India");
            list1.add("Indian Express");
            list1.add("Mumbai Mirror");
            list1.add("Daily Analysis");
            list1.add("Denakbaskar");
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