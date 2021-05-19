/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: 23.	Receba 3 valores obrigatoriamente em ordem crescente e um
4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
Date:2/18/2020
*/
package lista01;
import javax.swing.JOptionPane;
//import Lista01.Mod_Ex23;

public class Lt01_Ex23{
    
    public static void main (String[]args){
        
        /* VARIABLE informations
        n=numero
        */
        int a,b,c,d;
        
        //DATABASE inputs
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero, ordem crescente"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero, ordem crescente"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero, ordem crescente"));
        d=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero qualquer"));
        
        Mod_Ex23 ex = new Mod_Ex23();
        ex.Calculo(a, b,c,d);

        
    }//END void
    
}//END class
