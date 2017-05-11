package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
String jackie = "Talking";
String joel = "Power to not know how to dance";
String anthony = "Being a monkey";
String danny = "eating mcdonalds";
String steven = "Eating food rolups";
String jose = "GRATATA";
        // 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What Is your name?");
if (name.equalsIgnoreCase("joel")) 
{
JOptionPane.showMessageDialog(null, joel);	
}
if (name.equalsIgnoreCase("steven")) 
{
JOptionPane.showMessageDialog(null, steven);	
}
if (name.equalsIgnoreCase("anthony")) 
{
JOptionPane.showMessageDialog(null, anthony);
}
if (name.equalsIgnoreCase("danny")) 
{
JOptionPane.showMessageDialog(null, danny);	
}
if (name.equalsIgnoreCase("jose")) 
{
JOptionPane.showMessageDialog(null, jose);	
}
if (name.equalsIgnoreCase("jackie")) 
{
JOptionPane.showMessageDialog(null, jackie);	
}

        // 3. Show the superpower in a pop-up, depending on the name entered. 

    }
}