package Array;

import java.util.Scanner;
import java.util.Scanner;

public class Aluguel {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int n = 10, n2;
		String nome, email;
		PessoaArray[] vetor = new PessoaArray[n];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("Informe o quarto desejado: ");
			n2 = Integer.parseInt(dados.nextLine());
			
			System.out.println("Informe o nome do inquilino: ");
			nome = dados.nextLine();
			
			System.out.println("Informe o Email do inquilino: ");
			email = dados.nextLine();
			
			i = n2;
						
			vetor[n2] = new PessoaArray(nome, email);
			
				
			
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println("Inquilino do " + i + " andar: " + vetor[i].getNome() + " " + vetor[i].getEmail());
			}
		}

	}

}
