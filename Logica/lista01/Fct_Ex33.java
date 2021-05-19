package lista01;
    public class Fct_Ex33{
        public static double serie (double n_usu) {
        double res = 0;
            
        
            for (double i = 1; i <= n_usu; i++) {
                res += (1/i);               
            }
            return res;
        }
        
    }