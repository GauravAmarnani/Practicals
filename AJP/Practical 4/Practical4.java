/*
    Author @Gaurav Amarnani.

    Published @1 January 9:20 PM.

    Q. Write a program to create a two-level card deck that allows user to select 
       Component of Panel using CardLayout.
*/

//Importing Classes : 
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.util.Date;

//Main Class : 
public class Practical4 extends Frame implements ActionListener{
    
    //Variables : 
    private Label information1;
    private Label information2;
    private Label information3;
    private Font font;
    private Label label1;
    private Button button1;
    private Button button2;
    private Button back1;
    private Button back2;
    private Panel panel1;
    private CardLayout cardLayout;
    private Label label2;
    private Checkbox checkbox1;
    private Checkbox checkbox2;
    private Checkbox checkbox3;
    private Checkbox checkbox4;
    private Checkbox checkbox5;
    private Panel panel2;
    private Label label3;
    private Checkbox checkbox6;
    private Checkbox checkbox7;
    private Checkbox checkbox8;
    private Checkbox checkbox9;
    private Checkbox checkbox10;
    private Panel panel3;
    
    public static void main(String...args) {
        Practical4 practical4 = new Practical4();
        practical4.setTitle("Practical 4.");
        practical4.setSize(550, 450);
        practical4.setLocationRelativeTo(null);
        practical4.setVisible(true);
        practical4.setResizable(false);
        practical4.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                practical4.dispose();
            }
        });
    }
    
    public Practical4() {
        init();
    }
    
    public void init() {
        try {

            //Setting Font : 
            font = new Font("Comic Sans MS", Font.BOLD, 25);
            setFont(font);
            
            //Initialization : 
            
            //Layout :
            cardLayout = new CardLayout();
            setLayout(cardLayout);
            
            //Information : 
            information1 = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            information1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
            information2 = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            information2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
            information3 = new Label("Time : " + new Date() + " || IP Address : " + (InetAddress.getLocalHost()).getHostAddress());
            information3.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
            
            //Panel 1 : 
            label1 = new Label("Choose the Card : ");
            back1 = new Button("Go Back.");
            back2 = new Button("Go Back.");
            button1 = new Button("Web Series.");
            button2 = new Button("Movie Series.");
            button1.addActionListener(this);
            button2.addActionListener(this);
            back1.addActionListener(this);
            back2.addActionListener(this);
            panel1 = new Panel();
            panel1.setLayout(null);
            
            //Panel 2 :
            label2 = new Label("Choose your favorite Web Series : ");
            checkbox1 = new Checkbox("Game of Thrones.", true);
            checkbox2 = new Checkbox("FRIENDS.", true);
            checkbox3 = new Checkbox("Rick & Morty.");
            checkbox4 = new Checkbox("Queen's Gambit.");
            checkbox5 = new Checkbox("Vikings.");
            panel2 = new Panel();
            panel2.setLayout(null);
            
            //Panel 3 : 
            label3 = new Label("Choose your favorite Movie Series : ");
            checkbox6 = new Checkbox("Harry Potter.", true);
            checkbox7 = new Checkbox("Lord of the Rings.", true);
            checkbox8 = new Checkbox("Men In Black.");
            checkbox9 = new Checkbox("Toy Story.");
            checkbox10 = new Checkbox("Kung-fu Panda.");
            panel3 = new Panel();
            panel3.setLayout(null);
            
            //Setting Location :
            
            //Panel 1 : 
            label1.setBounds(150, 40, 500, 50);
            button1.setBounds(50, 110, 200, 50);
            button2.setBounds(270, 110, 200, 50);
            information1.setBounds(40, 200, 500, 50);
            
            //Panel 2 : 
            label2.setBounds(50, 10, 500, 50);
            checkbox1.setBounds(50, 70, 500, 30);
            checkbox2.setBounds(50, 110, 500, 30);
            checkbox3.setBounds(50, 150, 500, 30);
            checkbox4.setBounds(50, 190, 500, 30);
            checkbox5.setBounds(50, 230, 500, 30);
            back1.setBounds(175, 270, 200, 50);
            information2.setBounds(40, 350, 500, 50);
            
            //Panel 3 : 
            label3.setBounds(50, 10, 500, 50);
            checkbox6.setBounds(50, 70, 500, 30);
            checkbox7.setBounds(50, 110, 500, 30);
            checkbox8.setBounds(50, 150, 500, 30);
            checkbox9.setBounds(50, 190, 500, 30);
            checkbox10.setBounds(50, 230, 500, 30);
            back2.setBounds(175, 270, 200, 50);
            information3.setBounds(40, 350, 500, 50);
            
            //Adding Components :
            
            //Panel 1 : 
            panel1.add(information1);
            panel1.add(label1);
            panel1.add(button1);
            panel1.add(button2);
            add(panel1, "Card1");
            
            //Panel 2 : 
            panel2.add(information2);
            panel2.add(label2);
            panel2.add(checkbox1);
            panel2.add(checkbox2);
            panel2.add(checkbox3);
            panel2.add(checkbox4);
            panel2.add(checkbox5);
            panel2.add(back1);
            add(panel2, "Card2");
            
            //Panel 3 : 
            panel3.add(information3);
            panel3.add(label3);
            panel3.add(checkbox6);
            panel3.add(checkbox7);
            panel3.add(checkbox8);
            panel3.add(checkbox9);
            panel3.add(checkbox10);
            panel3.add(back2);
            add(panel3, "Card3");
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().hashCode()==back1.hashCode() || actionEvent.getSource().hashCode()==back2.hashCode()) {
            cardLayout.show(this, "Card1");
        }
        else if(actionEvent.getSource().hashCode()==button1.hashCode()) {
            cardLayout.show(this, "Card2");
        }
        else {
            cardLayout.show(this, "Card3");
        }
    }
}