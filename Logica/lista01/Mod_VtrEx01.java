/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: FunctionMedia
Date 15/03/2020
*/
package lista01;

public class Mod_VtrEx01 {
    public static int CalculoMedia(int vetor1[], int i, int media){

        // variable
        
        if (vetor1[i] > 10 && vetor1[i]< 200){
            media = (media + vetor1[i]);
               
        }
        
        
             
        return media;
    }// end void
    
}// end class