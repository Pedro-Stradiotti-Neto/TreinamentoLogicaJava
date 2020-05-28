package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class MinhasCollections {
    public static void main(String[] args) {
    	// Inicializa um array de inteiros, do tipo List/ArrayList
        List<Integer> minhaLista = new ArrayList<Integer>();
        // Adiciona numeros junto a lista "minhaLista"
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(2);
 
        // Faz um for-Each, mostrando no console os dados adicionados no array
        for (Integer listaElementos : minhaLista) {
            System.out.println(listaElementos);
        }

    	// Inicializa um array de inteiros, do tipo Set/HashSet
        Set<Integer> meuSet = new HashSet<Integer>();
        // Adiciona numeros junto a lista "meuSet"
        meuSet.add(1);
        meuSet.add(2);
        meuSet.add(3);
        meuSet.add(1); // Devido a esse numero já ter sido adicionado, o mesmo não é adicionado 
                       // novamente, devido a inicializacão do array pelo Set, o qual não permite 
                       // a introducão de numeros duplicados
        
        // Utiliza do Iterator para pegar toda a lista presente na lista "meuSet"
        Iterator<Integer> iMeuSet = meuSet.iterator();
        // Com a "nova lista" presente no iterator, ele percorre essa lista com o método ".hasNext" o qual
        // retorna true, enquanto houver elementos na lista, e consequentemente false quando não mais houver
        while(iMeuSet.hasNext()){
            System.out.println(iMeuSet.next());
        }
    }
}