/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Calculation Angle
Date:02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex14
{
    public static void main (String[]args)
    {
        // variable informations
        double a1, a2, af;
        
        // database inputs
        a1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro angulo"));
        a2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo angulo"));
        
        // processed database
        af=(a1+a2)-180;
        
        // show results
        JOptionPane.showMessageDialog(null, "O terceiro angulo mede: "+af);
    }//end void
}//end class
        