/*
Programador : Ricardo Satoshi
Data                : 23/02/2017
Objetivo          : Calcula o Salário a Receber a partir do Salário Bruto e Desconto
                           Exemplo de Procedures

*/
package lista01;
import javax.swing.JOptionPane;
public class ExemploProcedureParametro {
   
      public static void main ( String args[ ] ) {
      Double SalarioBruto;
      SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO BRUTO"));
      ProcedureSalario(SalarioBruto);
    
  } 
	  

static void ProcedureSalario (Double sb )
  {
       Double Desconto, SalarioLiquido; 
      if (sb < 500)  {
      Desconto = 0.0 ;  }
      else if (sb >= 500 && sb < 800) {
	    Desconto = 0.05;  }
      else if (sb>= 800 && sb < 1200)  {
      Desconto = 0.10;  }
	    else   {
	    Desconto = 0.15;  
      }
	  
      SalarioLiquido = (sb - (sb * Desconto));
       JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SalarioLiquido);
  } 

} 
