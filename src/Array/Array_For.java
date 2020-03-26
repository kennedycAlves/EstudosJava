package Array;

import java.util.Scanner;

public class Array_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para receber dados do teclado
		Scanner dados = new Scanner(System.in);
		Scanner dados2 = new Scanner(System.in);
		int cont = 0;
		int salto;
		System.out.println("Informe o valor de contagem: ");
		cont = dados.nextInt();
		
		System.out.println("Informe o salto: ");
		salto = dados2.nextInt(); 
		
		int vetor10[] = new int [cont];
			
		for(int i = 1; i < vetor10.length; i++) {
			vetor10[i] = i * salto;
			System.out.println(vetor10[i]);
					
		}
		
	}

}
