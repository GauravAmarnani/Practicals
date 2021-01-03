/*
    Author @Gaurav Amarnani.

    Published @1 January 2:00 AM.

    Q. Write a program using AWT to create a Menubar where Menubar contains Menu items
       such as File, Edit, View and create a Sub-Menu under the File menu containing 
       New and Open.
*/

//Importing Classes : 
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Practical5 extends Frame {
    
    //Variables : 
    private Label information;
    private MenuBar menuBar;
    private Menu file;
    private Menu edit;
    private Menu view;
    private MenuItem newFile;
    private MenuItem openFile;
    
    public static void main(String...args) {
        Practical5 practical5 = new Practical5();
        practical5.setTitle("Practical 5.");
        practical5.setSize(400, 200);
        practical5.setLocationRelativeTo(null);
        practical5.setVisible(true);
        practical5.setResizable(false);
        practical5.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical5.dispose();
            }
        });
    }
    
    public Practical5() {
        init();
    }
    
    public void init() {
        try {
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization : 
            information = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            newFile = new MenuItem("New");
            openFile = new MenuItem("Open");
            
            menuBar = new MenuBar();
            setMenuBar(menuBar);
            
            file = new Menu("File");
            edit = new Menu("Edit");
            view = new Menu("View");
            
            file.add(newFile);
            file.add(openFile);
            
            menuBar.add(file);
            menuBar.add(edit);
            menuBar.add(view);
            
            //Placement : 
            information.setBounds(20, 90, 380, 40);

            //Adding to Frame : 
            add(information);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}