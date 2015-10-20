
public class CalculatorController {

	public static void main(String [] args) {
		float nOne, nTwo;
		
		Calculator calculatorController = new Calculator();
		
		
		
		
		
		nOne = Float.parseFloat(args[0]);
		nTwo = Float.parseFloat(args[1]);
		
		calculatorController.setNumOne(nOne);
		calculatorController.setNumTwo(nTwo);
		
		System.out.println("adding " + calculatorController.add());
		System.out.println("Dividing " + calculatorController.divide());
		System.out.println("Multiplying " + calculatorController.multiply());
		System.out.println("Subtracting " + calculatorController.subtract());
	}
}

