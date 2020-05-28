package PolimorfismoVeiculo;

public class CarroPasseio extends Veiculo{

	String cor;
	String modelo;
	
	public void EntrPass(double peso, int velMax, double preco, String cor, String modelo) {
		EntrVeic(peso, velMax, preco);
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public void MostrPass() {
		MostrVeic("Carro de Passeio");
		System.out.println("Veículo | Cor: " + this.cor + " | Modelo: " + this.modelo + ".");
		
	}
	
}
