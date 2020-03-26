package Herança;

public class ObjAlunoHeranca {

	public static void main(String[] args) {
		ClassHerancaAluno obt = new ClassHerancaAluno("Khezia", 1996, "RA112345");
		
		System.out.println(obt.getNome());
		System.out.println(obt.getAno_nacimento());
		System.out.println(obt.getRa());

	}

}
