package Main;

import Model.Eletrodomestico;

public class Main {

	public static void main(String[] args) {

		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		eletrodomestico.setId("ade34gt7");
		eletrodomestico.setNome("Fogão");
		eletrodomestico.setCor("Branca");
		eletrodomestico.setElet(true);
		eletrodomestico.setGas(false);
		
		eletrodomestico.info();
		
	}

}
