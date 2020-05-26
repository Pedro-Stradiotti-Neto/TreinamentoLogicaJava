package ExTreino;

import java.util.Scanner;

public class Exc09 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int numAlunos = 60;
		int mat, aux = 0;
		int[] salaX = new int[numAlunos], salaY = new int[numAlunos], comp = new int[numAlunos];
		
		for(int i=0; i < numAlunos; i++) {
			System.out.print("Digite o numero da matricula (Sala X): ");
			mat = entrada.nextInt();
			if(mat < 0 || mat > 999) {
				System.out.println("Numero de matrícula inválido!");
				i--;
			} else {
				salaX[i] = mat;
			}
		}
		
		for(int i=0; i < numAlunos; i++) {
			System.out.print("Digite o numero da matricula (Sala Y): ");
			mat = entrada.nextInt();
			if(mat < 0 || mat > 999) {
				System.out.println("Numero de matrícula inválido!");
				i--;
			} else {
				salaY[i] = mat;
			}
		}

		System.out.println("-------------------------------");
		System.out.println("Alunos cursando as disciplnas X e Y");
		
		for(int i = 0; i < numAlunos; i++) {
			for(int j = 0; j < numAlunos; j++) {
				if(salaX[i] == salaY[j]) {
					System.out.println("Matrícula: " + salaX[i]);
					aux++;
				}
			}
		}
		if(aux == 0) {
			System.out.println(" - Nenhum aluno cursa simultaneamente as disciplinas X e Y");
		}
	}
}
