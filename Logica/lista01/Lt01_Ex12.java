/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Add seveteen years old
Date:02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex12
{
    public static void main (String[]args)
    {
        // variable information
        int y_atual, y_nasc,st_y;
        
        //database inputs
        y_atual=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        y_nasc=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento"));
        
        // processed database
        st_y= (y_atual-y_nasc)+17;
        
        //show results
        JOptionPane.showMessageDialog(null,"Daqui dezessete anos voce terá: "+st_y);
    }//end void
}//end class

