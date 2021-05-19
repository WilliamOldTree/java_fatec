/*
Professor: Ricardo Satochi
Desenvlodedor: Denis William
Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas.
Calcular e exibir:
a.	A quantidade de cada produto vendido no mês;
b.	A quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês.
*/
// package
package lista01;

// library imports
import javax.swing.JOptionPane;

// Class
public class Vct_Ex07{
    public static void main(String[] args) {

        // bulding array==array
        int[][] week = new int[4][3];
        int i = 0, j = 0;
        //input data
        for (i = 0; i < week.length; i++){
            for (j = 0; j < week[i].length;j++){
                week[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas unidade do "+(j + 1)+"º produto foi vendida"));
            }// end for 
                 
        }// end for

        ModuloVendaMes_VctEx07.ProcedureVendaMes(week, i, j);  
        ModuloVendaSemana_VctEx07.ProcedureVendaSemana(week, i, j);
    }// end void

}// end class