/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: " MODULO "
Receba 2 números inteiros. Verifique e mostre se o maior número
é múltiplo do menor
Date: 2/19/2020
*/

package lista01;
import javax.swing.JOptionPane;
    public class Mod_Ex26{
        public void IntMaior(int n1, int n2, int maior, int menor){
            
            // started variable
            maior = 0;
            menor = 0;
             //CONDITIONAL structure
        if (n1>n2){
            maior=n1;
            menor=n2;
        }
            else if (n2>n1){
            maior=n2;
            menor=n1;       
            }// END if  
        
        int res;
        res = maior % menor;
        if (res == 0){
        JOptionPane.showMessageDialog(null,"O número "+maior+ " é múltiplo do número "+menor);
        }
        else if (res != 0){
        JOptionPane.showMessageDialog(null, "O número "+maior+" não é multiplo do número"+menor);
        }//END if


        }// end void

    }// end class

