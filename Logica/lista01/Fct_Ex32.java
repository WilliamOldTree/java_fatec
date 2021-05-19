package lista01;
    public class Fct_Ex32{
        public static int fact ( int n_usu) {
        
        //processing
             
        int cont, f;     
              
        cont=n_usu;
        f = n_usu;

            do{
            cont=(cont-1);
            f=(f*cont); 
            }while (cont>1);
            return f;
        }
    }