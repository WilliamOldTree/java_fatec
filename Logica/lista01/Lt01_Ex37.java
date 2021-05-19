/*
Algoritmo "Fibonachi"
Disciplina  :  [Linguagem e Lógica de Programação] 
Professor   :Ricardo Satoshi Oyakawa 
Descrição   :Receba um número inteiro. Calcule e mostre a série de Fibonacci
até o seu N'nésimo termo
Autor(a)    : Denis William
Data atual  : 2/23/2020
*/
package lista01;
import javax.swing.JOptionPane;
    
public class Lt01_Ex37{
       
    public static void main (String[]args){
           
        //declare variable
            int limite;
        
        // database inputs
            limite=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            
       Fct_Ex37.ProcedureFibonacci(limite);                                 
            
        }//End void
    
    }//End class
        
        