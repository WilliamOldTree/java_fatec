/*
Lote 01
Manager: Ricardo Satchi
Developer: William Barbosa
Objective: Subtract Integer
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex10
{
    public static void main (String[]args)
    {
        //variable informations
        int n1, n2, sub;
        
        // database inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro"));
        
        // processed database
        sub=n1-n2;
        
        //show results
        JOptionPane.showMessageDialog(null,"A diferença entre os numeros é "+sub);
        
        
    }//end void
    
}//end class