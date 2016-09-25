package entity;

public class Property {
	private String type;
	private Double area;
	private Double price;
	
	public Property() {
		// TODO Auto-generated constructor stub
	}
	
	public Property(String type, Double area, Double price) {
		super();
		this.type = type;
		this.area = area;
		this.price = price;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
}
