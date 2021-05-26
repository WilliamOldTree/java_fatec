/*
Algoritmo "ana_maria"
// Disciplina  :  [Linguagem e Lógica de Programação] 
// Professor   :Ricardo Satoshi Oyakawa 
// Descrição   : Calcule e mostre quantos anos serão necessários
// para que Ana seja maior que Maria sabendo que Ana tem 1,10 m
// e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
// Autor(a)    :Denis William
// Data atual  : 2/25/2020

*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex43{
    public static void main (String[]args){
    
        
        int i;
        i = Fct_Ex43.FunctionCalculo();

        
        //show results
        JOptionPane.showMessageDialog(null, "Em "+i+" anos, Ana atingira a altura de Maria");
    
    }// end void
    
}// end class