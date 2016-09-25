package overload;

public class Calculations {
	
	public Integer sum(int num1, int num2){
		Integer sum;
		sum = num1 + num2;
		return sum;
		
	}
	
	public Integer sum(int num1, int num2, int num3){
		Integer sum;
		sum = num1 + num2 + num3;
		return sum;
		
	}
	
	public Double multiply(Double num1, Double num2){
		Double result;
		result = num1 * num2;
		return result;
		
	}
	
	public Integer multiply(int num1, int num2){
		Integer result;
		result = num1 * num2;
		return result;
		
	}
	
}

