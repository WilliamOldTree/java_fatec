/*
Algoritmo "calcular_serie"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   :Ricardo Satoshi Oyakawa 
// Descrição   :Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
// Autor(a)    : Denis William
// Data atual  : 2/25/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex42{
    public static void main (String[]args){
        // declare variable
        double res;

        res = Fct_Ex42.FunctionCalculo();

        JOptionPane.showMessageDialog(null, "O resultado da serie é  " + res);
        
    }// end void
    
}// end class