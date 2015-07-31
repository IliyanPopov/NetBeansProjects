package booksclient;

import java.util.List;

public class BooksClient {

    public static void main(String[] args) {
        
       
        BooksServiceService service = new BooksServiceService(); // we are creating a proxy object
        Books port = service.getBooksPort();                    // and using it
        
        List<Book> books = port.getBooks();
        
        for(Book b : books){
            System.out.println(b.getTitle());
        }
        
    }

   
}
    

