/*
Lote01
Professor: Ricardo Satochi
Programador: William Barbosa
Objetivo: Alicar aumento salarial
*/
package lista01;
import javax.swing.JOptionPane;
public class Lt01_Ex02
{
   public static void main(String[] args)
   {
       //declaração das variaveis
       double sal, n_sal;
       
       //entrada dos dados
       sal=Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO"));
       
       //calculos
       n_sal=sal*1.15;
       
       // saida do processamnento
       JOptionPane.showMessageDialog(null,"SEU NOVO SALARIO É:" + n_sal);
               
       
   }        
   
           
}