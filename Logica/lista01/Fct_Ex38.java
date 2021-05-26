/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective:38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
Date 2/22/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Fct_Ex38 {
    public static String FunctionOrdem(){
    
    //declare variable
    int maior, menor, input, aux;
    String message; 

    maior = 0;
    menor = 0;
    aux = 0; 
    

        for ( int i = 0; i < 4; i++){                
            input = Integer.parseInt(JOptionPane.showInputDialog("Digite números positivos"));
                     
            if (input > maior){
            maior = input;
                                
            }
            else{
            aux = input;
            menor = aux;
            }// end if
          
        }// end for
        message = "O maior numero é  "+maior+ "  e o menor é  "+menor;
        return message;
        

    }//end static 

}// end class