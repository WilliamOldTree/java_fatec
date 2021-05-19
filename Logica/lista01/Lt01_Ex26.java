/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Receba 2 números inteiros. Verifique e mostre se o maior número
é múltiplo do menor
Date: 2/19/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex26{
    public static void main(String[]args){
        
        /*
        VARIABLE informations
        n = número
        */
        
        int n1, n2, maior, menor;
        
        maior = 0;
        menor = 0;
        
        // DATABASE iNPUTS
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro")); 

        Mod_Ex26 objt = new Mod_Ex26();
        objt.IntMaior(n1, n2, maior, menor);
    }// END void

}// END class


        
