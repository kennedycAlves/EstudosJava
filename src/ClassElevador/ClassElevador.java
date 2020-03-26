package ClassElevador;
//Classe
public class ClassElevador {
	//Atributos
	private int andarAtual = 0, totalAndares;
	private static int qtdPessoas[] = new int[7], i = 0;
	private float capaciElevador = 0, pesoPessoa, pesoTotal;
	
	//Contruct
	public ClassElevador(int totalAndares, float capaciElevador) {
		this.totalAndares = totalAndares;
		this.capaciElevador = capaciElevador;
	}
	
	//Metodos
	void inicializa(float capaciElevador, int totalAndares ) {
		this.capaciElevador = capaciElevador;
		this.totalAndares = totalAndares;
		System.out.println(this.capaciElevador);
		System.out.println(this.totalAndares);
		;
	}
	
	 void entra(float pesoPessoa, int andar ) {
		
			if((this.pesoTotal + pesoPessoa) <= this.capaciElevador && (this.andarAtual + andar) <= this.totalAndares || (i + 1) <= ClassElevador.qtdPessoas.length){
				//for(int i = 0; i < ClassElevador.qtdPessoas.length; i++) {
				ClassElevador.qtdPessoas[i] = ClassElevador.qtdPessoas[i++];
				this.pesoTotal = this.pesoTotal + pesoPessoa;
				this.andarAtual = andar;		
				System.out.println(this.pesoTotal);
				System.out.println(this.andarAtual);
				
								
				System.out.println(i);
				
				
				//}	
			
		}else {
			System.out.println("Pesso superior a capacidade suportada ou andar n�o existente!");
			System.out.println("Peso Atual: " + this.pesoTotal + " Peso m�ximo permitido: " + this.capaciElevador);
			System.out.println("Andar Atual: " + this.andarAtual + " Total de andares do pr�dio: " + this.totalAndares);
			System.out.println("N�mero de pessoas permitidas: " + (ClassElevador.qtdPessoas.length));
			System.out.println("numeros de pesoas no elevador: " + (i + 1));
			}
		}
	
	
	
	void sai(float pesoPessoa, int andar) {
		this.andarAtual = 0;
		if((this.andarAtual + andar) <= this.totalAndares) {
			//for(int i = 7; i > 6; i--) {
			ClassElevador.qtdPessoas[i] = ClassElevador.qtdPessoas[i--];	
			this.pesoTotal = this.pesoTotal - pesoPessoa;
			this.andarAtual = andar;
			System.out.println(this.pesoTotal);
			System.out.println(this.andarAtual);
			System.out.println(i);
			//}	
		}else{
			System.out.println("Andar inexistente!");
			System.out.println("Andar Atual: " + this.andarAtual + " Total de andares do pr�dio: " + this.totalAndares);
		 }
		
	
	
	}
			
	
	void subir(int andar) {
		if(this.andarAtual + andar > this.totalAndares) {
			System.out.println("Andar inixitente");
		}else{
			this.andarAtual = this.andarAtual + andar;
		}
		
	}
	
	
	void desce(int andar) {
		if(this.andarAtual - andar >= 0 || this.andarAtual != 0) {
		this.andarAtual = this.andarAtual - andar;
		}else{
			System.out.println("Andar inexistente");
			
		}
	}
	
	void desliga(){
		if(ClassElevador.i == 0) {
			this.andarAtual = 0;
			this.pesoTotal = 0;
			System.out.println("Elevador retonando ao t�rrio");	
			
			
		}else {
			System.out.println("Ainda existem " + (ClassElevador.i + 1) + " pessoas no elevador");
		}
		
	}
	
	public int getI() {
		return ClassElevador.i;
	}
	
}
	


