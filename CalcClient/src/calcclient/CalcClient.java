package calcclient;

import calcws.Calculator;
import calcws.CalculatorService;

public class CalcClient {

    
    public static void main(String[] args) {
        
        CalculatorService service = new CalculatorService();
        Calculator calc = service.getCalculatorPort(); // Port is the same as interface in Soap
        
      int result = calc.multiply(3, 4);
      System.out.println("Result: " + result);
    }
    
}
