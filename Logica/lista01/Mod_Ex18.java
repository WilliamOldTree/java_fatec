/*
Lote 01
Maneger: Ricardo Satochi
Developer: William Barbosa
Objective: 18.	Receba 2 valores inteiros. Calcule e mostre o resultado
da diferença do maior pelo menos valor.
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex18
{
    public static void main (String[]args)
    {
        // variable informations
        int n1, n2, sub;
        sub=0;
        //datbase inputs
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        
        //procedure
        ProcedureSubtration(n1,n2,sub);
    }//end void
    static void ProcedureSubtration(int dd1, int dd2,int rest ){
    // decision struture
        if (dd2>dd1)
        {
         JOptionPane.showMessageDialog(null,"Subtração com valor negativo, DIGITAR PRIMEIRO O MAIOR VALOR");
        }
        //endif
        else
        {// processed database
         rest=dd1-dd2;
         JOptionPane.showMessageDialog(null," O RESULTADO DA DIFERENÇA É "+rest);
        }                   
}
}// end class
