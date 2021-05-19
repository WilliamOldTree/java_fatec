/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: "MODULO" encontra o maior e o menor valor dgitado.
Data 18/03/2020   
*/
package lista01;
import javax.swing.JOptionPane;

public class Mod_VctEx02{
    public static void ModuloMaiorMenor(int vetor[], int i){

        // variaveis
        int maior = vetor[0], menor = vetor[0];
        for(int j = 0; j < vetor.length; j++){

            if( maior < vetor[j]){
            maior = vetor[j];
            }// end if
            
            else if(menor > vetor[j]){
            menor = vetor[j];
            }//end else if

        }// end for
        
        JOptionPane.showMessageDialog(null, "O maior número é "+ maior+ " e o menor é "+menor);
    }// end void
}// end class