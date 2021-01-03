/*
    Author @Gaurav Amarnani.

    Published @2 January 9:50 AM.

    Q. Write a program using swing to display aScrollPane and JComboBox in an 
       JApplet with items - English, Marathi, Hindi, Sanskrit.
*/

//Importing Classes : 

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.util.Date;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/*
    <applet code="Practical6" width="400" height="350">
    </applet>
*/

//Main Class : 
public class Practical6 extends JApplet {
    
    //Variables : 
    private JLabel information;
    private JLabel jLabel1;
    private JComboBox jComboBox;
    private JButton jButton;
    private JLabel jLabel2;
    
    public void init() {
        try {
            
            //Setting Layout : 
            Container container = getContentPane();
            container.setLayout(null);

            //Initialization : 
            information = new JLabel("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            jLabel1 = new JLabel("Select Language : ");
            jComboBox = new JComboBox();
            jButton = new JButton("Submit.");
            jLabel2 = new JLabel("The Selected Langauges is : ");
            
            //Setting Positions : 
            jLabel1.setBounds(20, 40, 150, 30);
            jComboBox.setBounds(170, 40, 100, 30);
            jLabel2.setBounds(20, 100, 300, 30);
            jButton.setBounds(130, 150, 100, 30);
            information.setBounds(20, 200, 380, 30);
            
            //Adding Components :
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    jLabel2.setText(jLabel2.getText().concat((String)jComboBox.getSelectedItem()));
                }
            });
            jComboBox.addItem("English.");
            jComboBox.addItem("Marathi.");
            jComboBox.addItem("Hindi.");
            jComboBox.addItem("Sanskrit.");
            add(jComboBox);
            add(jLabel1);
            add(jLabel2);
            add(jButton);
            add(information);
            
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}