package execution;

import overload.Calculations;

public class ExecutionCalculations {
	
	public static void main(String[] args) {
		
		Calculations calc = new Calculations();
		System.out.println("Sum: "+calc.sum(140, 60)+100); //concatenate 
		System.out.println("Sum: "+(calc.sum(140, 60)+100));
		System.out.println("Sum: "+calc.sum(14, 756, 239));
		System.out.println("Multiply: "+calc.multiply(140, 7));
		System.out.println("Multiply: "+calc.multiply(1.4, 7.8));
	}
}
