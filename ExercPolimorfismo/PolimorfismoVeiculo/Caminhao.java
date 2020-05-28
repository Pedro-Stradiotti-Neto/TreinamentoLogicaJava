package PolimorfismoVeiculo;

public class Caminhao extends Veiculo{
	
	double capac;
	int alturaMax;
	int compri;
	
	public void EntrCam(double peso, int velMax, double preco, double capac, int alturaMax, int compri) {
		EntrVeic(peso, velMax, preco);
		this.capac = capac;
		this.alturaMax = alturaMax;
		this.compri = compri;		
	}
	
	public void MostrCam() {
		MostrVeic("Caminhão");
		System.out.println("Veículo | Capacidade: " + this.capac + "t | Altura Máxima: " + this.alturaMax+ "m | Comprimento: " + this.compri  + "m.");
	}

}
