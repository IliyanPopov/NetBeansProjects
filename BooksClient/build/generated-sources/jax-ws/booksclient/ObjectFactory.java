
package booksclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the booksclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBooks_QNAME = new QName("http://ws/", "getBooks");
    private final static QName _GetPublishers_QNAME = new QName("http://ws/", "getPublishers");
    private final static QName _AddBookResponse_QNAME = new QName("http://ws/", "addBookResponse");
    private final static QName _FindByTitleResponse_QNAME = new QName("http://ws/", "findByTitleResponse");
    private final static QName _FindByAuthorResponse_QNAME = new QName("http://ws/", "findByAuthorResponse");
    private final static QName _GetPublishersResponse_QNAME = new QName("http://ws/", "getPublishersResponse");
    private final static QName _FindByTitle_QNAME = new QName("http://ws/", "findByTitle");
    private final static QName _AddBook_QNAME = new QName("http://ws/", "addBook");
    private final static QName _FindByAuthor_QNAME = new QName("http://ws/", "findByAuthor");
    private final static QName _GetBooksResponse_QNAME = new QName("http://ws/", "getBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: booksclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetPublishers }
     * 
     */
    public GetPublishers createGetPublishers() {
        return new GetPublishers();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link FindByTitleResponse }
     * 
     */
    public FindByTitleResponse createFindByTitleResponse() {
        return new FindByTitleResponse();
    }

    /**
     * Create an instance of {@link FindByAuthorResponse }
     * 
     */
    public FindByAuthorResponse createFindByAuthorResponse() {
        return new FindByAuthorResponse();
    }

    /**
     * Create an instance of {@link GetPublishersResponse }
     * 
     */
    public GetPublishersResponse createGetPublishersResponse() {
        return new GetPublishersResponse();
    }

    /**
     * Create an instance of {@link FindByTitle }
     * 
     */
    public FindByTitle createFindByTitle() {
        return new FindByTitle();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link FindByAuthor }
     * 
     */
    public FindByAuthor createFindByAuthor() {
        return new FindByAuthor();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getPublishers")
    public JAXBElement<GetPublishers> createGetPublishers(GetPublishers value) {
        return new JAXBElement<GetPublishers>(_GetPublishers_QNAME, GetPublishers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findByTitleResponse")
    public JAXBElement<FindByTitleResponse> createFindByTitleResponse(FindByTitleResponse value) {
        return new JAXBElement<FindByTitleResponse>(_FindByTitleResponse_QNAME, FindByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findByAuthorResponse")
    public JAXBElement<FindByAuthorResponse> createFindByAuthorResponse(FindByAuthorResponse value) {
        return new JAXBElement<FindByAuthorResponse>(_FindByAuthorResponse_QNAME, FindByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublishersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getPublishersResponse")
    public JAXBElement<GetPublishersResponse> createGetPublishersResponse(GetPublishersResponse value) {
        return new JAXBElement<GetPublishersResponse>(_GetPublishersResponse_QNAME, GetPublishersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findByTitle")
    public JAXBElement<FindByTitle> createFindByTitle(FindByTitle value) {
        return new JAXBElement<FindByTitle>(_FindByTitle_QNAME, FindByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findByAuthor")
    public JAXBElement<FindByAuthor> createFindByAuthor(FindByAuthor value) {
        return new JAXBElement<FindByAuthor>(_FindByAuthor_QNAME, FindByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

}
