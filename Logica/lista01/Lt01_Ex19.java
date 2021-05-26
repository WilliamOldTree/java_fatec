/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Show more value
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex19{
    
    public static void main (String[]args){
       
        // variable informations
        int n1, n2, maior, soma;
        
        // database inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        
        //desicion structure
        if (n1<n2)
        {
            maior=n2;            
        }//end if
            else
            {
                maior=n1;
            }//end else
                                            
        // processed inputs
        soma=n1+n2;
        
        //show results
        
        JOptionPane.showMessageDialog(null," A soma dos valores é "+soma+" e o maior deles é "+maior);
        
  
    }// end void
    
}//end class
