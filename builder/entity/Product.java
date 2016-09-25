package entity;

public class Product {
	public String name;
	public String maker;
	public Integer quantity;
	public Double price;
	
	public Product() {
		this.quantity = 0;
		this.price = 0.;
	}
	public Product( String name, String maker) {
		this.name = name;
		this.maker = maker;
		this.quantity = 0;
		this.price = 0.;
	}
		
	public Double applyDiscount(double discount){
		Double result;
		result = this.price - (this.price * (discount/100));
		return result;
	}
	
}
