package lista01;

public class Fct_VtrEx01{
    public static int CalculoImpar(int vetor1[], int i, int impar){
        
        
        if (vetor1[i] % 2 != 0){
            impar = impar + vetor1[i];

        }// end if

        return  impar;
    }
}// end class
