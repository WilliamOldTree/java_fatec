/*
Lote 01
Manage: Ricardo Satochi
Developer: William Barbosa
Objective:28.	Receba o preço atual e a média mensal de um produto.
Calcule e mostre o novo preço sabendo que:
Venda Mensal	           Preço Atual  	  Preço            Novo
< 500	                    < 30	            +               10%
>= 500 e < 1000             >= 30 e < 80	    +               15%
>= 1000                     >= 80	            -               5%
Obs.: para outras condições, preço novo será igual ao preço atual
Date: 2/19/2020 
*/
package lista01;
import javax.swing.JOptionPane;
    public class Mod_Ex28{
        public static void Produto (double v_mensal, double p_atual, double p_new){

            //PROCESSED database
        v_mensal= p_atual*30;
        //CONDITIONAL structure
        if (v_mensal<500 & p_atual<30){
            p_new= p_atual*1.10;
            JOptionPane.showMessageDialog(null, " O novo preço da mercadoria é "+p_new);
        } //END if
            else if (v_mensal>=500 & v_mensal<1000 & p_atual>=30 & p_atual<80){
            p_new= p_atual*1.15;
            JOptionPane.showMessageDialog(null, "O novo preço da mercadoria é "+p_new);
            }//END else
                else if (v_mensal>=1000 & p_atual>=80){
                p_new=p_atual*1.05;
                JOptionPane.showMessageDialog(null, "O novo preço da mercadoria é "+p_new);
                }//END else
                    else{
                    JOptionPane.showMessageDialog(null, "A mercadoria nã sofrerá reajuste em seu valor");
                    }//END else
                    
        }//end void

    }// end class
