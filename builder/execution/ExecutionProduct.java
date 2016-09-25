package execution;

import java.text.NumberFormat;

import entity.Product;

public class ExecutionProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product("Printer","Samsung");
		
		p1.name = "Camera";
		p1.maker="Sony";
		p1.quantity=3;
		p1.price=1150.;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		System.out.println("---------- Product One ------------");
		System.out.println("Name: "+p1.name);
		System.out.println("Maker: "+p1.maker);
		System.out.println("Quantity: "+p1.quantity);
		System.out.println("Price: "+p1.price);
		System.out.println("Price with discount: "+nf.format(p1.applyDiscount(7.5)));
		
		
		System.out.println("---------- Product Two ------------");
		System.out.println("Name: "+p2.name);
		System.out.println("Maker: "+p2.maker);
		System.out.println("Quantity: "+p2.quantity);
		System.out.println("Price: "+p2.price);
		System.out.println("Price with discount: "+nf.format(p2.applyDiscount(7.5)));
		
		
		
		
	}
}
