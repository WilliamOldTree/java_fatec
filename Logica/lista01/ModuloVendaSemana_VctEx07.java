/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: Procedimentoalcular a venda semanal de cada produto e mensal de todos
Date: 25/03/2020
*/
//package
package lista01;

//Class
public class ModuloVendaSemana_VctEx07{
    public static void ProcedureVendaSemana (int week[][], int j, int i){
        
        //variable
        int semana1 = 0, semana2 = 0, semana3 = 0, semana4 = 0, total_mes = 0;

        
        //calculo da 1ª semana
        for (i = 0; i < 1; i++){
            for (j = 0; j < week[i].length; j++){
                semana1 = semana1 + (week[i][j]);
            }// end for        
        } // end for


        //calculo da 2ª semana
        for (i = 1; i < 2; i++){
            for (j = 0; j < week[i].length; j++){
                semana2 = semana2 + (week[i][j]);
            }//end for            
        }//end for
        

        //calculo da 3ª semana
        for (i = 2; i < 3; i++){
            for (j = 0; j < week[i].length; j++){
                semana3 = semana3 + (week[i][j]);
            }//end for  
        }//end for


        //calculo da 4ª semana
        for (i = 3; i < 4; i++){
            for (j = 0; j < week[i].length; j++){
                semana4 = semana4 + (week[i][j]);
            }//end for
        }//end for

        // calculo toatal vendas
        total_mes = (semana1 + semana2 + semana3 + semana4);

        //show results
        System.out.println("");
        System.out.println("Na 1ª semana foram vendidos "+semana1+" produtos\n"+"Na 2ª semana foram vendidos "+semana2+" produtos\n"+"Na 3ª semana foram vendidos "+semana3+" produtos\n"+"Na 4ª semana foram vendidos "+semana4+" produtos\n");
        System.out.println("");
        System.out.println("A venda total dos produtos [A] [B] [C] este mes foi de "+total_mes+" unidades");
   
    }// end void


}// end class