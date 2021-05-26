/*
modulo calculo
*/
package lista01;
import javax.swing.JOptionPane;
    
    public class Mod_Ex23{

        // procedure
       public void Calculo(int a, int b, int c, int d){
            if (d > a & d > b & d > c){
                JOptionPane.showMessageDialog(null,"A sequencia em ordem crescente fica: "+a+b+c+d);
            }//END if
                else{
                        if (d>a & d>b & d<c ){
                           JOptionPane.showMessageDialog(null, "A sequencia em ordem crescente fica:"+a+b+d+c);
                        }//END if
                        else{
                            if (d>a & d<b & d<c){
                               JOptionPane.showConfirmDialog(null,"A sequencia em ordem crescente fica: "+a+d+b+c);
                            }//END if
                                else{
                                    if (d<a & d<b & d<c){
                                       JOptionPane.showMessageDialog(null,"A sequencia em ordem crescente fica: "+d+a+b+c);
                                    }//END if
                            }//END else
    
                        }//END else
    
                    }//END else   
       
                }// end void
                
            }// end class
        