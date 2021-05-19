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
public class Lt01_Ex28{
    public static void main(String[]args){
        /*
         VARIABLE informations
        v_mensal= venda mensal
        p_atual= valor atual
        p_new= novo preço
        */
        double v_mensal, p_atual, p_new;
        v_mensal = 0;
        p_atual = 0;
        p_new = 0;
        //DATABASE inputs
        p_atual=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor atual da mercadoria"));  
    
        Mod_Ex28.Produto(v_mensal, p_atual, p_new);
        
    }//END Void
    
}//END class