package Model;

public class Veiculo {
	
	private int rodas;
	private String marca;
	private String modelo;
	private String combu;
	private int velMax;
	
	public int getRodas() {
		return rodas;
	}
	
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCombu() {
		return combu;
	}
	
	public void setCombu(String combu) {
		this.combu = combu;
	}
	
	public int getVelMax() {
		return velMax;
	}
	
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}
	
	public void info() {
		System.out.println("O veículo " + this.marca + " (modelo " + this.modelo + "), possui " + this.rodas + " rodas e tem velocidade máxima " + this.velMax + "km/h");
	}
	
	public void emMovi(int vel) {
		if(vel > 0) {
			System.out.println("Veículo em movimento");
		} else {
			System.out.println("Veículo parado");
		}
	}
	
	public int acelerar(int vel) {
		vel++;
		System.out.println("Veículo acelerando! | Vel: " + vel);
		return vel;
	}
	
	public int frear(int vel) {
		vel--;
		System.out.println("Veículo desacelerando! | Vel: " + vel);
		return vel;		
	}	
}
