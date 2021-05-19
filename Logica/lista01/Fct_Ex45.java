package lista01;

public class Fct_Ex45{
    public static double FunctionCalculo (){
            
        // declare variable
        double r_s1, res, pos,neg;
        res=0;
        pos=0;
        neg=0;
            
        //processing
        for (int n1 = 1; n1 <= 15; n1++){
            for (int d1 = 1; d1 <= 15; d1++){
                       
                if (d1 % 2 == 0){
                    r_s1 = n1/Math.pow(n1, 2);
                    neg = neg - r_s1;
                    }
                    else{
                        r_s1 = n1/Math.pow(n1, 2);
                        pos = pos + r_s1;
                        res = pos + neg;
                }// end if

            }// end for

        }// end for

        return res;

    }//end function

}// end class