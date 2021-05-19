/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo:Criar e coletar em um vetor [30] real e calcular e exibir:
a.	A média do grupo;
b.	A quantidade de notas acima do grupo;
c.	As posições dos valores abaixo da média do grupo.
Date 22/03/2020
*/

//package
package lista01;

// library imports
import javax.swing.JOptionPane;

// class
public class Vct_Ex04{
    public static void main (String[]args){

        //array
        int[] vetor = new int [5];
        
        //variable
        int i;
        
        //started
        for (i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));   
        }// end for
        
        Modulo_VectEx04.ProcedureMedia(vetor, i);
        
    }// end void

}// end class