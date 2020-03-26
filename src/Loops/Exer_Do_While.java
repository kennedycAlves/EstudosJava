package Loops;

import java.util.Scanner;

public class Exer_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		String nome;
		
		//Para receber dados do teclado
		Scanner dados = new Scanner(System.in);
		
		
		//Faz a checagem depois de executar o bloco
		do{
		
			System.out.println("Informe o nome: ");
		//next ou nextLine recebe dados fo tipo instring, ma spara usar nome duplos deve mos usar o nextLine
		//por Ex: Pedro Henrique
		nome = dados.nextLine();
		
			System.out.println("Informe a idade: ");
		//No Java existe um bug ao se tententar receber valores int e string consecutivos
		//Para resolver devemos receber o nado int como string e depois converter
		//com Interger.parseInt
			idade = Integer.parseInt(dados.nextLine());
			
			if(idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
			
		}while(idade > 0);
		dados.close();

	}

}
