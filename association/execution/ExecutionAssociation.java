package execution;

import entity.Driver;

import java.util.ArrayList;
import java.util.List;

import entity.Car;
import entity.Client;
import entity.Property;

public class ExecutionAssociation {
	public static void main(String[] args) {
		
		Driver d1 = new Driver("Leo","123456-7");
		Car    c1 = new Car("BMW",2016,"LDI2357",d1);
		
		System.out.println("------- Unidirectional Relationships -------");
		System.out.println("Car: "+c1.model);
		System.out.println("Registration plate: "+c1.reg_plate);
		System.out.println("Year: "+c1.model);
		System.out.println("Driver: "+c1.driver.name);
		System.out.println("License: "+c1.driver.driver_license);
		
// 
		Client cli1 = new Client(101,"Lucy","123.123.123.00");
		Property p1 = new Property("Apartment", 140.,250000.);
		Property p2 = new Property("House", 220.,450000.);
		
		List<Property> listProperties = new ArrayList<Property>();
		listProperties.add(p1);
		listProperties.add(p2);
		
		cli1.setProperty(listProperties); // association 1,N
		
		System.out.println("------- Many to one bidirectional Relationships -------");
		System.out.println("Owner: "+cli1.getName());
		
		for (int i=0; i<cli1.getProperty().size();i++){
			System.out.println("Property: "+cli1.getProperty().get(i).getType());
			System.out.println("Area    : "+cli1.getProperty().get(i).getArea()+" m²");
			System.out.println("Price   : "+cli1.getProperty().get(i).getPrice());
			System.out.println();
		}
		
		
		
		
		
	}
}
