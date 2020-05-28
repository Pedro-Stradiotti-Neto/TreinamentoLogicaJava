package Collection;

public class Telefone {

	String nrTelefone;
	 String id;
	 int tipoTelefone;
	
	public void cadastrar(String nr, int id) {
		
		this.nrTelefone = nr;
		this.tipoTelefone = id;
		
		switch(id) {
		case 0:
			this.id = "Residencial";
			break;
		case 1:
			this.id = "Comercial";
			break;
		case 2:
			this.id = "Celular";
			break;
		}
	}
	
	public void show() {
		System.out.println("Telefone " + this.id);
		System.out.println("Numero: " + this.nrTelefone);
	}
	
}
