package Array;

public class Exer01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetorA[] = {1, 0, 5, -2, -5, 7};
		
		int soma = vetorA[0] + vetorA[1] + vetorA[5];
		
		vetorA[4] = 100;
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
			
		}
		
		System.out.println("A soma entre os valores das posi��es do VetorA 0, 1 e 5 � igual a: " + soma);
		if(soma == 8) {
			System.out.println("Valor correto!");
			
		}else {
			System.out.println("valor Incorreto");
		}
	}

}
