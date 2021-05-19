/*
Lote 01
Maneger: Ricardo Satochi
Developer: William Barbosa
Objective: Final Exam
Date: 02/15/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex21{
    public static void main(String[]args){
            
        /*
        VARIABLE Informations
        nt= nota
        mend= media final       
        */
        double nt1, nt2, nt3, nt4, mend;
        
        // DATABASE inputs
        nt1=Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 1"));
        nt2=Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 2"));
        nt3=Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 3"));
        nt4=Double.parseDouble(JOptionPane.showInputDialog("Entre com a nota 4"));
        
        // PROCESSED database
        mend=(nt1+nt2+nt3+nt4)/4;
        
        //CONDITIONAL structure
        if (mend > 6){
            JOptionPane.showMessageDialog(null, "Sua media final foi "+mend+" VOCE FOI APROVADO");
        }
        else{
            if (mend >= 3 || mend < 6){
            JOptionPane.showMessageDialog(null, "Sua media final foi "+mend+" VOCE ESTA DE EXAME");
            }
        
            else
                    if (mend < 3){
                    JOptionPane.showMessageDialog(null, "Sua media final foi "+mend+" VOCE FOI REAPROVADO");
                    }
                    
           }// end else
          
    }//endvoid
            
}//end class

        