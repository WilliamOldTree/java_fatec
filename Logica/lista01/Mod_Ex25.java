/*
Professor: Ricardo Satochi
Desenvolvedor: Denis William
Objetivo: Modulo de calculo da partida
*/
package lista01;
import javax.swing.JOptionPane;
    public class Mod_Ex25{
    public void partida(int hi, int hf, int mini, int minf, int tt_h, int tt_min){
      
        //PROCESSED database
       tt_h= (hf-hi);
       tt_min= (minf-mini);
       
       //CONDITIONAL structures
       if (tt_h<0 & tt_min<0){
       tt_h=(tt_h)+23;
       tt_min=(tt_min)+60;
       }//END if 
       
            else if (tt_h<0 & tt_min>0){
            tt_h=tt_h+24;
            }//END if
                        
                    else if (tt_h>0 & tt_min<0){
                    tt_h=(tt_h)-1;
                    tt_min=(tt_min)+60;        
                                    
                    }//END if
            JOptionPane.showMessageDialog(null,+ tt_h +":" +tt_min);
    }//END void

}// end class
