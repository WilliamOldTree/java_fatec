/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Days food, eating 50g per day
Date:102/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex13
{
    public static void main (String[]args)
    {
        //variable informations
        double kg, day;
        
        // database inputs
        kg=Double.parseDouble(JOptionPane.showInputDialog("Quantos quilos de alimento voce possui?"));
        
        // processed database
        day=(kg/0.001)/50;
        
        // show results
        JOptionPane.showMessageDialog(null,"Comendo 50gr por dia, sua comida vai durar "+day+" dias");
      
                
    }//end void
}//end class