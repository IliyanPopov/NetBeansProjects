
package finaltaskstudentsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the finaltaskstudentsclient package. 
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

    private final static QName _GetGroupsResponse_QNAME = new QName("http://ws/", "getGroupsResponse");
    private final static QName _GetStudents_QNAME = new QName("http://ws/", "getStudents");
    private final static QName _AddBookResponse_QNAME = new QName("http://ws/", "addBookResponse");
    private final static QName _FindStudentByLastNameResponse_QNAME = new QName("http://ws/", "findStudentByLastNameResponse");
    private final static QName _GetStudentsResponse_QNAME = new QName("http://ws/", "getStudentsResponse");
    private final static QName _FindStudentByFirstName_QNAME = new QName("http://ws/", "findStudentByFirstName");
    private final static QName _FindStudentByFirstNameResponse_QNAME = new QName("http://ws/", "findStudentByFirstNameResponse");
    private final static QName _AddBook_QNAME = new QName("http://ws/", "addBook");
    private final static QName _FindStudentByLastName_QNAME = new QName("http://ws/", "findStudentByLastName");
    private final static QName _GetGroups_QNAME = new QName("http://ws/", "getGroups");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: finaltaskstudentsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGroupsResponse }
     * 
     */
    public GetGroupsResponse createGetGroupsResponse() {
        return new GetGroupsResponse();
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link FindStudentByLastNameResponse }
     * 
     */
    public FindStudentByLastNameResponse createFindStudentByLastNameResponse() {
        return new FindStudentByLastNameResponse();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link FindStudentByFirstName }
     * 
     */
    public FindStudentByFirstName createFindStudentByFirstName() {
        return new FindStudentByFirstName();
    }

    /**
     * Create an instance of {@link FindStudentByFirstNameResponse }
     * 
     */
    public FindStudentByFirstNameResponse createFindStudentByFirstNameResponse() {
        return new FindStudentByFirstNameResponse();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link FindStudentByLastName }
     * 
     */
    public FindStudentByLastName createFindStudentByLastName() {
        return new FindStudentByLastName();
    }

    /**
     * Create an instance of {@link GetGroups }
     * 
     */
    public GetGroups createGetGroups() {
        return new GetGroups();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getGroupsResponse")
    public JAXBElement<GetGroupsResponse> createGetGroupsResponse(GetGroupsResponse value) {
        return new JAXBElement<GetGroupsResponse>(_GetGroupsResponse_QNAME, GetGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getStudents")
    public JAXBElement<GetStudents> createGetStudents(GetStudents value) {
        return new JAXBElement<GetStudents>(_GetStudents_QNAME, GetStudents.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findStudentByLastNameResponse")
    public JAXBElement<FindStudentByLastNameResponse> createFindStudentByLastNameResponse(FindStudentByLastNameResponse value) {
        return new JAXBElement<FindStudentByLastNameResponse>(_FindStudentByLastNameResponse_QNAME, FindStudentByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getStudentsResponse")
    public JAXBElement<GetStudentsResponse> createGetStudentsResponse(GetStudentsResponse value) {
        return new JAXBElement<GetStudentsResponse>(_GetStudentsResponse_QNAME, GetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByFirstName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findStudentByFirstName")
    public JAXBElement<FindStudentByFirstName> createFindStudentByFirstName(FindStudentByFirstName value) {
        return new JAXBElement<FindStudentByFirstName>(_FindStudentByFirstName_QNAME, FindStudentByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByFirstNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findStudentByFirstNameResponse")
    public JAXBElement<FindStudentByFirstNameResponse> createFindStudentByFirstNameResponse(FindStudentByFirstNameResponse value) {
        return new JAXBElement<FindStudentByFirstNameResponse>(_FindStudentByFirstNameResponse_QNAME, FindStudentByFirstNameResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "findStudentByLastName")
    public JAXBElement<FindStudentByLastName> createFindStudentByLastName(FindStudentByLastName value) {
        return new JAXBElement<FindStudentByLastName>(_FindStudentByLastName_QNAME, FindStudentByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getGroups")
    public JAXBElement<GetGroups> createGetGroups(GetGroups value) {
        return new JAXBElement<GetGroups>(_GetGroups_QNAME, GetGroups.class, null, value);
    }

}
