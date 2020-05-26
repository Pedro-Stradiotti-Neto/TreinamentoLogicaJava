package Main;

import java.util.Scanner;

import Model.Carro;
import Model.Moto;

public class Main {

	public static void main(String[] args) {

		int op = 0;
		Scanner entrada = new Scanner(System.in);
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.setModelo("Palio");
		carro.setMarca("Palio");
		carro.setCombu("Etanol");
		carro.setMarcha("Comum");
		carro.setPortas(5);
		carro.setRodas(5);
		carro.setVelMax(210);
		
		moto.setModelo("FF-55");
		moto.setCombu("Gasolina");
		moto.setCili(500);
		moto.setMarca("Suzuki");
		moto.setRodas(2);
		moto.setVelMax(170);
		
		carro.info();
		moto.info();
		
		// Dinâmico para Acelerar e Desacelerar
		
		while(op != 1) {
			System.out.println("Veículo parado");
			System.out.println("1 - Finalizar Simulacão");
			System.out.println("2 - Acelerar");
			System.out.println("3 - Desacelerar");
			System.out.println("4 - Simular Curva");
			System.out.print("Opcão:");
			op = entrada.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("---------------------");
					System.out.println("Finalizando Simulacão");
					System.out.println("---------------------");
					break;
				case 2:
					System.out.println("---------------------");
					System.out.println("5 - Carro");
					System.out.println("6 - Moto");
					System.out.print("Opcão:");
					op = entrada.nextInt();
					if(op == 5) {
						carro.setVelIni(carro.acelerar(carro.getVelIni())); 
					} else if (op == 6) {
						moto.setVelIni(moto.acelerar(moto.getVelIni()));
					}
					break;
				case 3:
					System.out.println("---------------------");
					System.out.println("5 - Carro");
					System.out.println("6 - Moto");
					System.out.print("Opcão:");
					op = entrada.nextInt();
					if(op == 5) {
						carro.setVelIni(carro.frear(carro.getVelIni())); 
					} else if (op == 6) {
						moto.setVelIni(moto.frear(moto.getVelIni()));
					}
					break;
				case 4:
					System.out.println("---------------------");
					System.out.println("5 - Carro");
					System.out.println("6 - Moto");
					System.out.print("Opcão:");
					op = entrada.nextInt();
					if(op == 5) {
						carro.curva(); 
					} else if (op == 6) {
						moto.curva();
					}
					break;
				}
				System.out.println("---------------------");			
		}
		
	}

}
