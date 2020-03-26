package Herança;

public class ClassHerancaProfessor extends ClassHerancaPessoa{
	private String matri;
	
	
	public ClassHerancaProfessor(String nome, int ano_nascimento, String matri) {
		super (nome, ano_nascimento);
		this.matri = matri;
	}
	
	public String getMatri() {
		return this.matri;
	}
	
	public void setMatri(String matri) {
		this.matri = matri;
		
		
	}
	
	public String getNome() {
		return "Professor: " + super.getNome();
	}
	
	public String toString() {
		return super.toString() + "\nMatrícula: " + this.matri;
	}

	@Override
	public void outra_menssagem(String mensagem) {
		// TODO Auto-generated method stub
		
	}

}
