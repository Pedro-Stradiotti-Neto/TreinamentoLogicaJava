package ExTreino;

public class Exc02 {
	public static void main (String args[]) {
		int ini = 1000, fim = 1999;
		
		for (int i = ini; i <= fim; i++) {
			if(i%11 == 5 || i%11 == 0) {
				System.out.println("Numero: " + i + " / " + (i%11));
			}
		}
	}
}