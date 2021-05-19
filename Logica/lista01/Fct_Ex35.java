/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective:Receba 2 números inteiros, verifique qual o maior entre eles.
Calcule e mostre o resultado da somatória dos números ímpares entre esses valores
Date 2/22/2020
*/
package lista01;
    public class Fct_Ex35{
        public static int funcao_calculo (int n1, int n2) {
            
            //declare variable
            int maior, menor, seq;
            seq = 2;
            //Validate condition
        if (n1 < n2) {
            maior = n2;
            menor = n1;        
        }   else { 
                maior = n1;
                menor = n2;
            }//End if
        
//Repeat structure
        while (maior > menor) {
            maior =  maior - 2;
            seq = maior + seq;
         
          }
          return seq;

        }// end int
    }// end class