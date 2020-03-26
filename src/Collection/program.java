package Collection;
import Collection.fazerstring;

public class program {

	public static void main(String[] args) {
	
		fazerstring teste = new fazerstring();
		
		System.out.println("gerarSenha(): " + teste.gerarSenha());
		
		System.out.println("gerarSenha(int tamanho): "+teste.gerarSenha(20));
		
		System.out.println("gerarSenha(int tamanho, boolean maiusculas=TRUE: "+teste.gerarSenha(20, true));
		
		System.out.println("gerarSenha(int tamanho, boolean maiusculas=FALSE: "+teste.gerarSenha(20, false));
		
		
		

	}

}
