package ExTreino;

import java.util.Scanner;

public class Exc05 {
	public static void main(String args[]) {
		double num = 0, media = 0, total = 0, i = 0;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		num = entrada.nextDouble();
		i += 1;

		while(num > 0) {
			total += num;
			media = (total/i);
			System.out.println("Digite um numero: ");
			num = entrada.nextDouble();
			if(num > 0) {
				i += 1;
			}
		}
		
		System.out.println("Total de numeros digitados: " + i);
		System.out.printf("Somatório: %.2f \n", total);
		System.out.printf("Média dos valores: %.2f \n", media);
		System.out.println("-----------------------");
		System.out.println("Encerrando sistema ....");
			
		
		
	}
}
