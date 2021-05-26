/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Receba um número. Calcule e mostre os resultados da tabuada desse número
Date: 2/22/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex34 {
    public static void main (String[]args){
    
    // Variable declaration
    int n_usu;
         
    // Database Inputs
     n_usu=Integer.parseInt(JOptionPane.showInputDialog("Digite qual taboada voce quer calcular"));
    
    
    //processing
        int res =0;
        for (int i = 1; i <= 10; i++) {
        res  = Fct_Ex34.taboada (n_usu, i);
        System.out.println(+n_usu +" x " +i+ " = " +res );    
     }
             
    }// end void
    
}// end class