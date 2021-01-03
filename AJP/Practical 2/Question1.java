/*
    Author @Gaurav Amarnani.

    Published @3 January 4:30 PM.

    Q. Write a program to get following output.
*/

//Importing Classes : 
import java.awt.List;
import java.applet.Applet;

/*
<applet code="Question1" width="370" height="370">
</applet>
*/

//Main Class : 
public class Question1 extends Applet {
    
    //Variables : 
    private List list1;
    
    public void init() {
        try {
            
            //Layout for Frame : 
            setLayout(null);

            //Initialization :
            list1 = new List(3, true);
            
            //Placement : 
            list1.setBounds(50, 40, 200, 100);

            //Adding to Frame :
            list1.add("Summer.");
            list1.add("Winter.");
            list1.add("Rainy.");
            add(list1);
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}