/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Add square
Date:02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex09
{
    public static void main (String[]args)
    {
        // variable information
        double n1, n2, add_squ;
        
        //database inputs
        n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        
        //processed database
        add_squ=(n1*n1)+(n2*n2);
        
        // show results
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é" + add_squ);
        
                
    } //end void
    
}// end class
