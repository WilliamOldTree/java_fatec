/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
a.	O maior e o menor valor;
b.	A média dos valores.
Data 18/03/2020   
*/
package lista01;
import javax.swing.JOptionPane;

public class Vtr_Ex02{
    public static void main(String[]args){
        
        // vetor
        int [] vetor = new int [5];     
        int i;
        for ( i = 0; i < vetor.length; i++){
         vetor [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        }
        Mod_VctEx02.ModuloMaiorMenor(vetor, i);
        Mod_VctrEx02.ModuloMedia(vetor, i);
        
        
    }// end void

}// end class