package lista01;
import javax.swing.JOptionPane;

public class Mod_Ex30 {

    static void calculo(){               // modulo calculo dias de vida

    
    int dia_nasc, mes_nasc, ano_nasc, dia_atu, mes_atu, ano_atu, dias_vida, bi = 0;
    
    // entrada de dados
    dia_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento:"));
    mes_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes do nascimento:"));
    ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento:"));
    dia_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
    mes_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes atual:"));
    ano_atu = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
    
    
    for (int i= ano_nasc+1; i < ano_atu; i++) {       //contagem de anos bissextos
        if (i % 4 == 0) {
            bi ++;
        }
    }

    /*
     calculo dos dias de vida entre ano nascimento
     e ano atual + dias de ano bissextos
    */ 

    dias_vida = ((ano_atu - ano_nasc - 1)*365) + bi; // -1 porque o ano atual não acabou e será somado depois
    if ((mes_nasc <= 2) && (ano_nasc % 4 == 0)) {
        dias_vida++;
    }
    if ((mes_atu > 2) && (ano_atu % 4 == 0)) {
        dias_vida++;
    }
    
    for (int i = mes_nasc; i <= 12; i++) {     //acrescenta dias do ano que nasceu
        dias_vida += Fct_Ex30.dias_mes(i);
    }
    
    dias_vida -= dia_nasc;                    //subtrai os dias não vividos do mes de nasc
    

    for (int i = 1; i < mes_atu; i++) {      //acrescenta dias do ano atual
        dias_vida += Fct_Ex30.dias_mes(i);
    }
    
    dias_vida += dia_atu;                   //acrescenta dias do mes atual
    
    JOptionPane.showMessageDialog(null, "Total de dias vividos: " + dias_vida);

    }//End void

}// End class