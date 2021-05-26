package lista01;
    public class Fct_Ex36{
        public static double Funcao_Fatorial ( double j, double n_usu, double serie, double fat ){
         
            // declare variable

            fat = fat * j;
            serie = serie + (1/fat);
            
            return serie;


        }//end fuction

    }// end class