/*
LOTE 01
Professor: Ricardo Satochi
Programador: William Barbosa
Objetivo: Calcular area
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex01
{
    public static void main (String[] args)
    {
        //declaração das variaveis
        int lado, area;
        
        // entrada dos dados
        lado=Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DO LADO"));
        
        // calculos
        area = lado*lado;
                
        JOptionPane.showMessageDialog(null, "AREA DO QUADRADO É " +area);
    }
}



