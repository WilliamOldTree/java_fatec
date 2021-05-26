/*
Lote 01
Maneger: Ricardo Satochi
Developer: William Barbosa
Objective: Final Exam
Date: 02/15/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex21{
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
        mend = 0;
        
        //procedure 
        Procedure_Prova(nt1, nt2, nt3, nt4, mend);
    }
     
    	static void Procedure_Prova(double ipt1, double ipt2, double ipt3, double ipt4, double res) {
    	
    	// PROCESSED database
        res=(ipt1+ipt2+ipt3+ipt4)/4;
        
        //CONDITIONAL structure
        if (res > 6){
            JOptionPane.showMessageDialog(null, "Sua media final foi "+res+" VOCE FOI APROVADO");
        }
        else{
            if (res >= 3 || res < 6){
            JOptionPane.showMessageDialog(null, "Sua media final foi "+res+" VOCE ESTA DE EXAME");
            }
        
            else
                    if (res < 3){
                    JOptionPane.showMessageDialog(null, "Sua media final foi "+res+" VOCE FOI REAPROVADO");
                    }
                    
           }// end else
          
    }//endvoid
            
}//end class

        
