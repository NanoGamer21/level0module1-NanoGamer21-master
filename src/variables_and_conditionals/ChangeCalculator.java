package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
String nickle = JOptionPane.showInputDialog("how many nickles do you have");
        // Convert their answer to an int using Integer.parseInt()
int n = Integer.parseInt(nickle);
        // Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
int d = Integer.parseInt(dimes);
        // Ask the user how many quarters they have, and convert their answer
String quarter = JOptionPane.showInputDialog("how many Quaters do you have?");
int Q = Integer.parseInt(quarter);
        // Calculate how much money the user has and save it in a double variable 
double Nickle = (n * 0.05);
double Dimes = (d * 0.10);
double Quarter = (Q * 0.25);
double Total = Nickle + Dimes + Quarter;
JOptionPane.showMessageDialog(null, "you have " + Total + " cents/dollars");
        // Tell the user how much money they have

    }
}