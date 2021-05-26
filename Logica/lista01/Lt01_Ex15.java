/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective:Hipotnusa
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex15
{
    public static void main (String[]args)
    {
        // variable informations
        double c1, c2, hip;
        
        // database inputs
        c1=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro cateto"));
        c2=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo cateto"));
        
        // processed database
        hip=(c1*c1)+(c2*c2)*(0.5);
        
        //show results
        JOptionPane.showMessageDialog(null,"O valor da hipotnusa é "+hip);
        
    }//end void
    
}//end class