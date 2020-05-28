package PolimorfismoAnimal;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom(String nome) {
		System.out.println("O cavalo " + nome + " est� relinchando.");
	}
	
	public void correr() {
		System.out.println("O cavalo est� cavalgando");
	}
}
