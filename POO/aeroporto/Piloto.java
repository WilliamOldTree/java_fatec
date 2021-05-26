package aeroporto;

public class Piloto {
	String nome;
	int breve;
	float horaVoo;
	
	public Piloto (String nome, int breve, float horaVoo) {
		this.nome = nome;
		this.breve = breve;
		this.horaVoo = horaVoo;
	}
	
	public void mostrarPiloto() {
		System.out.println("PILOTO: " + nome +"\n"+"BREVE: "+ breve+ "\n" + "HORAS DE VOO: " + horaVoo);
	}
	public void liberacaoVoo() {
		System.out.println("O piloto "+ nome+ " esta liberado para o voo");
	}
}
