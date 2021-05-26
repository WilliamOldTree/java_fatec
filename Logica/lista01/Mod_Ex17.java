/*
Lote 01
Maneger: Ricardo Satochi
Developer: William Barbosa
Objective: Comsumption of fuell
Date: 02/13/2020
*/
package lista01;
import javax.swing.JOptionPane;
public class Mod_Ex17{
    public static void main (String[]args)
    {
        // variable informations
        double t_min, hrs, min, tt_km, vm, litros;
        t_min=0;
        tt_km=0;
        litros=0;
        
        // database inputs
        hrs=Double.parseDouble(JOptionPane.showInputDialog("Quantas horas de viagem"));
        min=Double.parseDouble(JOptionPane.showInputDialog("Quantos minutos de viagem"));
        vm=Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade media da viagem"));
        // procedure
        ProcedureConsumo( hrs, min, t_min, tt_km, vm, litros);
    }// end class
        static void ProcedureConsumo(double mf, double h, double m, double kf, double v, double l){
       
        kf=(((h*60)+m)/60)*(v);
        l=kf/12;
        JOptionPane.showMessageDialog(null," Nessa viagem voce gastou "+String.format("%.2f",l)+ " lts de combustivel");
        }        
          
    
    }// end void    
            

