/*
Professor: Ricardo Satochi
Desenvolvedor: Denis Willima
Objetivo: Procedimento para calcular a venda de cada produto dentro do mes
Date: 25/003/2020
*/
// package
package lista01;

// class
public class ModuloVendaMes_VctEx07{
    public static void ProcedureVendaMes (int week[][], int i, int j){
        //variable
        int mesA = 0, mesB = 0, mesC = 0;

        // calculo produto A
        for (i = 0; i < week.length; i++){
            for(j = 0; j < 1; j++){
                mesA = mesA + (week[i][j]);   
            }// end for
        }//end for
         

        //calculo produto B
        for (i = 0; i < week.length; i++){
            for(j = 1; j < 2; j++){
                mesB = mesB + (week[i][j]);   
            }// end for
        }// end for


        //calculo produto C
        for (i = 0; i < week.length; i++){
            for(j = 2; j < 3; j++){
                mesC = mesC + (week[i][j]);   
            }// end for
        }// end for


        System.out.println("O produto A vendeu "+mesA+ " unidades nesse mes\n"+"O produto B vendeu "+mesB+ " unidades nesse mes\n"+"O produto C vendeu "+mesC+ " unidades nesse mes");
        

    }//end void

}// end class