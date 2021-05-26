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
    public class Mod_Ex29{
        public void Invest(double cash, double corr, double invest){
        
            //CONDITIONAL structure
            if (invest==1){
            corr=cash*1.03;
            JOptionPane.showMessageDialog(null, " Agora seu JOptionPane.showMessageDialogvalor corrigido é: "+ corr);
            }//END if
                else if (invest==2){
                    corr=cash*1.05;
                    JOptionPane.showMessageDialog(null, " Agora seu JOptionPane.showMessageDialogvalor corrigido é: "+ corr);
                }

        }// end void

    }// end class