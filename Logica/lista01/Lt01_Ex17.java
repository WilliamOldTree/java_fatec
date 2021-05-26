/*
Lote 01
Maneger: Ricardo Satochi
Developer: William Barbosa
Objective: Comsumption of fuell
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex17
{
    public static void main (String[]args)
    {
        // variable informations
        double hrs, min, t_min, tt_km, vm, litros;
        
        // database inputs
        hrs=Double.parseDouble(JOptionPane.showInputDialog("Quantas horas de viagem"));
        min=Double.parseDouble(JOptionPane.showInputDialog("Quantos minutos de viagem"));
        vm=Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade media da viagem"));
       
        // processed database
        t_min=((hrs*60)+(min))/60;
        tt_km=vm*t_min;
        litros=tt_km/12;
        
        JOptionPane.showMessageDialog(null," Nessa viagem voce gastou "+String.format("%.2f",litros)+ " lts de combustivel");
    }//end void
}//end class