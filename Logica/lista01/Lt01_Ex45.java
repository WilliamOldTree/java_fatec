/* 
 Disciplina  :  [Linguagem e Lógica de Programação] 
 Professor   :Ricardo Satoshi Oyakawa 
 Descrição   :Calcule e mostre a série 1 - 2/4 + 3/9 - 4/16 + 5/25 + ... + 15/225
 Autor(a)    : Denis William
 Data atual  : 2/25/2020
*/
package lista01;
import javax.swing.JOptionPane;

public class Lt01_Ex45{
    public static void main (String[]args){
   
        //declare variable
        double res;
        
        // function
        res = Fct_Ex45.FunctionCalculo();

        //show results
        JOptionPane.showMessageDialog(null, "a sequencia é " + res);
        
    }// end void

}// end class
