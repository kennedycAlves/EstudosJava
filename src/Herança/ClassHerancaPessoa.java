package Herança;

//classe abtracts tornam impossível a instaciação de objets, geralmente utilizadas em classe genéricas, como é o casso da classe abaixo
//Pode tambem possuir assim métodos abstratos, não não necessitam de implementação, e devem ser declarados nas demais classes filhas.
public abstract class ClassHerancaPessoa {
	private String nome;
	private int ano_nascimento;
	
	public ClassHerancaPessoa(String nome, int ano_nascimento) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAno_nacimento() {
		return this.ano_nascimento;
	}
	
	public void setAno_nacimento(int ano_nacimento) {
		this.ano_nascimento = ano_nacimento;
	}
	
	public String toString() {
		return "Ano de nascimento: " + this.ano_nascimento;
	}
	
	//métodos abstrato
	public abstract void outra_menssagem(String mensagem);
	

}
