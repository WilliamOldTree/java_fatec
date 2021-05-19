/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: "MODULO" calcula a media dos valores dentro de um vetor.
Date; 22/03/2020
*/

// pacote
package lista01;

//bibliotecas importadas
import javax.swing.JOptionPane;

// inicio
public class Mod_VctrEx02{
    public static void ModuloMedia (int vetor[], int i) {
        
        // variable
        int  media = 0, res = 0;

        //processing
        for (i = 0; i < vetor.length; i++){
            media = media + vetor[i];
            
        }
        
        res = media / vetor.length;
        JOptionPane.showMessageDialog(null, " A media dos números digitados é "+(double) res);
       
        
        
    }// end modulo


}// end class