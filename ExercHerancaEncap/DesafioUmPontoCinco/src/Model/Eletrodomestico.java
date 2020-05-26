package Model;

public class Eletrodomestico {
	
	private String id;
	private String nome;
	private String cor;
	private boolean elet;
	private boolean gas;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public boolean isElet() {
		return elet;
	}
	
	public void setElet(boolean elet) {
		this.elet = elet;
	}
	
	public boolean isGas() {
		return gas;
	}
	
	public void setGas(boolean gas) {
		this.gas = gas;
	}
	
	public void info() {
		System.out.println("O equipamento: " + this.nome + " (ID: " + this.id + "), est� na cor " + this.cor);
		if (this.elet) {
			if(this.gas) {
				System.out.println("Equipamento El�trico e com conex�o a G�s");
			} else {
				System.out.println("Equipamento El�trico sem conex�o a G�s");
			}
		} else {
			if(this.gas) {
				System.out.println("Equipamento n�o El�trico, com conex�o a G�s");
			} else {
				System.out.println("Equipamento n�o El�trico e sem conex�o a G�s");
			}
		}
			
	}
	
	
}
