package Array;
import java.util.Scanner;
public class Exer03_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dados = new Scanner(System.in);	
		
		int numeros[] = new int [10];
		int maiorNumero = 0;
		int menorNumero = 0;
		int i = 0;
		for(i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + i + "� N�mero");
			numeros[i] = dados.nextInt();
					
		}	
		
		for(i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > maiorNumero ) {
				
				maiorNumero = numeros[i];
										
			}if(numeros[i] < menorNumero ) {
				
				menorNumero = numeros[i];
					
			}
		}	
		
		for(i = 0; i < numeros.length; i++) {
			System.out.println("Posi��o [" + i + "] Valor: " + numeros[i]);
		}
		
		System.out.println("O maior valor recebido foi: " + maiorNumero );
		System.out.println("O menor valor recebido foi: " + menorNumero );
	}

}

