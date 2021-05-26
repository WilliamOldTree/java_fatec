package aeroporto;

public class Aeroporto {
	
	String localizacao;
	String modelo;
	String horario;
	Aeronave aeronave;
	
	public Aeroporto (String localizacao, String modelo, String horario) {
		this.localizacao = localizacao;
		this.modelo = modelo;
		this.horario = horario;
	}
	
	public void mostrarAeoroporto() {
		System.out.println("EMBARQUE: Aeroporto " +modelo + " de " + localizacao + "\n"+ "FUNCIONAMENTO: " + horario);
	}
	public void horaioFuncionamento () {
		System.out.println("Abertura 08:00 Fechamento 23:00");
		
	}
	
		
}
