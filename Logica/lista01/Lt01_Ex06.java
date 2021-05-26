/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Inversion Inputs
Date: 02/12/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex06
{
    public static void main(String[]args)
            
    {
        // variable information
        int x, y;
        
        //database inputs
        x=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de Y"));
        
        // show results
        JOptionPane.showMessageDialog(null,"Agora X vale  " + y + "\ne Y vale  " + x);
       
                
        
    }//end void
            
}//end clas