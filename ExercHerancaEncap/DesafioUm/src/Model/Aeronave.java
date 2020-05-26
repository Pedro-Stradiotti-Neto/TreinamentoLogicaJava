package Model;

public class Aeronave {
	
	private String id;
	private String companhia;
	private int velMax;
	private boolean finalizado;
	private int lugares;
	private String tipo;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCompanhia() {
		return companhia;
	}
	
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public int getVelMax() {
		return velMax;
	}
	
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}
	
	public boolean isFinalizado() {
		return finalizado;
	}
	
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	public int getLugares() {
		return lugares;
	}
	
	public void setLugares(int lugares) {
		this.lugares = lugares;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void info() {
		System.out.println("A aeronave " + this.id + "-" + this.tipo + ", da companhia " + this.companhia + ", possui " + this.lugares + " lugares disponíveis");
		System.out.println("Vel. Máxima: " + this.velMax + "km/h | Finalizado: " + this.finalizado);
	}
	
	


}
