package ComposicaoPedido;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import ComposicaoPedido.Order;


public class FrontEndProgOrder {

	public static void main(String[] args) throws ParseException {
		Scanner dados = new Scanner(System.in);	
		
		SimpleDateFormat t2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do cliente: ");
		System.out.println("Nome: ");
		String nome = dados.nextLine();
		System.out.println("Email: ");
		String email = dados.nextLine();
		System.out.println("Data de nascimento: ");
		Date data = t2.parse(dados.next());
		System.out.println();
		System.out.println("----------Status do pedido--------");
//		System.out.println("Status: ");
//		String status = dados.nextLine();
		
		
		
		Client cl = new Client(nome, email, data);
		
		Date d1 = new Date();
		
		Order or = new Order(d1, cl);
		
		
		
		System.out.printf("Informe a quantidade de pedidos");
		int qtd = dados.nextInt();
		
		for(int i = 1; i <= qtd ; i++) {
			System.out.println("Informe o nome do produto " + i+":");
			String nomeProd =  dados.nextLine();
			System.out.println("Preço: ");
			Double precoProd = dados.nextDouble();
			System.out.println("Informe q quantidade do produto: ");
			int qtdProd = dados.nextInt();
			
			OrderItem produto = new OrderItem (qtdProd, new Product(nomeProd), precoProd);
			
			Order.addItem(produto);
		
		}
		
		System.out.println("ORDER SUMMARY");
		System.out.println("Order momment: " + or.getMoment());
		System.out.println("Order Status: " + or.getStatus());
		System.out.println("Client: " + cl.getNome() + " " + cl.getEmail() +  cl.getBirthDate());
		System.out.println("Orders Itens");
		or.listaProd();
		System.out.println("Total Price: " + or.total());
	}

}
