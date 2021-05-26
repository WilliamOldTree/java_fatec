/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo:3.	Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]
Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados
Exemplo:
VT1|1|2|3|  	|VT2|4|5|6|     |VT3|1|2|3|4|5|6
Date 22/03/2020
*/

//package
package lista01;

//library imports
import javax.swing.JOptionPane;

// Class
public class Vct_Ex03{
    public static void main(String[] args) {
            
        //vetores
        int[] vetor1 = new int [3];
        int[] vetor2 = new int [3];
        int[] vetor3 = new int [6];
        
        
        //started
        int i;
        for (i = 0; i < vetor1.length; i++){
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            vetor3[i] = vetor1[i];
        }// end for

        int j;
        for ( j = 0; j < vetor2.length; j++){
            vetor2[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            vetor3[j + 3] = vetor2[j];
        }// end for    
           
        int k;
        for ( k = 0; k < vetor3.length; k++){
            System.out.println(+vetor3[k]);        
        }// end for

    }//end void

}// end class