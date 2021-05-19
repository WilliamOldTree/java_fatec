/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Bhaskara
Date:02/14/2020

*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex20{
    public static void main (String[]args){
        //variable informations
        double ax, bx, cx, delta, x1, x2;
        
        //database inputs
        ax=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da variavel A"));
        bx=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da variavel B"));
        cx=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da variavel C"));
        
        // delta calculate
        delta= (Math.pow(bx,2))-(4*ax*cx);
        
        //decision structure
        if(delta<0){
            JOptionPane.showMessageDialog(null,"Delta NEGATIVO, não existe solução nos reais");
        }
        else{
                if (delta==0){
                    x1=(-bx)+(Math.sqrt(delta))/(2*ax);
                    x2=(-bx)-(Math.sqrt(delta))/(2*ax);
                    JOptionPane.showMessageDialog(null, "Delta so permite um resultado nos reais"+x1+x2);
                }               
                           
                else{
                        x1=(-bx)+(Math.sqrt(delta))/(2*ax);
                        x2=(-bx)-(Math.sqrt(delta))/(2*ax);
                        JOptionPane.showMessageDialog(null,"X1 vale "+x1 +"X2 vale "+x2);
                        }//end else                        
        }
            
        }   
     
    
}//end class
