/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objectives: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Date: 2/18/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex24{
    public static void main (String[]args){
        
        /*
        VARIABLE informations
        n=numeros
        */
        int n1;
        
        // DATABASE inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
               
        Mod_Ex24 ex = new Mod_Ex24();
        ex.calc(n1);


    }//END void   
            
}//END class