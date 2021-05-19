/*
LOTE 01
Manager: Ricardo Satochi
Developer: William Barbosa
Objective: 25.	Receba a hora de início e de final de um jogo (HH,MM)
calcular o tempo do jogo em horas e minutos, sabendo que o tempo
máximo é menor que 24 horas e pode começar num dia e terminar noutro.
Data: 2/18/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex25{
    
    public static void main (String[]args){
       /*
        VARIABLE informations
        hi = hora inicial
        hf = hora final
        mini = minuto inicial
        minf = minuto final
        tt_h = total de horas
        tt_min= total de minutos
      */ 
       
       int hi, hf, mini, minf, tt_h, tt_min;
       
       //DATABASE inputs
       hi=Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio da partida"));
       mini=Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial da partida"));
       hf=Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final da partida"));
       minf=Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final da partida"));
       tt_h = 0;
       tt_min = 0;


      Mod_Ex25 nv = new Mod_Ex25();
      nv.partida (hi, hf, mini, minf, tt_h, tt_min); 
    
                   
       
    }//END void
}//end class
    