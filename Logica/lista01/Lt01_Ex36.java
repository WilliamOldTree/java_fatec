/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective:Receba um número N. Calcule e mostre
a série 1 + 1/1! + 1/2! + ... + 1/N!
Date:2/26/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex36{
    public static void main (String[]args){
        //Declare variable
        Double serie, fat, n_usu; 
        serie = 1.0;
        fat = 1.0;

        //Database inputs
        n_usu = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro"));
        
        
            // fuction
            for (double i = n_usu; i >= 2; i-- ){
                for (double j = n_usu; j >= 2; j--){
                    serie = Fct_Ex36.Funcao_Fatorial(j, n_usu, serie, fat);
                    // show results
                    

                }// end for j

            }// end for i
        System.out.println(serie);
    }//End void

}//End class