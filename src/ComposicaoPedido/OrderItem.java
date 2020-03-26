package ComposicaoPedido;

public class OrderItem {
	private int quantity;
	private Double price;
	
	
	private Product nome;
	

	public OrderItem() {
		
	}

	

	public OrderItem(int quantity, Product nome, Double price) {
		this.quantity = quantity;
		this.nome = nome;
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Product getNome() {
		return nome;
	}



	public void setNome(Product nome) {
		this.nome = nome;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Double subTotal() {
		return quantity * price;
	}
	
	
	
	
	
	
}
