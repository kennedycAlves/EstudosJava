package Herança;

public class ObjClassHerancaProfessor {

	public static void main(String[] args) {
		String nome, matri;
		int ano_nascimento;
		
		ClassHerancaProfessor obj = new ClassHerancaProfessor("Mario", 1976, "PR12471");
		
		System.out.println(obj.getNome());
		System.out.println(obj.getMatri());
		System.out.println(obj.getAno_nacimento());
		
	}

}
