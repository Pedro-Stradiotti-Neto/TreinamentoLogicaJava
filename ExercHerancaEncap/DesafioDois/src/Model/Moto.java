package Model;

public class Moto extends Veiculo {
	
	private int cili;
	private int velIni = 0;
	private int cap = 60;
	
	
	public int getVelIni() {
		return velIni;
	}

	public void setVelIni(int velIni) {
		this.velIni = velIni;
	}

	public int getCili() {
		return cili;
	}

	public void setCili(int cili) {
		this.cili = cili;
	}

	public void curva() {
		if(this.velIni > cap) {
			System.out.println("Veículo capotou!");
		} else {
			System.out.println("Veículo prosseguindo!");
		}
	}
}
