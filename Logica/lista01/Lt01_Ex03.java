/*
LOTE 01
Professor : Ricardo Satochi
Programador: William Barbosa
Objetivo: Calcular a area do triangulo
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex03
{
    public static void main(String[]args)
    {
        //declaração das variaveis
        double altura, base, area;
        
        //entrada dos dados
        base=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        
        //calculos
        area=(base*altura)/2;
        
        //show database processed
        JOptionPane.showMessageDialog(null, "A area do traingulo mede" +area);
        
        
        
    } //end void

            
            
}//end class