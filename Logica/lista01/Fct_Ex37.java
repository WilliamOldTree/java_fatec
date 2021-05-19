package lista01;
    public class Fct_Ex37{
        public static void ProcedureFibonacci(int limite){
            
            //declare variable
            int n1, n2, n3;
            n1 = -1;
            n2 = 1;
            for (int i =  1; i <= limite; i++){
                n3 = n1+n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n3);
            }  
                
            

        }//end fuction 

    }// end class