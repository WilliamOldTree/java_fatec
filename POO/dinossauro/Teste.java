package dinossauro;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
				
				
		Dinossauro skeep = new Dinossauro (5, 5, 5, 5);
		skeep.mostrarDinossauro();
		
		String opcao;
		@SuppressWarnings("resource")
		Scanner entrada  = new Scanner (System.in);
			
			while (true) {
				menu();
				opcao = entrada.nextLine().toLowerCase();
			switch (opcao) {
			
			case "p":skeep.pular();
			break;
			case "r":skeep.correr();
			break;
			case "c":skeep.comer();
			break; 
			case "b":skeep.brincar();
			break;
			case "s":skeep.tomarSol();
			break;
			case "d":skeep.ficarNaSombra();
			break;
				
			default:System.out.println("Escolha uma opção valida");
			}
		}
			
	}
			private static void menu() {
				System.out.println("ESCOLHA UMA TAREFA PARA O SKEEP");
				System.out.println("(P) Pular");
				System.out.println("(R) Correr");
				System.out.println("(C) Comer");
				System.out.println("(B) Brincar");
				System.out.println("(S) Tomar sol");
				System.out.println("(D) Descansar");
				}
}
