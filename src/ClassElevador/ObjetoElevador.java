package ClassElevador;
import java.util.Scanner;

public class ObjetoElevador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalAndares, qtdPessoas[], andar;
		float pesoPessoa, capaciElevador;
		int botao;
		
		Scanner dados = new Scanner(System.in);	
		
		while (1 > 0) {
			
			ClassElevador obj01  = new ClassElevador(10, 500f);
		//System.out.println("Iniciar");
		//System.out.println("Informe a capacidade do elevador: ");
		//capaciElevador = dados.nextFloat();
		//System.out.println("Informe o total de andares: ");
		//totalAndares = dados.nextInt();				
		//obj01.inicializa(capaciElevador, totalAndares);
		//System.out.println();			
			
			do{  
				System.out.println("Elevador com capacidade m�xima de 500Kg ou at� 7 pessoas");
				System.out.println("Aperte o bot�o de entrada ou sa�da");
				System.out.println("( 1 ) Entrar ( 2 ) para Sair");
				botao = dados.nextInt();
				
				switch(botao) {
					case 1:
					System.out.println("Entra");
					System.out.println("Informe o andar da pessoa");
					andar = dados.nextInt();
					System.out.println("Informe o peso da pessoa: ");
					pesoPessoa = dados.nextFloat();
					obj01.entra(pesoPessoa, andar);
					System.out.println();
					break;
					
					case 2:
					System.out.println("Sair");
					System.out.println("Informe o andar da pessoa que deseja sair: ");
					andar = dados.nextInt();
					System.out.println("Informe o peso da pessoa que est� saindo: ");
					pesoPessoa = dados.nextFloat();
					obj01.sai(pesoPessoa, andar);
					break;
				
				}
		
			}while(obj01.getI() != 0 );	
			
			obj01.desliga();
			
			
		
		}
			
	}

}
