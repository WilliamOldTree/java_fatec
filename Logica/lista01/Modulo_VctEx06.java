/*
Professor: Ricardo Satochi
Desenvolveddor: Denis William
Objetivo: Modulo ProcedureOrdenacao
Date 22/03/2020
*/

// package
package lista01;

// class
public class Modulo_VctEx06{
    public static void ProcedureOrdenacao (int vetor[], int i){

        // variable
        int aux;

        for( i = 0; i < (vetor.length - 1); i++){

            for( int j = (i + 1); j < vetor.length; j++){
                
                if (vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }//end if

            }//end for

        }// end for
            
        
        for(i = 0; i < (vetor.length - 1); i++){

            for( int j = (i + 1); j < vetor.length; j++){
                
                if (vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }//end if

            }//end for

        }// end for
        
        //show results
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }//end forJOptionPane.showMessageDialog(null, +vetor[i]);  
        

    }// end void

}// end class



