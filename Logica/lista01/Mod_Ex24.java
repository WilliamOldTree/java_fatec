package lista01;
import javax.swing.JOptionPane;
    public class Mod_Ex24{
        public void calc (int n1){
            
            //CONDITIONAL structure
        if (n1%2==0 & n1%3==0){
            JOptionPane.showMessageDialog(null,"O numero "+n1+" é multiplo de 2 e 3");
        }        
            else{
            JOptionPane.showMessageDialog(null, "O numero "+n1+" não é multiplo de 2 e 3");
            
        }//END if
        }// end void
    }// end class