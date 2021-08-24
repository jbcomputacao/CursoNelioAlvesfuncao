package entities;

public class Product {
//atributo do Objeto
	private String name;
	private double price;
	private int quantity;
	
	
	//parametro do objeto
	public Product(String name, double price, int quantity)
	{		
		this.name =name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void setName(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void addProducts(int quantity) {
	this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
	this.quantity -= quantity;
	}
	public String toString() {
	return name
	+ ", $ "
	+ String.format("%.2f", price)
	+ ", "
	+ quantity
	+ " units, Total: $ "
	;

}
}
