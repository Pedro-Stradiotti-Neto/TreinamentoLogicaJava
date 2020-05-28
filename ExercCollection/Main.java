package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int type;
		String tel;
		char ans;
		Scanner entrada = new Scanner(System.in);
		List<Telefone> telefones = new ArrayList<Telefone>();

		do {
		Telefone nrTel = new Telefone();
		System.out.println("(0 - Residencial | 1 - Comercial | 2 - Celular)");
		System.out.print("Qual o tipo do telefone? - ");
		type = entrada.nextInt();
		System.out.print("Qual o numero? - ");
		tel = entrada.next();
		System.out.println();
		nrTel.cadastrar(tel, type);
		
		telefones.add(nrTel);
		
		System.out.print("Deseja adicionar outro numero? (s/n) - ");
		ans = entrada.next().charAt(0);
		} while(ans != 'n');
		
		System.out.println("\n ---- Lista de Telefones ----");
		for(Telefone t : telefones) {
			t.show();
		}
		
	}

}
