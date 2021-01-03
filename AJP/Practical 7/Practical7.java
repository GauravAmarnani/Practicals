/*
    Author @Gaurav Amarnani.

    Published @2 January 11:10 AM.

    Q. Write a program to create a JTree.
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
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

//Main Class : 
public class Practical7 extends JFrame {
    
    //Variables : 
    private JLabel information;
    private DefaultMutableTreeNode countries;
    private DefaultMutableTreeNode asia;
    private DefaultMutableTreeNode europe;
    private DefaultMutableTreeNode northAmerica;
    private DefaultMutableTreeNode southAmerica;
    private DefaultMutableTreeNode southAfrica;
    private String[] allCountries;
    private JTree jTree;
    private JButton jButton;
    private JLabel jLabel;
    
    public static void main(String...args) {
        Practical7 practical7 = new Practical7();
        practical7.setTitle("Practical 7.");
        practical7.setSize(420, 850);
        practical7.setLocationRelativeTo(null);
        practical7.setVisible(true);
        practical7.setResizable(false);
        practical7.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical7.dispose();
            }
        });
    }
    
    public Practical7() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            Container container = getContentPane();
            container.setLayout(null);

            //Initialization : 
            information = new JLabel("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            jButton = new JButton("Submit.");
            jLabel = new JLabel("");
            
            //Root Node : 
            countries = new DefaultMutableTreeNode("COUNTRIES.");
            
            //Root Child Node :
            asia = new DefaultMutableTreeNode("ASIA");
            allCountries = new String[] {"INDIA.", "PAKISTAN.", "CHINA.", "RUSSIA.", "JAPAN."};
            for(String eachCountry : allCountries) {
                DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(eachCountry);
                asia.add(defaultMutableTreeNode);
            }
            
            europe = new DefaultMutableTreeNode("EUROPE.");
            allCountries = new String[] {"GERMANY.", "FRANCE.", "PORTUGAL.", "SPAIN.", "ITALY."};
            for(String eachCountry : allCountries) {
                DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(eachCountry);
                europe.add(defaultMutableTreeNode);
            }
            
            northAmerica = new DefaultMutableTreeNode("NORTH AMERICA.");
            allCountries = new String[] {"CANADA.", "UNITED STATES OF AMERICA.", "MEXICO."};
            for(String eachCountry : allCountries) {
                DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(eachCountry);
                northAmerica.add(defaultMutableTreeNode);
            }
            
            southAmerica = new DefaultMutableTreeNode("SOUTH AMERICA");
            allCountries = new String[] {"BRAZIL.", "ARGENTINA.", "ECUADOR.", "CHILE.", "COLOMBIA."};
            for(String eachCountry : allCountries) {
                DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(eachCountry);
                southAmerica.add(defaultMutableTreeNode);
            }
            
            southAfrica = new DefaultMutableTreeNode("AFRICA.");
            allCountries = new String[] {"NIGERIA.", "CHAD.", "SOUTH AFRICA.", "ZIMBABWE.", "DJIBOUTI."};
            for(String eachCountry : allCountries) {
                DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(eachCountry);
                southAfrica.add(defaultMutableTreeNode);
            }
            
            //Adding Child Nodes : 
            countries.add(asia);
            countries.add(europe);
            countries.add(northAmerica);
            countries.add(southAmerica);
            countries.add(southAfrica);
            
            //JTree :
            jTree = new JTree(countries);
            
            //Placement :
            jTree.setBounds(20, 30, 300, 600);
            jButton.setBounds(150, 650, 100, 30);
            jLabel.setBounds(130, 700, 300, 30);
            information.setBounds(20, 750, 500, 40);

            //Adding to Frame :
            jButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    TreePath[] treePath = jTree.getSelectionPaths();
                    for(TreePath eachPath : treePath) {
                        jLabel.setText("You've selected : " + eachPath.getLastPathComponent());
                    }
                }
            });
            add(jTree); 
            add(jButton);
            add(jLabel);
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}