/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Salary
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex16
{
    public static void main (String[]args)
    {
        // variable informations
        double hrs, v_hrs, desc, dep, sal_brt, sal_liq;
        
        // database inputs
        hrs=Double.parseDouble(JOptionPane.showInputDialog("Digite o total de horas trabalhadas"));
        v_hrs=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
        desc=Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
        dep=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dependentes"));
        
        // prrocessed database
        sal_brt= (hrs*v_hrs);
        sal_liq= (sal_brt)-((sal_brt)*(desc/100))+(dep*100);
        
        //show results
        JOptionPane.showMessageDialog(null, "Seu salario liquido é:  R$ "+sal_liq);
        
        
    }//end void
    
}//end class
        