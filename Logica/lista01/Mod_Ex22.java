/*
LOTE 01
Manage: Ricardo Satochi
Developer: William Barbosa
Objective: 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente
Date: 2/17/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex22 {
    public static void main (String[]args){
        /*VARIABLE informations
        n=numero
        */
        int n1,n2, maior, menor;
        
        //DATABASE inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        maior = 0;
        menor = 0;
        //procedure
        Procedure_Inteiros(n1,n2, maior, menor);
    }
    
    	static void Procedure_Inteiros(int ipt1, int ipt2, int grd, int pqn) {
    		
        //CONDITIONAL structure
        if (ipt1 > ipt2){
            grd=ipt1;
            pqn=ipt2;
            JOptionPane.showMessageDialog(null,"Os numeros em ordem ficam "+ ipt2+ " e "+ipt1);
                    
        }
            else{
                            JOptionPane.showMessageDialog(null,"Os numeros em ordem ficam "+ipt1+" e "+ipt2);
                        
            }
    	}
                
               
    }//end void
    



