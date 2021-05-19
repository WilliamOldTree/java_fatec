/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: Modulo ProcedureMedia
Date: 22/03/2020
*/

//package
package lista01;

// library imports
import javax.swing.JOptionPane;

// Class
public class Modulo_VectEx04{
    public static void ProcedureMedia (int vetor[], int i){
    
        // variable
        int media = 0, res = 0;

        for(i = 0; i < vetor.length; i++){
            media =  media + vetor[i];
            res = media / vetor.length;
        }// end for
        JOptionPane.showMessageDialog(null, "A media da sequencia é "+ (double)res);
        
        // variable
        int abaixoMedia = 0, acimaMedia = 0;

        for (i = 0; i <vetor.length; i++){
            if (res < vetor[i]){
                abaixoMedia = abaixoMedia + 1;
            
            }else
           
            if (res > vetor[i]){
                acimaMedia = acimaMedia + 1;
            }// end if

        }//end for

        JOptionPane.showMessageDialog(null, "Existem "+abaixoMedia+" numeros abaixo da media e "+acimaMedia+" numeros acima da media");

    }// end procedure

}// end class
