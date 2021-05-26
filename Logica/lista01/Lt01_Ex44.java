/*
Algoritmo "potencia"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   :Ricardo Satoshi Oyakawa 
// Descrição   :Receba o número da base e do expoente.
// Calcule e mostre o valor da potência
// Autor(a)    : Denis William
// Data atual  : 2/25/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex44{
    public static void main (String[]args){
        
        //declare variable
        int base, poten, aux;
        
       
        // data inputs
        base=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
        poten=Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente"));
        
        //Function
        aux = Fct_Ex44.FunctionCalculo(base, poten);
        
        
        // show results
        JOptionPane.showMessageDialog(null,"O resultado da potencia é "+aux);
        
        
    }// end void
    

}//end class