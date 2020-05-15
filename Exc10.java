package ExTreino;

import java.util.Scanner;

public class Exc10 {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		// Declarando numero de Linhas e Colunas das Matrizes
		int line = 4, column = 6;
		Double[][] N1 = new Double[line][column], N2 = new Double[line][column];
		Double[][] M1 = new Double[line][column], M2 = new Double[line][column];
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < column; j++) {
				System.out.printf("Insira o elemento M[%d][%d] (Matriz N1): ", i+1, j+1);
				N1[i][j] = entrada.nextDouble();
			}
		}
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < column; j++) {
				System.out.printf("Insira o elemento M[%d][%d] (Matriz N2): ", i+1, j+1);
				N2[i][j] = entrada.nextDouble();
			}
		}
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < column; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		
		System.out.println("\nA Matriz M1 ficou: \n");
		for(int linha = 0; linha<line; linha++) {
			for(int colunas = 0; colunas <column; colunas++) {
				System.out.print("|");
				System.out.printf("\t %.2f \t", M1[linha][colunas]);
			}
			System.out.print("|");
			System.out.println();
		}
		
		System.out.println("\nA Matriz M2 ficou: \n");
		for(int linha = 0; linha<line; linha++) {
			for(int colunas = 0; colunas <column; colunas++) {
				System.out.print("|");
				System.out.printf("\t %.2f \t", M2[linha][colunas]);
			}
			System.out.print("|");
			System.out.println();
		}
	}
}