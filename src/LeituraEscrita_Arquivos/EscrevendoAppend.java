package LeituraEscrita_Arquivos;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class EscrevendoAppend{

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		try {
			PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
			
			for(int i  = 0; i <= 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = dados.nextLine();
				escrever.println(msg);
				
			}escrever.close();
		
		}catch (FileNotFoundException e) {
			System.out.println("Não foi possível criar o arquivo");
		}
		dados.close();

	}

}
