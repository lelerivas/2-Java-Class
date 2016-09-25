package entity;

public class Car {
	public String model;
	public Integer year;
	public String reg_plate;
	public Driver driver;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, Integer year, String reg_plate, Driver driver) {
		super();
		this.model = model;
		this.year = year;
		this.reg_plate = reg_plate;
		this.driver = driver;
	}
	
}
