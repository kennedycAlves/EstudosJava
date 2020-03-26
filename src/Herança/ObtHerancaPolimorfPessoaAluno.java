package Herança;

public class ObtHerancaPolimorfPessoaAluno {

	public static void main(String[] args) {
		ClassHerancaPessoa p1 = new ClassHerancaPessoa("Roberto", 1970);
		System.out.println(p1.getNome());
		System.out.println(p1);
		System.out.println("\n");
		
		ClassHerancaAluno a1 = new ClassHerancaAluno("Kennedy", 1993, "RA123456");
		System.out.println(a1.getNome());
		System.out.println(a1);
		System.out.println("\n");
		
		ClassHerancaProfessor pr1 = new ClassHerancaProfessor("Khezia", 1996, "PRMarlinda");
		System.out.println(pr1.getNome());
		System.out.println(pr1);
		

	}

}
