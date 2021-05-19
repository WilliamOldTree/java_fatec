/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective:Length circle
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex11
{
    public static void main (String[]args)
    {
        // declaração das variaves
        double circle, length;
        
        // database inputs
        circle=Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência"));
        
        //processed database
        length=2*3.1415*circle;
        
        //show results
        JOptionPane.showMessageDialog(null,"O comprimento da circunferencia é "+length);
        
        
    }//end void
}//end class