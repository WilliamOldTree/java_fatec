/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective:Receba 2 números inteiros, verifique qual o maior entre eles.
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores
Date 2/22/2020

*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex35 {
    public static void main(String[]args) {
       
//Variable declarations
       int n1, n2, seq;
       
// Database inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

        seq = Fct_Ex35.funcao_calculo(n1, n2); 

        JOptionPane.showMessageDialog(null, "O somatorio dos valores impares desse intervalo é"+seq);
        


        
    }//End void
    
}// End class

