package Collection;
import java.util.Random;

import javax.activation.MailcapCommandMap;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Collections;



public class fazerstring {
	
	
	public StringBuilder gerarSenha() {
		StringBuilder str = new StringBuilder();
		List<String> letra = new ArrayList();
		List<Integer> numero = new ArrayList();
		 letra.add("a");
		 letra.add("b");
		 letra.add("c");
		 letra.add("d");
		 letra.add("e");
		 letra.add("f");
		 letra.add("g");
		 letra.add("h");
		 letra.add("i");
		 letra.add("j");
		 letra.add("k");
		 letra.add("l");
		 letra.add("m");
		 letra.add("n");
		 letra.add("o");
		 letra.add("p");
		 letra.add("q");
		 letra.add("r");
		 letra.add("s");
		 letra.add("t");
		 letra.add("u");
		 letra.add("v");
		 letra.add("x");
		 letra.add("w");
		 letra.add("y");
		 letra.add("z");
		 Collections.shuffle(letra);
		 for(int num = 0 ; num <= 9; num++) {
			 numero.add(num);
		 }
		 Collections.shuffle(numero);
		 
		 
		 for(int i = 0; i < 4 ;i++) {
			 str.append(letra.get(i)+numero.get(i));
			 Collections.shuffle(numero);
			 Collections.shuffle(letra);
		 }
		 
		 return str;
	}
		 
		 public StringBuilder gerarSenha(int tamanho) {
				StringBuilder str = new StringBuilder();
				List<String> letraUpper = new ArrayList();
				List<String> listaAll = new ArrayList();
				List<String> letra = new ArrayList();
				List<String> numero = new ArrayList();
				 letra.add("a");
				 letra.add("b");
				 letra.add("c");
				 letra.add("d");
				 letra.add("e");
				 letra.add("f");
				 letra.add("g");
				 letra.add("h");
				 letra.add("i");
				 letra.add("j");
				 letra.add("k");
				 letra.add("l");
				 letra.add("m");
				 letra.add("n");
				 letra.add("o");
				 letra.add("p");
				 letra.add("q");
				 letra.add("r");
				 letra.add("s");
				 letra.add("t");
				 letra.add("u");
				 letra.add("v");
				 letra.add("x");
				 letra.add("w");
				 letra.add("y");
				 letra.add("z");
				 numero.add("1");
				 numero.add("2");
				 numero.add("3");
				 numero.add("4");
				 numero.add("5");
				 numero.add("6");
				 numero.add("7");
				 numero.add("8");
				 numero.add("8");
				 
				 Collections.shuffle(letra);
				 
				 Collections.shuffle(numero);
				 
				 letraUpper = letra;
				 letraUpper.replaceAll(String::toUpperCase);			 
				 listaAll.addAll(letraUpper);
				 listaAll.addAll(numero);
				 Collections.shuffle(listaAll);
				 
				 
				 for(int i = 0; i < (tamanho + 1) ;i++) {
					 str.append(listaAll.get(i));
					 Collections.shuffle(listaAll);
					 
				 }
				 
				 return str;
		 
		 }
		 
		 
		 public StringBuilder gerarSenha(int tamanho, boolean mauiscula) {
				StringBuilder str = new StringBuilder();
				StringBuilder str2 = new StringBuilder();
				List<String> letraUpper = new ArrayList();
				List<String> listaComLetraUpper = new ArrayList();
				List<String> listaAll = new ArrayList();
				List<String> letra = new ArrayList();
				List<String> numero = new ArrayList();
				 letra.add("a");
				 letra.add("b");
				 letra.add("c");
				 letra.add("d");
				 letra.add("e");
				 letra.add("f");
				 letra.add("g");
				 letra.add("h");
				 letra.add("i");
				 letra.add("j");
				 letra.add("k");
				 letra.add("l");
				 letra.add("m");
				 letra.add("n");
				 letra.add("o");
				 letra.add("p");
				 letra.add("q");
				 letra.add("r");
				 letra.add("s");
				 letra.add("t");
				 letra.add("u");
				 letra.add("v");
				 letra.add("x");
				 letra.add("w");
				 letra.add("y");
				 letra.add("z");
				 numero.add("1");
				 numero.add("2");
				 numero.add("3");
				 numero.add("4");
				 numero.add("5");
				 numero.add("6");
				 numero.add("7");
				 numero.add("8");
				 numero.add("8");
				 
				 Collections.shuffle(letra);
				 Collections.shuffle(numero);
				 
				 listaAll.addAll(letra);				 
				 listaAll.addAll(numero);
				 Collections.shuffle(listaAll);
				 
				 
				
				 
				 for(String j : letra) {
					 letraUpper.add(j.toUpperCase());
										
				 }
				 
				 listaComLetraUpper.addAll(listaAll);
				 listaComLetraUpper.addAll(letraUpper);
				 Collections.shuffle(listaComLetraUpper);
				 
				 if(mauiscula == false) {
					
					 for(int i = 0; i < (tamanho + 1) ;i++) {
						 str.append(listaAll.get(i));
						 Collections.shuffle(listaAll);
						 
					 }
					 return str;
				 }
				 
				 else {
					 
					
					for(int i = 0; i < (tamanho + 1) ;i++) {
						 str2.append(listaComLetraUpper.get(i));
						 Collections.shuffle(listaComLetraUpper);
					} 
					return str2;
					
				 }
					 
				 
		 
		 	
	}
		 

}
