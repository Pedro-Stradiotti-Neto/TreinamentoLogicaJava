package PolimorfismoAnimal;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void emitirSom(String nome) {
		System.out.println("O cachorro " + nome + " está latindo.");
	}
	
	public void correr() {
		System.out.println("O cachorro está correndo");
	}
}