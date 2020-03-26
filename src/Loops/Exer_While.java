package Loops;
import java.util.Scanner;

public class Exer_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 1;
		String nome;
		
		//Para receber dados do teclado
		Scanner dados = new Scanner(System.in);
		
		
		//Sempre checa o valor antes de executar o bloco
		while(idade > 0){
		
			System.out.println("Informe o nome: ");
		//next ou nextLine recebe dados fo tipo instring, ma spara usar nome duplos deve mos usar o nextLine
		//por Ex: Pedro Henrique
		nome = dados.nextLine();
		
			System.out.println("Informe a idade: ");
		//No Java existe um bug ao se tententar receber valores int e string consecutivos
		//Para resolver devemos receber o nado int como string e depois converter
		//com Interger.parseInt
			idade = Integer.parseInt(dados.nextLine());
		
		}
		dados.close();
		
		
	}

}
