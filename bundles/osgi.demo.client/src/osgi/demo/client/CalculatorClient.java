package osgi.demo.client;

import osgi.demo.calculator.CalculatorService;

public class CalculatorClient {
	
	private final CalculatorService calculator;
	
	public CalculatorClient(CalculatorService calculator) {
		this.calculator = calculator;
	}
	
	public void performArithmetic() {
        double sum = calculator.add(5.0, 3.2);
        double product = calculator.multiply(10.0, 0.5);

        System.out.println("5.0 + 3.2 = " + sum);
        System.out.println("10.0 * 0.5 = " + product);
	}
	
}
