/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: 27.	Receba o número de voltas, a extensão do circuito (em metros)
e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h
Date: 2/19/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex27{
    public static void main (String[]args){
        /*
        VARIABLE informations
        nVoltas= numero de voltas
        perc = percurso
        */
        
        double nVoltas, perc, time, km_h;
        km_h = 0;

        //DATABASE inputs
        nVoltas=Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas do percurso"));
        perc=Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do percurso"));
        time=Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo da corrida em minutos"));
        
        Mod_Ex27 obj = new Mod_Ex27();
        obj.Corrida(nVoltas, perc, time, km_h);         
        
    }//END void
    
}//END class
