/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: 29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) 
e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias
sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão
considerados.
Date:2/19/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex29{
    public static void main(String[]args){
        /*
         VARIABLE informations
        cash= valor investido
        corr= valor corrigido
        invest= tipo de investimento
        */
        double cash, corr, invest;
        corr = 0;

        //DATABASE inputs
        invest=Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de aplicação /n 1-Poupança /n 2- Renda Fixa"));
        cash=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));
        
        Mod_Ex29 obj =  new Mod_Ex29();
        obj.Invest(cash, corr, invest);

    }//END void

}//END class