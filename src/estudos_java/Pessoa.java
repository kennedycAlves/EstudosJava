package estudos_java;
//Classe Pessoa
public class Pessoa {
	//Atributos
	String nome, email;
	int ano_nascimento;
	
	
	//Contrutor Vazio(Caso não seja criado a JVM cria em tempo de execução)
	//Utilizando esse tipo de contrutor, devemos passar os parâmentros nos objetos
	public Pessoa() {}
	
	//Contrutor com parâmetros
	//Pode se passar os valores dos parâmetros diretamento no contructor do objeto
	
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		
	}
	//Método
	void imprime_informações() {
		System.out.println("=====Classe Pessoa/Usando contrutor com parâmetros=====");
		System.out.println("Objeto: pessoa02");
		System.out.println("atibuto nome: " + this.nome);
		System.out.println("Atributo email: " + this.email);
		System.out.println("Atributo ano do nascimento: " + this.ano_nascimento);
		
		
		
		
	}
	
	

}
