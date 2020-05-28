package PolimorfismoVeiculo;

public abstract class Veiculo {

	double peso;
	int velMax;
	double preco;
	
	public void EntrVeic(double peso, int velMax, double preco) {
		this.peso = peso;
		this.velMax = velMax;
		this.preco = preco;
	}
	
	public void MostrVeic(String id) {
		System.out.println(id + " cadastrao com sucesso!");
		System.out.println("Dados:");
		System.out.println("Peso: " + this.peso + "kg | Vel. Máxima: " + this.velMax + "km/h | Preco: R$ " + this.preco + ".");
	}
}