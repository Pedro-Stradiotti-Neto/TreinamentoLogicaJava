package ExTreino;

public class Exc03 {
	public static void main(String args[]) {
		int ini = 233, fim = 456;
		System.out.println("Número Inicial: " + ini);
		System.out.println("----------------------");
		
		while(ini <= fim) {
			if(ini < 300 || ini > 400) {
				System.out.println("Número: " + ini);
				ini += 5;
			} else {
				System.out.println("Número: " + ini);
				ini += 3;				
			}
		}
		System.out.println("----------------------");
		System.out.println("Número Final: " + ini);
	}
}
