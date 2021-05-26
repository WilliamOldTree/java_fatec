package lista01;

    public class Fct_Ex44{
        public static int FunctionCalculo(int base, int poten){
            // declare variable
            int cont, aux;

            // processing
            aux = base;
            for (cont = 1; cont < poten; cont++ ){
                aux = aux * base; 
            }

            // return value
            return aux;

        }// end function

    }// end class
