package estudos_java;

public class Objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Declaração e instanciação/inicialização do objet
	//Atrelando o obejeto a classe Produto
	Produto objeto1 = new Produto();
	
	//Atrelando as caractériscas do objeto aos atributos da classe Produtos
	//Usando contrutor Vazio
	objeto1.nome = "Notebook";
	objeto1.preco = 2.532f;
	objeto1.desconto = 15.0f;
	
	System.out.println("========Classe Produtos=======");
	System.out.println("Objeto: objeto1");
	System.out.println("atributo nome: " + objeto1.nome);
	System.out.println("atributo preço: " + objeto1.preco);
	System.out.println("atributo desconto: " + objeto1.desconto);
	System.out.println();
	
	Pessoa pessoa01 = new Pessoa();
	pessoa01.nome = "João fafifo";
	pessoa01.email = "fafifo@mail.com";
	pessoa01.ano_nascimento = 1995;
	
	System.out.println("=====Classe Pessoa=====");
	System.out.println("Objeto: pessoa01");
	System.out.println("atibuto nome: " + pessoa01.nome);
	System.out.println("Atributo email: " + pessoa01.email);
	System.out.println("Atributo ano do nascimento: " + pessoa01.ano_nascimento);
	System.out.println();
	
	//Usando contrutor com parâmetros
	Pessoa pessoa02 = new Pessoa("Marcos", "marcos@mail.com", 1950);
	pessoa02.imprime_informações();
	}

}
