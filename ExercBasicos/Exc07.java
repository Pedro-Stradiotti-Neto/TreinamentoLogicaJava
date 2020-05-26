package ExTreino;

import java.util.Scanner;

public class Exc07 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		int[] fat = {1, 2, 3, n};
		double[] fatresult = {1, 1, 1 ,1};
		double result = 0;
		
		do {
			System.out.print("Digite um valor positivo: ");
			n = entrada.nextInt();
			if(n < 0) {
				System.out.print("Valor Inválido!");
			} else {
				fat[3] = n;
			}
		} while(n < 0);
		
	// Valor do Factorial
		for(int linha = 0; linha < fat.length; linha++) {
			for(int i = 2; i <= fat[linha]; i++) {
				fatresult[linha] *= i; 
			}
		}
		result = 1 + 1 / fatresult[0] + 1 / fatresult[1] + 1 / fatresult[2] + 1 / fatresult[3];
		
		System.out.printf("O resultado é: %.2f \n", result);
		System.out.println("-------------------------------");
		System.out.println("Encerrando sistema ....");
	}
}
