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
		System.out.println("O equipamento: " + this.nome + " (ID: " + this.id + "), está na cor " + this.cor);
		if (this.elet) {
			if(this.gas) {
				System.out.println("Equipamento Elétrico e com conexão a Gás");
			} else {
				System.out.println("Equipamento Elétrico sem conexão a Gás");
			}
		} else {
			if(this.gas) {
				System.out.println("Equipamento não Elétrico, com conexão a Gás");
			} else {
				System.out.println("Equipamento não Elétrico e sem conexão a Gás");
			}
		}
			
	}
	
	
}
