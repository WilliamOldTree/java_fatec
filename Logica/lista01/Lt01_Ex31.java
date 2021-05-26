/*
Professor   :Ricardo Satoshi Oyakawa 
Descrição   :Calcule e mostre o quadrado dos números entre 10 e 150
Autor(a)    : Denis William
Data atual  : 2/20/2020
*/
package lista01;

public class Lt01_Ex31{
    public static void main(String[]args){
        
        //VARIABLE informations
        double res = 0 ;
        for (int i = 10; i < 150; i++){
            res =  Fct_Ex31.quadrado(i);
            System.out.println(res);             
        }  
           
         
             
    }//END void               

}//END class
