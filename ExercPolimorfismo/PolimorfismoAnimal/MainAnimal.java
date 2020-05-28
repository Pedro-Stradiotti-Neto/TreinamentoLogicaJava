package PolimorfismoAnimal;

public class MainAnimal {
	
	public static void main(String[] args) {
		
		Veterinario exame = new Veterinario();
		Cachorro cachorro = new Cachorro("Blue", 5);
		Cavalo cavalo = new Cavalo("John", 6);
		Preguica preguica = new Preguica("Sam", 3);
		
		cachorro.emitirSom(cachorro.getNome());
		cavalo.emitirSom(cavalo.getNome());
		preguica.emitirSom(preguica.getNome());

		System.out.println();
		System.out.println("--------- Inicio dos Exames ---------");
		exame.examinar(cachorro, cavalo, preguica);
		
	}
}
