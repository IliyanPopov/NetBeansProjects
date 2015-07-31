package logic;

public class Calculator {
    
    public double calculate (double value1Numbr, double value2Numbr, String sign){
        System.out.println(sign);
          if (sign == "+") {
                return value1Numbr + value2Numbr;
                
            } else if (sign == "-") {
                return  value1Numbr - value2Numbr;
                
            } else if (sign.equals( "/")) {
                return  value1Numbr / value2Numbr;
               
            } else if (sign == "*") {
                return  value1Numbr * value2Numbr;
                
            }
          return 0;
    }
    
}
