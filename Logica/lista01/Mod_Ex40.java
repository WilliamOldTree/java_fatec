/*
Algoritmo "Primos"
Disciplina  :  [Linguagem e Lógica de Programação] 
Professor   :Ricardo Satoshi Oyakawa 
Descrição   : "Procedimento" Receba 2 números inteiros.
Verifique e mostre todos os números primos existentes entre eles.
Autor(a)    : Denis William
Data atual  : 2/24/2020
*/
package lista01;
    public class Mod_Ex40{
        public static void ProcedureCalculo(int n1, int n2) {
            
            // declare variable
            double maior, menor, i, seq, divisor = 0;
            
            //Codition structure
            if (n1 > n2){
                maior = n1;
                menor = n2;                      
            }
                else{
                    maior = n2;
                    menor = n1;
                }//end if
                
            //repeat variable
            
            for (seq = maior; seq >=  menor; seq--){
                for (i = 1; i <= maior; i ++){
                   
                    if(seq % i == 0){
                        divisor = divisor + 1;
                    }// end if
                          
                }//end for
                if (divisor == 2){
                    System.out.println(seq);
                    divisor = 0;
                }
                        else{
                            divisor = 0;
                        }
                
                
            }// end for
            
                 
            
                  
        }// end procedure

    }// end class