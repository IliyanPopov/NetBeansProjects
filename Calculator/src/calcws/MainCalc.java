package calcws;

import javax.xml.ws.Endpoint;

public class MainCalc {
    

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        String url = "http://localhost:666/calculator";
        
        Endpoint.publish(url, calc);
        
    }

    
}
