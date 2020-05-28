package PolimorfismoVeiculo;

public class Main {
	
	public static void main(String[] args) {
		
		CarroPasseio carro = new CarroPasseio();
		Caminhao caminhao = new Caminhao();
		
		carro.EntrPass(5.4, 230, 57000, "verde", "Palio");
		caminhao.EntrCam(8, 180, 42000, 12, 3, 17);
		
		carro.MostrPass();
		System.out.println();
		caminhao.MostrCam();		
	}
}