/*
Lote 01
Maneger: Ricardo Satochi
Developer: William Barbosa
Objective: Subtraction
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex18
{
    public static void main (String[]args)
    {
        // variable informations
        int n1, n2, sub;
        
        //datbase inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        
        // decision struture
        if (n2>n1)
        {
         JOptionPane.showMessageDialog(null,"Subtração com valor negativo, DIGITAR PRIMEIRO O MAIOR VALOR");
        }
        //endif
        else
        {// processed database
         sub=n1-n2;
         JOptionPane.showMessageDialog(null," O RESULTADO DA DIFERENÇA É "+sub);
        }                         
 
    }//end void
    
}//end class