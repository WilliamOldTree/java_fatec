/*
Algoritmo "Primos"
Disciplina  :  [Linguagem e Lógica de Programação] 
Professor   :Ricardo Satoshi Oyakawa 
Descrição   : Receba 2 números inteiros.
Verifique e mostre todos os números primos existentes entre eles.
Autor(a)    : Denis William
Data atual  : 2/24/2020
*/
package lista01;
import javax.swing.JOptionPane;
    public class Lt01_Ex40{
        public static void main (String []args){
             //declare variable
             int n1, n2;
             
             //database inputs
             n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
             n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número "));
             
             Mod_Ex40.ProcedureCalculo(n1, n2);   
            
       }//end void
       
    }//end class