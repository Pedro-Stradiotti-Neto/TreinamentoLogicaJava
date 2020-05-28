package PolimorfismoAnimal;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom(String nome) {
		System.out.println("A preguica " + nome + " est� emitindo som.");
	}
	
	public void subindo() {
		System.out.println("A preguica est� subindo a �rvore");
	}

}
