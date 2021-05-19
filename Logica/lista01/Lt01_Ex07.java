/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Calculting Cube
Date:12/02/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex07
{
    public static void main (String[]args)         
    {
        //variable information
        double l,a,c,area;
        
        // database inputs
        l=Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DO LADO DO CUBO"));
        a=Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DA ALTURA DO CUBO"));
        c=Double.parseDouble(JOptionPane.showInputDialog("DIGITE VALOR DO COMPRIMENTO DO CUBO"));
        
        //processed database
        area=l*a*c;
        
        //show results
        JOptionPane.showMessageDialog(null,"O volume do cubo é"+area);
                
        
        
        
        
    }//end void
}//end class