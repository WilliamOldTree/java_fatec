package lista01;
import javax.swing.JOptionPane;
    public class Fibonacci_Recursivo{
        public static void main (String[] args) {

        // variable
        int numero;

        // input data
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));

        //fuction
        JOptionPane.showMessageDialog(null, Funcao_Recursiva_Fibonacci.Ffat(numero));

        }// end main

    }// end class