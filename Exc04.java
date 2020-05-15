package ExTreino;

import java.util.Scanner;

public class Exc04 {
	public static void main(String args[]) {
		String nome = "";
		double n1 = 0, n2 = 0, aux = 0, cont = 0;
		double media = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		while(cont < 5) {
		
		System.out.print("Digite seu nome:");
		nome = entrada.next();
		
		do {
			System.out.print("Digite a primeira nota:");
			n1 = entrada.nextInt();
			if(n1 < 0 || n1 > 10) {
				System.out.println("Nota Inválida");
			} else {
				aux = 1;
			}
		} while(aux == 0);
		aux = 0;
		do {
			System.out.print("Digite a segunda nota:");
			n2 = entrada.nextInt();
			if(n2 < 0 || n2 > 10) {
				System.out.println("Nota Inválida");
			} else {
				aux = 1;
			}
		} while(aux == 0);

		media = ((n1*1)+(n2*2))/3;
		System.out.printf("O aluno " + nome + " tem média de %.2f %n", media);
		System.out.println("N1: " + n1 + " / N2: " + n2);
		cont++;
		System.out.println("--------------------------");
		}
		System.out.println("Encerrando sistema ....");
		
	}
}