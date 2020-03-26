package Banco;

import java.util.ArrayList;
import java.lang.Math;


public class ClassCliente extends ClassPessoaBanco{
	private String agencia;
	private int conta;
	private float saldo, limite;
	private ArrayList<ClassCliente> cliente = new ArrayList<ClassCliente>();
	private static int inter;
	private static float SALDOLIMITE;
	
	
	
	
	public ClassCliente(String nome, int cpf, String endereco, String agencia, int conta) {
		super(nome, cpf, endereco);
		this.agencia = agencia;
		this.conta = conta;
		
		
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public int getconta() {
		return this.conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = this.saldo + saldo;
	}
	
	public float getLimite() {
		return this.limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
		
	
	public void cadstrar(String nome, int cpf, String endereco) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.conta = this.conta + 1;
		this.agencia = "5830";
		
		ClassCliente cl1 = new ClassCliente(nome, cpf, endereco, this.agencia, this.conta);
		
		cliente.add(cl1);
		
	}
	
	
	public boolean acessar(String nome) {
		
		System.out.println(cliente.size());
		//ArrayList<Object> lista = new ArrayList<Object>();
		
		for(int i = 0; i < cliente.size(); i ++) {
			
			if(nome.equals(cliente.get(i).getNome())){
				inter = i;
				cliente.get(inter).setLimite(100f);
				SALDOLIMITE = cliente.get(inter).getLimite();
				
					
				
				return true;
				
			}
				
		}
		return false;
			
	}
	
	void sacar(float valor) {
		
		if(valor <= (cliente.get(inter).getSaldo() + cliente.get(inter).getLimite())) {
			
			
							
			if(cliente.get(inter).getSaldo() >= valor) {
				
				
				System.out.println("primeiro if");			
				cliente.get(inter).setSaldo(-valor);
				System.out.println("Saque realizado com sucesso");
			
			} else if(cliente.get(inter).getSaldo() < valor && cliente.get(inter).getLimite() >= valor || (cliente.get(inter).getSaldo() + cliente.get(inter).getLimite() >= valor)) {
				System.out.println("Segundo if");	
				float i;
				for(i = valor; i > cliente.get(inter).getSaldo(); i--) {
				}
				System.out.println("I vale: " + i);
				
				float var2 = valor - i;		
				System.out.println(var2);
				
				float var3 = cliente.get(inter).getLimite() - var2;
				System.out.println(var3);
				
				cliente.get(inter).setSaldo(-i);
				
				
				cliente.get(inter).setLimite(var3);
				
				
			}
			
	
			
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	 public  void  depositar(float valor) {
		 System.out.println(inter);
		  		
		 if (cliente.get(inter).getLimite() == 0 && valor >= SALDOLIMITE) {
			 	
			 	float var = valor - SALDOLIMITE;
				cliente.get(inter).setLimite(SALDOLIMITE);
				cliente.get(inter).setSaldo(var);
				
			
		} else {
		 
			cliente.get(inter).setSaldo(+valor);
				
			}		

	}
	 
	 
	 public void VerSaldo() {
		 System.out.println("Saldo: " + cliente.get(inter).getSaldo());
		 System.out.println("Limite: " + cliente.get(inter).getLimite());
		 
	 }
	 
			
}
		
		
	


