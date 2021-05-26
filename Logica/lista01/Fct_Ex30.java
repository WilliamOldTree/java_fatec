
package lista01;
public class Fct_Ex30{
	int mes;
		static int dias_mes(int mes){    //Funcao quantidade de dias no mes

		if (mes == 2) {
			return 28;
		}
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		}
		else {
			return 30;                      
		}
    }//End funcao
    
}// end class
