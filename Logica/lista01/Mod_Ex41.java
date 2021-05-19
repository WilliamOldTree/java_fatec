package lista01;
import javax.swing.JOptionPane;
    public class Mod_Ex41{

        public static void ProcedureCalculo (){
        
        //declare variable
        int i, j;
        
        // repeat structure
        for (i = 0; i < 7; i ++){
        
            for(j = 0; j < 7; j++){
             
                if (i + j == 7){
                    System.out.println(i+ " + "+j+ " =  7 ");
                }// end if

            }// end for
        
        }// end for
    
        JOptionPane.showMessageDialog(null, "FIM DA EXECUÇÃO");

        }// end procedure

    }// end class