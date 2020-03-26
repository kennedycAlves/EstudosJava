package ComposicaoPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
	private Date moment;
	private OrderStatus status;
	
	//Ligações
	private Client client;
	private static List<OrderItem> item = new ArrayList<>();
	
	
	public Order() {
		
	}

	public Order(Date moment, Client client) {
		this.moment = moment;
//		this.status = status;
		this.client = client;
	}







	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public static void addItem(OrderItem product) {
		item.add(product);
	}
	
	public void removeItem(OrderItem product) {
		item.add(product);
	}
	
	public Double total() {
		Double sum = 0.0;
		for(OrderItem i : item) {
			
			sum += i.subTotal();
			
		}
		
		return sum;
		
	}
	
	public void listaProd() {
		
		for(OrderItem i : item) {
			System.out.println("Produto: " + i.getNome());
			System.out.println("Valor unitário: " + i.getPrice());
			System.out.println("Quantidade: " + i.getQuantity());
			System.out.println("Valor total: " + i.getQuantity() * i.getPrice());
			
		}
		
		
		
	}

	
	
	
	
	
	
	
	

}
