package Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class Lista {

	public static void main(String[] args) {
		
		List<String> nome = new ArrayList();
		
		// Adicionando elementos a lista
		nome.add("maria");
		nome.add("Leila");
		nome.add("Marcia");
		nome.add("Leonardo");
		nome.add("Amanda");
		
		Collections.sort(nome);	
		//Verificando se determinado elemento existe
		if(nome.contains("Leila")) {
			System.out.println("achou");
			System.out.println("Na posição: " + nome.indexOf("Leila"));
			System.out.println(nome.));
				
			}
			else {
				System.out.println("não achou");
			}
			
		//Verificando posição de um elemento na lista
		System.out.println(nome.indexOf("maria"));
			
		//Verificando tamanho da lista
		System.out.println(nome.size());
		
		//Removendo elemetos que podem possuir determinadas caracteristicas
		//Todos os elemetos que começarem com a letra A serão excluídos
		nome.removeIf(x -> x.charAt(0) == 'A');
		
		for(String nomes : nome) {
			System.out.println(nomes);
		}
		
		
		//Criando uma nova lista com filtro na lista antiga
		
		//Criando a nova lista   //recebendo a antiga lista com filtro 		   //Reconvertendo para lista
		List<String> filtro =    nome.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for(String nomes : filtro) {
			System.out.println(nomes);
		}
		
		//Buscar o primeiro elemento de uma lista que atenda aos requisitos desejados
		
		String busca = nome.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(busca);
		
	}

}
