package estudos_java;

public class OpeMatem�ticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//soma
		float res2;
		int num1 = 20, num2 = 3, res;
		res = num1 + num2;
		System.out.println("A Soma de " + num1  + " + " + num2 +  " �: " + res);
		
		// Subtra��o
		res = num1 - num2;
		System.out.println("A Subtra��o de " + num1  + " - " + num2 +  " �: " + res);
		
		//Multiplica��o
		res = num1 * num2;
		System.out.println("A sMultiplica��o de " + num1  + " * " + num2 +  " �: " + res);
		
		
		//Divis�o
		res = num1 / num2;
		System.out.println("A Divis�o de " + num1  + " / " + num2 +  " �: " + res);
	
		//Divis�o (Real)
		res2 = (float)num1 / (float)num2;
		System.out.println("A Divis�o de Real " + num1  + " / " + num2 +  " �: " + res2);
			
	
		//M�dulo
		res = num1 % 2;
		System.out.println("A Divis�o de " + num1  + " / " + num2 +  " �: " + res);
		if (res == 0) {
			System.out.println("� par");
			
		}else
			System.out.println("� impar");
	}

}
