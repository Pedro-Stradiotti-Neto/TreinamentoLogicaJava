package ExTreino;

import java.util.Scanner;

public class Exc06 {
	public static void main(String args[]) {
		int Qtdpessoas = 150, carac = 3, aux = 1, op = 0;
		int q1=0, q2=0, q3=0, q4=0, q5=0;
		String[][] pessoas = new String[Qtdpessoas][carac];
		
		Scanner entrada = new Scanner(System.in);

		for(int i = 0; i < Qtdpessoas; i++) {
			aux = 1;
			for(int j = 0; j < carac; j++) {
				switch(aux) {
				case 1:
					System.out.print("Qual sua idade? ");
					pessoas[i][j] = entrada.next();
					aux++;
					break;
				case 2:
					System.out.print("Sexo (1-M / 2-F) ");
					op = entrada.nextInt();
					if(op == 1) {
						pessoas[i][j] = "M";
						aux++;
						break;
					} else {
						pessoas[i][j] = "F";
						aux++;
						break;
					}
				case 3:
					System.out.print("Opcões (1-Calma / 2-Nervosa / 3-Agressiva) ");
					op = entrada.nextInt();
					if(op==1) {
						pessoas[i][j] = "C";
						aux++;
						break;
					} else if(op==2) {
						pessoas[i][j] = "N";
						aux++;
						break;
					} else {
						pessoas[i][j] = "A";
						aux++;
						break;
					}					
				}
			}
		}
		
		for(int i = 0; i < Qtdpessoas; i++) {
			if(pessoas[i][2] == "C") {
				q1++;
			}
			
			if(pessoas[i][1] == "F" && pessoas[i][2] == "N") {
				q2++;
			}
			
			if(pessoas[i][1] == "M" && pessoas[i][2] == "A") {
				q3++;
			}
			
			if(Integer.parseInt(pessoas[i][0]) > 40 && pessoas[i][2] == "N") {
				q4++;
			}
			
			if(Integer.parseInt(pessoas[i][0]) < 18 && pessoas[i][2] == "C") {
				q5++;
			}
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Pessoas Calmas: " + q1);
		System.out.println("Mulheres Nervosas: " + q2);
		System.out.println("Homens Agressivos: " + q3);
		System.out.println("Pessoas Nervosas com mais de 40 anos: " + q4);
		System.out.println("Pessoas Calmas com menos de 18 anos: " + q5);
		
		System.out.println("--------------------------------------");
		System.out.println("Encerrando sistema ....");
		
	}
}
