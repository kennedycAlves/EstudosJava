package Array;
import java.util.Scanner;
public class Exer2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dados = new Scanner(System.in);
		
		int vetor[] =  new int[6];
		
		for(int i = 0; i < vetor.length; i++) {
			 System.out.println("Informe o " + i + "� Valor");
			 vetor[i] = dados.nextInt();
			
		}
		int i = 0;
		while( i < 6) {
			
			System.out.println(vetor[i]);
			i = i + 1;
			
		}

	}

}
