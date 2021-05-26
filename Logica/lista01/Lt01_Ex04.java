/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Convert into Fahrenheit
Date: 02/11/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex04
{
    public static void main(String[]args)
    {
        // declaração das variaveis
        double fah, cel;
        
        //entrace database
        cel=Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em celsius"));
        
        //processed database
        fah=cel*(9/5)+32;
        
        // show results
        JOptionPane.showMessageDialog(null,"Essa temperatura em Celsiu equival a "+fah);
               
        
    } //end void
    
}//end class