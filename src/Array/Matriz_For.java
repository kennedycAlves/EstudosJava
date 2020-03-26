package Array;
import java.util.Scanner;
public class Matriz_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dadosL = new Scanner(System.in);
		Scanner dadosC = new Scanner(System.in);
		Scanner dadosM = new Scanner(System.in);
				
		int l = 0;
		int c = 0;
		
		System.out.println("Informe o N�mero de Linhas: ");
		l = dadosL.nextInt();
		
		System.out.println("Informe o Numero de Colunas: ");
		c = dadosC.nextInt();
		
		int matriz[][] = new int [l][c];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				System.out.println("Informe o valor: ");
				matriz[i][j] = dadosM.nextInt();
				
				
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
			System.out.println("Matriz [ " + i + " ][ " + j + " ] = " + matriz[i][j]);	
				
				
			}
		}	
			

	}

}
