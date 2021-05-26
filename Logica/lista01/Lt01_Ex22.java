/*
LOTE 01
Manage: Ricardo Satochi
Developer: William Barbosa
Objective: 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente
Date: 2/17/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex22{
    public static void main (final String[] args) {
        /*VARIABLE informations
        n=numero
        */
        int maior, menor, n1, n2;
        
        //DATABASE inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        maior = 0;
        menor = 0;
        //CONDITIONAL structure
        if (n1 > n2){
            maior=n1;
            menor=n2;
            JOptionPane.showMessageDialog(null,"Os numeros em ordem ficam "+ menor + " e "+maior);
                    
        }
            else{
                            JOptionPane.showMessageDialog(null,"Os numeros em ordem ficam "+ menor+" e "+maior);
                        
        }
               
               }//end void

}// end class