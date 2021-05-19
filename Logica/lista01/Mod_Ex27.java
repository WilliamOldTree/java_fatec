/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: " MODULO " Receba o número de voltas, a extensão do circuito (em metros)
e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h
Date: 2/19/2020
*/
package lista01;
import javax.swing.JOptionPane;
    public class Mod_Ex27{
        public void Corrida(double nVoltas, double perc, double time, double km_h){

        //PROCESSED database
        km_h=((perc*nVoltas))/(time/60);
        
        //SHOW results
        JOptionPane.showMessageDialog(null, ("A velocidade média da corrida foi"+km_h+"Km/h"));

        }// end void
                
    }//end class
