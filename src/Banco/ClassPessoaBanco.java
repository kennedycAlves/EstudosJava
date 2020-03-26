package Banco;



public  class  ClassPessoaBanco {
	private String nome, endereco;
	private int cpf;
	
	
	//Contrutor
	public ClassPessoaBanco(String nome, int cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		

	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return this.nome + this.cpf + this.endereco;
		
	}
	
	
	
	
	
	
	
	
}	