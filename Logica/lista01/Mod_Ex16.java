/*

*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex16{
    static double hrs, v_hrs, desc, dep, sal_brt, sal_liq;
    public static void main(String[]args){
    // variable informations
    
        
    // database inputs
    hrs=Double.parseDouble(JOptionPane.showInputDialog("Digite o total de horas trabalhadas"));
    v_hrs=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
    desc=Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
    dep=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dependentes"));
    
    ProcedureSalario();
    }
static void ProcedureSalario ()
{
    sal_brt= (hrs*v_hrs);
    sal_liq= (sal_brt)-((sal_brt)*(desc/100))+(dep*100);


  
    JOptionPane.showMessageDialog(null, "Seu salario liquido é:  R$ "+String.format("%.2f",sal_liq));
}
}//end class