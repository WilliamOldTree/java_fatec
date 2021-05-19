/*
Professor: Ricardo Satochi
Desenvolvedor: Denis Willam
Objetivo:6.	Criar e coletar em um vetor [20] com números aleatórios.
Classificar este vetor em ordem crescente e mostre os dados.
Date: 22/03/2020
*/

//package
package lista01;

//library import
import javax.swing.JOptionPane;

// Class
public class Vct_Ex06{
    public static void main(String[]args){
        
        // array
        int[] vetor = new int [5];

        // variable
        int i;

        //building array
        for( i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        }// end for
        
        //procedimento
        Modulo_VctEx06.ProcedureOrdenacao(vetor, i);
        
    }// end void


}// end class
