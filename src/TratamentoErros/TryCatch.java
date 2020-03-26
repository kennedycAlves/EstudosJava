package TratamentoErros;
import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = dados.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = dados.nextInt();
		
		try {
			System.out.println(num1 + " / "  + num2 + " é: " + (num1 / num2));
		}catch(ArithmeticException e) {
			System.out.println("Não é possivel dividir " + num1 + " por " + num2);
		}
		
		
	}

}
