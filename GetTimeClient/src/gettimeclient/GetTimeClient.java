package gettimeclient;


public class GetTimeClient {

   
    public static void main(String[] args) {
    
        GetTimeService service = new GetTimeService();
        GetTime getTime = service.getGetTimePort(); // Port is the same as interface in Soap
        
        String currentTime = getTime.getTime();
        System.out.println(currentTime);
    }
    
}
