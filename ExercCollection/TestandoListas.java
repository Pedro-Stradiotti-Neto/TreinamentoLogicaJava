package Collection;

	import java.util.List;
	import java.util.ArrayList;
	public class TestandoListas {
		
		public static void main(String[] args) {
			
			// Instancia as variaveis com Strings
			String aula1 = "Modelando a classe Aula";
			String aula2 = "Conhecendo mais de listas";
			String aula3 = "Trabalhando com Cursos e Sets";
			
			// Instancia o array "aulas", para receber os dados;
			ArrayList<String> aulas = new ArrayList<>();
			
			// Adiciona as variaveis (string) inicializadas, junto ao array
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);

			// Apresenta as Strings adicionadas na forma de vetor, em linha (o que não fica legal)
			System.out.println(aulas);
			// Apresenta o total de posicões preenchidos no array (dados inseridos nas linhas 18-20).
			System.out.println(aulas.size());

			// cuidado! <= faz sentido aqui?
			// Não faz sentido devido o vetor iniciar com o indice "0", assim a condicão limitaria 
			// a somente "<", ou deve trocar a condicão para "i <= aulas.size() - 1"
			// Com essa correcão, o erro para de ocorrer e os dados ficam sendo apresentados uma
			// em cada linha, cada um dos dados inseridos
			for (int i = 0; i <= aulas.size(); i++) {
				System.out.println("Aula: " + aulas.get(i));
			}
		}
	}
