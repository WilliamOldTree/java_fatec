/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Bhaskara
Date: 02/12/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex05
{
    public static void main (String[] args)
    {
        // variable iformation
        double ax, bx, cx, delta, x1, x2;
        
        //entrace database
        ax=Double.parseDouble(JOptionPane.showInputDialog("DIGITE A VARIAVEL A"));
        bx=Double.parseDouble(JOptionPane.showInputDialog("DIGITE A VARIAVEL B"));
        cx=Double.parseDouble(JOptionPane.showInputDialog("DIGITE A VARIAVEL C"));
        
        delta = Math.pow(bx,2) + 4* (ax) * (cx);
        x1 = -bx + Math.sqrt(delta)/(2*ax);
        x2 = -bx - Math.sqrt(delta)/(2*ax);

        System.out.println("X1 = "+x1+ "X2 = "+ x2);
        
        
    }//end void 
           
}//end class
        