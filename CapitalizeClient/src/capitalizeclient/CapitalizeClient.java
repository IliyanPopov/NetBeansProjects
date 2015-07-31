package capitalizeclient;


public class CapitalizeClient {

    
    
    public static void main(String[] args) {
        
        CapitalizeService service = new CapitalizeService();
        Capitalize capitalize = service.getCapitalizePort();
        
        String toBeCap = capitalize.capitalize("tesd testss ss");
        
        System.out.println(toBeCap);
    }
    
}
