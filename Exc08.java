package ExTreino;

import java.util.Scanner;

public class Exc08 {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numHab = 20;
		double mediaSal = 0, mediaFilhos = 0, maiorSal = 0, perc = 0;
		double[][] hab = new double[numHab][2];
		
		for(int i = 0; i < numHab; i++ ) {
			System.out.print("Qual seu salário? ");
			hab[i][0] = entrada.nextInt();
			System.out.print("Quantos filhos? ");
			hab[i][1] = entrada.nextInt();
		}
		
		for(int i = 0; i < numHab; i++ ) {
			mediaSal += hab[i][0];
			mediaFilhos += hab[i][1];
			
			if(hab[i][0] > maiorSal) {
				maiorSal = hab[i][0];
			}
			
			if(hab[i][0] < 100) {
				perc++;
			}
		}
		
		mediaSal /= numHab;
		mediaFilhos /= numHab;
		perc = (perc/numHab)*100;
		
		System.out.println("-------------------------------");
		System.out.printf("Média de Salário: %.2f \n", mediaSal);
		System.out.printf("Média de Filhos: %.1f \n", mediaFilhos);
		System.out.printf("Maior Salário: %.2f \n", maiorSal);
		System.out.printf("Pessoas que ganham menos de R$100,00: %.1f", perc);
		System.out.println("%");
		System.out.println("-------------------------------");
		System.out.println("Encerrando sistema ....");
		
	}
}
