package estudos_java;

public class TiposDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inteiros");
		
		long num0;
		int num1;
		short num2;
		byte num3;
		char num4 = 'a'; // alfa num�rico - os valores devem estar entre aspas simples
		
		Long num10;
		Integer num11;
		Short num12;
		Byte num13;
		Character num14;
		
		System.out.println("long/Long Tamanho: " + Long.SIZE + " Valor m�ximo: " + Long.MAX_VALUE + " Valor m�nimo: " + Long.MIN_VALUE);
		System.out.println("int/Int Tamanho: " + Integer.SIZE + " Valor m�ximo: " + Integer.MAX_VALUE + " Valor m�nimo: " + Integer.MIN_VALUE);
		System.out.println("short/Short Tamanho: " + Short.SIZE + " Valor m�ximo: " + Short.MAX_VALUE + " Valor m�nimo: " + Short.MIN_VALUE);
		System.out.println("byte/Byte Tamanho: " + Byte.SIZE + " Valor m�ximo: " + Byte.MAX_VALUE + " Valor m�nimo: " + Byte.MIN_VALUE);
		System.out.println("char/Character Tamanho: " + Character.SIZE + " Valor m�ximo: " + Character.MAX_VALUE + " Valor m�nimo: " + Character.MIN_VALUE);
		
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("Reais");
		
		double num6;
		float num5 = 44.56f;
		
		Float num60;
		Double num50;
		
		System.out.println("double/Double Tamanho:" +  Double.SIZE + " Valor m�ximo: " + Double.MAX_VALUE + " Valor m�nimo: " + Double.MIN_VALUE);
		System.out.println("float/Float Tamanho:" +  Float.SIZE + " Valor m�ximo: " + Float.MAX_VALUE + " Valor m�nimo: " + Float.MIN_VALUE);
		
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		String nome;
		//System.out.println("double/Double Tamanho:" +  String.SIZE + " Valor m�ximo: " + String.MAX_VALUE + " Valor m�nimo: " + String.MIN_VALUE);
		
		
		boolean v = true;
		boolean f = false;
		
		if(v) {
			
			System.out.println("Verdadeiro");
		}else {
			System.out.println("� Falso");
		}
		
	}
	

}
