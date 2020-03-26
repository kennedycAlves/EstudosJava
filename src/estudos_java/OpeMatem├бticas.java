package estudos_java;

public class OpeMatemáticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//soma
		float res2;
		int num1 = 20, num2 = 3, res;
		res = num1 + num2;
		System.out.println("A Soma de " + num1  + " + " + num2 +  " é: " + res);
		
		// Subtração
		res = num1 - num2;
		System.out.println("A Subtração de " + num1  + " - " + num2 +  " é: " + res);
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A sMultiplicação de " + num1  + " * " + num2 +  " é: " + res);
		
		
		//Divisão
		res = num1 / num2;
		System.out.println("A Divisão de " + num1  + " / " + num2 +  " é: " + res);
	
		//Divisão (Real)
		res2 = (float)num1 / (float)num2;
		System.out.println("A Divisão de Real " + num1  + " / " + num2 +  " é: " + res2);
			
	
		//Módulo
		res = num1 % 2;
		System.out.println("A Divisão de " + num1  + " / " + num2 +  " é: " + res);
		if (res == 0) {
			System.out.println("É par");
			
		}else
			System.out.println("É impar");
	}

}
