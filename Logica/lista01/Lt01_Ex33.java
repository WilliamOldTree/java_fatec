/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Receba um número. Calcule e mostre
// a série 1 + 1/2 + 1/3 + ... + 1/N
Date: 2/22/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex33{
    public static void main (String[]args){
//VARIABLE declaration
        
    double n_usu;
    //DATABASE inputs
    n_usu=Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro"));

    double res = Fct_Ex33.serie(n_usu);

        
    System.out.println("A sequencia da divisão é "+ res);
    

    }//END main

}// END class