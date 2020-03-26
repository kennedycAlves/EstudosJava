package Banco;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ObjetoClassPessoaBanco {

	
	public static void main(String[] args) {
		
		
		float saldo, limite, saque, deposito;
		int oper = 0, acesso, conta = 0, oper2;
		
		
		Scanner dados = new Scanner(System.in);	
		
		
		
			
		 
//		 ==TESTE==
		ClassCliente cl1 = new ClassCliente(null, 0, null, null, 0);
//		ClassCliente cl2 = new ClassCliente("costa", 123, "hckjshkjzxc");
//		ClassCliente cl3 = new ClassCliente("alves", 123, "hckjshkjzxc");
//		 
//		 clientes.add(cl1);
//		 clientes.add(cl2);
//		 clientes.add(cl3);
		 
//		 System.out.println(clientes.get(i));
		 
//		 for(int i = 0; i < clientes.size(); i++) {
//			 if (clientes.equals(clientes.get(i))) {
//				 
//		 
//		 }
		 
//		 for(Object navega: clientes) {
//		 
//		  boolean ans = clientes.contains("Kennedy"); clientes.contains(123); clientes.contains("hckjshkjzxc");
//			 
//			System.out.println(ans);
//		 }
//				 
//					 
//				
//		 
//		
//		  //for (ClassPessoaBanco cliente : clientes) {
//		 	for(int i = 0; i < clientes.size(); i++) {
//			  Object objeto = clientes.get(i);
//		        if (objeto == "Kennedy") {
//		           System.out.println("sucesso");
//		           System.out.println(clientes);
//		        }else {
//		        	System.out.println("Falhou");
//		        	 System.out.println(clientes);
//		        }
//		  
//	}
		 
		 //System.out.println(clientes.contains("Kennedy"));
//		 for(int i = 0; i < clientes.size(); i++) {
//			 
//			 System.out.println(clientes.get(i));
//			 
//			 if ("Kennedy") {
//				 System.out.println("Objeto encontrado");
//				 				 
//			 }else {
//				 System.out.println("Objeto não encontrado");
//			 }
//			 
//			 
		 //}
//		

		
		do {
			System.out.println("Bem vindo ao banco KCA");
			System.out.println("Informe a operação desejada");
			System.out.println("1 Para logar");
			System.out.println("2 para cadastrar");
			System.out.println("0 Para sair");
			oper = Integer.parseInt(dados.nextLine());
		
			switch (oper) {
				case 1:
					System.out.println("======Logar=====");
					System.out.println("Informe seu nome: ");
					String nomecli = dados.nextLine();
					cl1.acessar(nomecli);
					if(cl1.acessar(nomecli)) {
					System.out.println();
					
					do {
						System.out.println("Favor informar a operação de sejada");
						System.out.println("1 para depositar");
						System.out.println("2 para sacar ");
						System.out.println("3 para verificar o saldo disponíve");
						oper2 = Integer.parseInt(dados.nextLine());
					
					
						switch (oper2) {
								
							case 1:
								System.out.println("===Depositar===");
								System.out.println("Informe o valor do deposito");
								deposito =  Float.parseFloat(dados.nextLine());
								cl1.depositar(deposito);
								break;
							
							case 2:
								System.out.println("=====Sacar=====");
								System.out.println("Informe o valor do saque");
								saque =  Float.parseFloat(dados.nextLine());
								cl1.sacar(saque);			
								break;
								
							case 3:
								System.out.println("Verificar Limite");
								cl1.VerSaldo();
								System.out.println();
								break;
								
							case 0:
								oper = 0;
								System.out.println("Desconectando");
								break;
							
							default:
								System.out.println("Opção inválida!");
								break;	
						}
					}while(oper2 > 0);
			}	
				
					 	
			
				case 2:
					System.out.println("====Cadastrar====");
					
					System.out.println("Informe o cpf: ");
					int cpf = Integer.parseInt(dados.nextLine());
					
					System.out.println("Informe o Nome: ");
					String nome = dados.nextLine();
					
					System.out.println("Informe o endereço: ");
					String endereco = dados.nextLine();
					
					cl1.cadstrar(nome, cpf, endereco);
					
					break;
					
				case 0:
					oper = 0;
					System.out.println("Desconectando");
					break;
				
				default:
					System.out.println("Opção inválida!");
					break;
								
				
			}
			
		}while(oper > 0);
		

	
	}

	
}	