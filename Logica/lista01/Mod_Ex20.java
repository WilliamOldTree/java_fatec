/*
Lote 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: Bhaskara
Date:02/14/2020

*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex20 {
    public static void main (String[]args){
        //variable informations
        double ax, bx, cx, delta, x1, x2;
        
        //database inputs
        ax=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da variavel A"));
        bx=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da variavel B"));
        cx=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da variavel C"));
        delta = 0;
        x1 = 0;
        x2 = 0;
        		
        // procedure raiz
        
        Procedure_Raiz(ax, bx, cx, delta, x1, x2);
        
    }
     
    	static void Procedure_Raiz(double x1, double x2, double x3, double del, double r1, double r2) {
    	// delta calculate
        del= (Math.pow(x2,2))-(4*x1*x3);
        
        //decision structure
        if(del<0){
            JOptionPane.showMessageDialog(null,"Delta NEGATIVO, nao existe solucao=m nos reais");
        }
        else{
                if (del==0){
                    r1=(-x2)+(Math.sqrt(del))/(2*x1);
                    r2=(-x2)-(Math.sqrt(del))/(2*x1);
                    JOptionPane.showMessageDialog(null, "Delta so permite um resultado nos reais"+r1+r2);
                }               
                           
                else{
                        r1=(-x2)+(Math.sqrt(del))/(2*x1);
                        r2=(-x2)-(Math.sqrt(del))/(2*x1);
                        JOptionPane.showMessageDialog(null,"X1 vale "+r1 +"X2 vale "+r2);
                        }//end else                        
        }
            
        }   
     
    
}//end class



