package Main;

import Model.Aeronave;

public class Main {
	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setId("575");
		aeronave.setTipo("Boing");
		aeronave.setCompanhia("Rowel");
		aeronave.setLugares(223);
		aeronave.setFinalizado(true);
		aeronave.setVelMax(500);
		
		aeronave.info();
				
	}
}
