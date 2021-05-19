/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Show more value
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex19 {
	public static void main (String[]args){
	       
        // variable informations
        int n1, n2, maior, soma;
        maior = 0;
        soma = 0;		
        // database inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        
        // procedure
        Procedure_Maior(n1, n2, maior, soma);
    }

	static void Procedure_Maior(int d1, int d2, int max, int add){
    	
    	//desicion structure
        if (d1<d2)
        {
            max=d2;            
        }//end if
            else
            {
                max=d1;
            }//end else
                                            
        // processed inputs
        add=d1+d2;
        
        //show results
        
        JOptionPane.showMessageDialog(null," A soma dos valores é "+add+" e o maior deles é "+max);
	}//end void

}// end class
    
    