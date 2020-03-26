package estudos_java;
import java.util.Scanner;
public class Funcao {
	static String frutas[];
	
	static Scanner dados = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd = 0;
				
		System.out.println("Informe a qunatidades de frutas a se cadastrar: ");
		qtd = Integer.parseInt(dados.nextLine());
						
		cadastrar_dados(qtd);
		mostrar_dados(qtd);
		
		dados.close();
	}
		
	static void cadastrar_dados(int quantidade){
		frutas = new String[quantidade];
			
			
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "º Fruta");
			frutas[i] = dados.nextLine();
				
		}
	}
	
	static void mostrar_dados(int quantidade) {
		
		int i = quantidade - 1;
		while(i >= 0){
			System.out.println(frutas[i]);
			i--;
		}
	}
}
		
	
		



