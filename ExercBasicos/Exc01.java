package ExTreino;

public class Exc01 {
	public static void main (String args[]) {
		int i, somaImpar = 0, fim = 500;
		
		for(i=1; i<=fim; i++) {
			if(i%2 != 0) {
				if(i%3==0) {
					somaImpar += i; 
				}
			}
		}
		
		System.out.println("Somam dos Numeros: " + somaImpar);
	}
}