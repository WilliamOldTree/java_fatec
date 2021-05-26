package aeroporto;

public class Teste {
	public static void main(String[] args) {
	
		Aeroporto gruairport = new Aeroporto ("Guarulhos", "Internacional", "24 horas");
		Aeronave a320 = new Aeronave("Aibus", "A320", 200);
		gruairport.aeronave = a320;
		Piloto p1 = new Piloto ("CPT Marcos", 123456, 2200);
		a320.piloto = p1;
		Pessoa cliente = new Pessoa ("Sergio Gomes", 32, 321268161);
		Passageiro voo = new Passageiro (true, 2580, true);
		voo.pessoa = cliente;
		
		
		
		cliente.mostrarPessoa();
		voo.verificarReserva();
		voo.verificarCheckin();
		gruairport.mostrarAeoroporto();
		a320.piloto.mostrarPiloto();
		p1.liberacaoVoo();
		a320.statusAeronave();
		
		
		
		
		
	}
}
