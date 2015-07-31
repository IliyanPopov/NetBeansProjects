package calcws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Calculator {
    
    @WebMethod
    public  int add (
             int x,
             int y){
        return x + y;
    }
    
    @WebMethod
    public @WebResult(name = "result") int multiply(
             @WebParam(name = "x") int x,
             @WebParam(name = "y") int y){
        return  x * y;
    }
}

