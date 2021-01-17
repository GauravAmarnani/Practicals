/*
    Author @Gaurav Amarnani.

    Published @2 January 2:30 PM.

    Q. Write a program to create a JProgressBar.
*/

//Importing Classes : 
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//Main Class : 
public class Practical9 extends JFrame {
    
    //Variables : 
    private JLabel information;
    private JProgressBar jProgressBar;
    private JButton jButton;
    private Timer timer;
    private Integer initialValue = 0;
    
    public static void main(String...args) {
        Practical9 practical9 = new Practical9();
        practical9.setTitle("Practical 9.");
        practical9.setSize(400, 300);
        practical9.setLocationRelativeTo(null);
        practical9.setVisible(true);
        practical9.setResizable(false);
        practical9.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical9.dispose();
            }
        });
    }
    
    public Practical9() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            Container container = getContentPane();
            container.setLayout(null);

            //Initialization : 
            information = new JLabel("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            jButton = new JButton("Launch.");
            jProgressBar = new JProgressBar(0,100);
            jProgressBar.setValue(0);
            jProgressBar.setStringPainted(true);
            timer = new Timer(100, new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    initialValue++;
                    jProgressBar.setValue(initialValue);
                    if(jProgressBar.getValue() == 100) 
                        jButton.setVisible(false);
                }
            });
            
            //Placement :
            jProgressBar.setBounds(100, 30, 200, 30);
            jButton.setBounds(150, 100, 100, 30);
            information.setBounds(20, 200, 380, 40);
            
            //Adding to Frame :
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    timer.start();
                }
            });
            add(jProgressBar);
            add(jButton);
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}