package Herança;
//classe com herança da classe ClassHerancaPessoa herdando o atributos nome e ano_nascimento
public class ClassHerancaAluno extends ClassHerancaPessoa{
	private String ra;
	
    public ClassHerancaAluno(String nome, int ano_nascimento, String ra) {
    	//super puchar os atributos desejados da super classe ClassHerancaPessoa
    	super(nome, ano_nascimento);
    	this.ra = ra;
    	
    }
    
    public String getRa() {
    	return this.ra;
    }
	
    public void setRa(String ra) {
    	this.ra = ra;
    }
    
    public String toString() {
    	return super.toString() + "\nRA: " + this.ra;
    }
    
    public String getNome() {
    	return "Aluno: " + super.getNome();
    }

	@Override
	public void outra_menssagem(String mensagem) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
