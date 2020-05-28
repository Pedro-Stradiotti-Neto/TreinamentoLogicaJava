package PolimorfismoAnimal;

public class Veterinario {
	
	public void examinar(Animal animal1, Animal animal2, Animal animal3) {
		
		System.out.println("O " + animal1.getNome() + " está sendo examinado neste momento.");
		animal1.emitirSom(animal1.getNome());
		System.out.println("O " + animal2.getNome() + " está sendo examinado neste momento.");
		animal2.emitirSom(animal2.getNome());
		System.out.println("O " + animal3.getNome() + " está sendo examinado neste momento.");
		animal3.emitirSom(animal3.getNome());
		
		System.out.println("...............");
		System.out.println("...............");
		System.out.println("...............");
		System.out.println("Fim dos exames.");
	}
	
}
