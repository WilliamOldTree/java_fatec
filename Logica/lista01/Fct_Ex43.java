package lista01;

    public class Fct_Ex43{
        public static int FunctionCalculo(){

            /* declare variable
            i = cont
            */
            double alt_ana, alt_m;
            alt_ana = 1.10;
            alt_m = 1.50;
            int  i;
            i = 0; 

            
            while (alt_ana < alt_m){
              alt_ana = 1.10 + (i * 0.03);
              alt_m = 1.50 + (i * 0.02);
              i++; 
            }//Wend
            return i;
        }// end function

    }// end class