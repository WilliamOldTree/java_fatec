/*
Lote 01
Professor: Ricardo Satoshi
Desenvolvedor: Denis William
Objetivo: 1.	Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a.	A média dos valores entre 10 e 200;
b.	A soma dos números ímpares.
Date: 15/3/2020
*/

package lista01;
import javax.swing.JOptionPane;

public class Vtr_Ex01{

    public static void main (String[]args){

        // create vector
        int [] vetor1 = new int [5];
        int i = 0, media = 0, impar = 0;
        for (i = 0; i < 5; i++)
        {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 10 e 200"));
            // salvando o valor que a função retorna para nao perder o seu valor //
            media = Mod_VtrEx01.CalculoMedia(vetor1, i, media);
            impar = Fct_VtrEx01.CalculoImpar(vetor1, i, impar);

        }   
        
        JOptionPane.showMessageDialog(null, " A media é "+(double) media/vetor1.length);
        JOptionPane.showMessageDialog(null,"A soma dos números impares é "+impar);
        

    }// end void

}// end class

