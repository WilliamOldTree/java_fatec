package dinossauro;

public class Dinossauro {

	int energia;
	int velocidade;
	int temperatura;
	int humor;
	
	public Dinossauro (int energia, int velocidade, int temperatura, int humor) {
		this.energia = energia;
		this.velocidade = velocidade;
		this.temperatura = temperatura;
		this.humor =humor;
	}
	
	public void mostrarDinossauro() {
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
				"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
	
	public void pular () {
		System.out.println("Skeep est� pulando, perdendo energia e ganhando humor");
		energia = energia - 1;
		humor = humor +1;
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
				"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
	
	public void correr () {
		System.out.println("Skeep est� correndo, perdendo energia e ganhando humor");
		energia = energia -1;
		humor = humor + 1;
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
		"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
	
	public void comer () {
		System.out.println("Skeep est� comendo, ganhou energia e humor");
		energia = energia+1;
		humor = humor +1;
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
				"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
	
	public void brincar () {
		System.out.println("Skeep est� bricando, perdendo energia e ganhando humor");
		energia = energia -1;
		humor = humor +1;
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
				"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
		
	public void tomarSol() {
		System.out.println("Skeep est� tomando sol e come�ou a se movimentar, perdendo energia e ganhando velocidade");
		humor= humor +1;
		velocidade =velocidade + 1;
		energia = energia - 1;
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
				"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
	
	public void ficarNaSombra() {
		System.out.println("Skeep est� descansando, ganhando energia e perdendo humor");
		energia = energia + 1;
		humor = humor -1;
		System.out.println("Agora Skeep esta com " +"\n" + energia+ " de energia" + 
				"\n" + velocidade+ " de velocidade"+ "\n" +temperatura+  " de temperatura" + "\n" + humor+ " de humor");
	}
	
}
