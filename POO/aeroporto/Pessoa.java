package aeroporto;

public class Pessoa {
	String nome;
	int idade;
	int cpf;
	
	public Pessoa (String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public void mostrarPessoa() {
		System.out.println("CLIENTE: "+nome+ "\n"+ "IDADE: "+idade+ " ANOS"+"\n" + "CPF:"+ cpf);
	}
	public void confirmarDados() {
		System.out.println("O dados do cliente"+nome+" estão corretos");
	}
}
