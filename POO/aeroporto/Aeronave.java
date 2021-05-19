package aeroporto;

public class Aeronave {
	
	String fabricante;
	String modelo;
	int capacidade;
	Piloto piloto;
	
	public Aeronave (String fabricante, String modelo, int capacidade) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.capacidade = capacidade;
		
	}
	
	
	public void statusAeronave () {
		System.out.println("Aeronave liberada para voo");
					
	}

}
