
package booksclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Books", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Books {


    /**
     * 
     * @return
     *     returns java.util.List<booksclient.Book>
     */
    @WebMethod
    @WebResult(name = "book", targetNamespace = "")
    @RequestWrapper(localName = "getBooks", targetNamespace = "http://ws/", className = "booksclient.GetBooks")
    @ResponseWrapper(localName = "getBooksResponse", targetNamespace = "http://ws/", className = "booksclient.GetBooksResponse")
    @Action(input = "http://ws/Books/getBooksRequest", output = "http://ws/Books/getBooksResponse")
    public List<Book> getBooks();

    /**
     * 
     * @param book
     */
    @WebMethod
    @RequestWrapper(localName = "addBook", targetNamespace = "http://ws/", className = "booksclient.AddBook")
    @ResponseWrapper(localName = "addBookResponse", targetNamespace = "http://ws/", className = "booksclient.AddBookResponse")
    @Action(input = "http://ws/Books/addBookRequest", output = "http://ws/Books/addBookResponse")
    public void addBook(
        @WebParam(name = "book", targetNamespace = "")
        Book book);

    /**
     * 
     * @return
     *     returns java.util.List<booksclient.Publisher>
     */
    @WebMethod
    @WebResult(name = "publisher", targetNamespace = "")
    @RequestWrapper(localName = "getPublishers", targetNamespace = "http://ws/", className = "booksclient.GetPublishers")
    @ResponseWrapper(localName = "getPublishersResponse", targetNamespace = "http://ws/", className = "booksclient.GetPublishersResponse")
    @Action(input = "http://ws/Books/getPublishersRequest", output = "http://ws/Books/getPublishersResponse")
    public List<Publisher> getPublishers();

    /**
     * 
     * @param author
     * @return
     *     returns java.util.List<booksclient.Book>
     */
    @WebMethod
    @WebResult(name = "book", targetNamespace = "")
    @RequestWrapper(localName = "findByAuthor", targetNamespace = "http://ws/", className = "booksclient.FindByAuthor")
    @ResponseWrapper(localName = "findByAuthorResponse", targetNamespace = "http://ws/", className = "booksclient.FindByAuthorResponse")
    @Action(input = "http://ws/Books/findByAuthorRequest", output = "http://ws/Books/findByAuthorResponse")
    public List<Book> findByAuthor(
        @WebParam(name = "author", targetNamespace = "")
        String author);

    /**
     * 
     * @param title
     * @return
     *     returns java.util.List<booksclient.Book>
     */
    @WebMethod
    @WebResult(name = "book", targetNamespace = "")
    @RequestWrapper(localName = "findByTitle", targetNamespace = "http://ws/", className = "booksclient.FindByTitle")
    @ResponseWrapper(localName = "findByTitleResponse", targetNamespace = "http://ws/", className = "booksclient.FindByTitleResponse")
    @Action(input = "http://ws/Books/findByTitleRequest", output = "http://ws/Books/findByTitleResponse")
    public List<Book> findByTitle(
        @WebParam(name = "title", targetNamespace = "")
        String title);

}
