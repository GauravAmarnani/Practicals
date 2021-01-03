/*
    Author @Gaurav Amarnani.

    Published @2 January 1:15 PM.

    Q. Write a program to create a JTable.
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//Main Class : 
public class Practical8 extends JFrame {
    
    //Variables : 
    private JLabel information;
    private JLabel jLabelName;
    private JLabel jLabelAge;
    private JLabel jLabelMail;
    private JTextField jTextFieldName;
    private JTextField jTextFieldAge;
    private JTextField jTextFieldMail;
    private JButton jButton;
    private String[] columnNames;
    private Object[][] data;
    private DefaultTableModel defaultTableModel;
    private JTable jTable;
    private JScrollPane jScrollPane;
    
    public static void main(String...args) {
        Practical8 practical8 = new Practical8();
        practical8.setTitle("Practical 8.");
        practical8.setSize(600, 550);
        practical8.setLocationRelativeTo(null);
        practical8.setVisible(true);
        practical8.setResizable(false);
        practical8.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical8.dispose();
            }
        });
    }
    
    public Practical8() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            Container container = getContentPane();
            container.setLayout(null);

            //Initialization : 
            information = new JLabel("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            jLabelName = new JLabel("Name : ");
            jLabelAge = new JLabel("Age : ");
            jLabelMail = new JLabel("Mail : ");
            jTextFieldName = new JTextField();
            jTextFieldAge = new JTextField();
            jTextFieldMail = new JTextField();
            jButton = new JButton("Submit.");
            columnNames = new String[] {"Name", "AGE", "EMAIL"};
            data = new Object[][] {{"GAURAV", "18", "gaurav12@gamil.com"},{"CHETAN", "18", "chetan25@gmail.com"},{"RIYA", "18", "riya2@gmail.com"}};
            defaultTableModel = new DefaultTableModel(data, columnNames);
            jTable = new JTable();
            jTable.setModel(defaultTableModel);
            jScrollPane = new JScrollPane(jTable, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            
            //Placement :
            jLabelName.setBounds(20, 20, 100, 30);
            jLabelAge.setBounds(20, 60, 100, 30);
            jLabelMail.setBounds(20, 100, 100, 30);
            jTextFieldName.setBounds(150, 20, 300, 30);
            jTextFieldAge.setBounds(150, 60, 300, 30);
            jTextFieldMail.setBounds(150, 100, 300, 30);
            jButton.setBounds(250, 150, 100, 30);
            jScrollPane.setBounds(20, 220, 550, 200);
            information.setBounds(120, 450, 500, 40);

            //Adding to Frame :
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    String name = jTextFieldName.getText();
                    String age = jTextFieldAge.getText();
                    String mail = jTextFieldMail.getText();
                    if(name.isEmpty() || age.isEmpty() || mail.isEmpty()) {
                        name = null;
                        age = null;
                        mail = null;
                    }
                    if(name == null || age == null || mail == null) {
                        JOptionPane.showMessageDialog(rootPane, "Data cannot be Empty.");
                    }
                    else {
                        if(name.trim().equals("") || age.trim().equals("") || mail.trim().equals("") ) {
                            JOptionPane.showMessageDialog(rootPane, "Data cannot be Blank.");
                        }
                        else {
                            String[] newData = {name , age, mail};
                            defaultTableModel.addRow(newData);
                            clearText(jTextFieldName);
                            clearText(jTextFieldAge);
                            clearText(jTextFieldMail);
                            JOptionPane.showMessageDialog(rootPane, "Data Added Successfully.");                            
                        }
                    }
                }
            });
            add(jLabelName);
            add(jLabelAge);
            add(jLabelMail);
            add(jTextFieldName);
            add(jTextFieldAge);
            add(jTextFieldMail);
            add(jButton);
            add(jScrollPane);
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
    
    public void clearText(JTextField jTextField) {
        jTextField.setText("");
    }
}