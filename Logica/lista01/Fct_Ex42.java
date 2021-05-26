package lista01;
    public class Fct_Ex42{
        public static double FunctionCalculo(){

            // declare variable
            double res,aux;
            res = 0;
            // repeat structure
            for (int divs =1 ; divs <= 50; divs++){

                for (int divd = 1; divd <= 99; divd = divd +2 ){
                 aux = divs/divd;
                 res = aux + aux;
                
                 }// end for

            }// end for

            return res;// value return

        }// end function

    }// end class