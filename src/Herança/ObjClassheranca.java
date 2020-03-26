package Herança;

public class ObjClassheranca {

	public static void main(String[] args) {
		String nome;
		int ano_nascimento;
		
		ClassHerancaPessoa obj = new ClassHerancaPessoa("kennedy", 1993);
		
		
		
		System.out.println(obj.getNome());
		System.out.println(obj.getAno_nacimento());
	}

}
