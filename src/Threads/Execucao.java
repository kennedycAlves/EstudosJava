package Threads;
import Banco.ClassPessoaBanco;
import Banco.Operacoes;

import java.io.ObjectInputStream.GetField;

import Banco.ClassCliente;


public class Execucao {

	public static void main(String[] args) throws InterruptedException {
		ClassPessoaBanco oper = new ClassPessoaBanco("kennedy", 1234, "jhdjhdjfsd");
		Operacoes conta = new Operacoes(100f, 200f);
		
				
				
		
		while(1 > 0) {
		
		Thread t1 = new Thread(conta);
		
		Thread t2 = new Thread(conta);
		
		Thread t3 = new Thread(conta);
		
		Thread t4 = new Thread(conta);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println(conta.getSaldo());
		
		
		
		}
	}

}
