/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Economically Application
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex08
{
    public static void main (String[]args)
    {
        //variable information
        double apl, apl_end;
        
        // database inpunts
        apl=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser aplicado"));
        
        // processed database
        apl_end=(apl*(1.3/100))+(apl);
        
        // show results
        
        JOptionPane.showMessageDialog(null,"Seu saldo depois de aplicado é "+apl_end);        
                    
              
            
       
    }//end void
}//end class
        