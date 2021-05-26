package lista01;

public class Funcao_Recursiva_Fibonacci{
        public static int Ffat (int numero){
           // variable
           int fat;
           
            if (numero > 1){
                fat = numero * Ffat (numero-1);
                return fat;
            }    
                else{
                    return 1;
                }

        }

    }

