package estudos_java;
//Classe Pessoa
public class Pessoa {
	//Atributos
	String nome, email;
	int ano_nascimento;
	
	
	//Contrutor Vazio(Caso n�o seja criado a JVM cria em tempo de execu��o)
	//Utilizando esse tipo de contrutor, devemos passar os par�mentros nos objetos
	public Pessoa() {}
	
	//Contrutor com par�metros
	//Pode se passar os valores dos par�metros diretamento no contructor do objeto
	
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		
	}
	//M�todo
	void imprime_informa��es() {
		System.out.println("=====Classe Pessoa/Usando contrutor com par�metros=====");
		System.out.println("Objeto: pessoa02");
		System.out.println("atibuto nome: " + this.nome);
		System.out.println("Atributo email: " + this.email);
		System.out.println("Atributo ano do nascimento: " + this.ano_nascimento);
		
		
		
		
	}
	
	

}
