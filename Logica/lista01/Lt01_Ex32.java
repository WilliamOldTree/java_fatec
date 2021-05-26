/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa 
Objective: Receba um número inteiro. Calcule e mostre o seu fatorial.
Date: 2/21/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex32{
    public static void main(String[]args){
    //VARIABLE structure

    int n_usu;
        
    n_usu=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));    
    int f = Fct_Ex32.fact (n_usu);


    JOptionPane.showMessageDialog(null, "O fatorial do "+n_usu+ " é " +f);
      

    }//END void

}//END class
