package Model;

public class Carro extends Veiculo {
	
	private int portas;
	private String marcha;
	private int velIni = 0;
	private int cap = 70;
	
	public int getVelIni() {
		return velIni;
	}

	public void setVelIni(int velIni) {
		this.velIni = velIni;
	}

	public int getPortas() {
		return portas;
	}
	
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	public String getMarcha() {
		return marcha;
	}
	
	public void setMarcha(String marcha) {
		this.marcha = marcha;
	}
	
	public void curva() {
		if(this.velIni > cap) {
			System.out.println("Veículo capotou!");
		} else {
			System.out.println("Veículo prosseguindo!");
		}	
	}
	
}
