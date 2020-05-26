package ExTreino;

import java.util.Scanner;

public class Exc11 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int linha = 5, coluna = 5;
		int[][] M = new int[linha][coluna];
		int[] SL = new int[linha], SC = new int[coluna];
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.printf("Digite o valor da matriz M[%d][%d]: ", i+1, j+1);
				M[i][j] = entrada.nextInt();
			}
		}
		
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				SL[i] += M[i][j];
				SC[i] += M[j][i];
			}
		}
		
		System.out.println("-------------");
		System.out.println("Matriz Base: ");
		for(int i = 0; i < linha; i++) {
			for(int j = 0; j < coluna; j++) {
				System.out.print("|");
				System.out.printf("\t %d \t", M[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}

		System.out.println("-------------");
		System.out.println("Vetor SL: ");
		for(int i = 0; i < linha; i++) {
			System.out.print("|");
			System.out.printf("\t %d \t", SL[i]);
		}
		System.out.println("|");
		
		System.out.println("-------------");
		System.out.println("Vetor SC: ");
		for(int i = 0; i < linha; i++) {
			System.out.print("|");
			System.out.printf("\t %d \t", SC[i]);
		}
		System.out.println("|");
	}
}
