
package finaltaskstudentsclient;

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
@WebService(name = "Students", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Students {


    /**
     * 
     * @param lastName
     * @return
     *     returns java.util.List<finaltaskstudentsclient.Student>
     */
    @WebMethod
    @WebResult(name = "student", targetNamespace = "")
    @RequestWrapper(localName = "findStudentByLastName", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.FindStudentByLastName")
    @ResponseWrapper(localName = "findStudentByLastNameResponse", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.FindStudentByLastNameResponse")
    @Action(input = "http://ws/Students/findStudentByLastNameRequest", output = "http://ws/Students/findStudentByLastNameResponse")
    public List<Student> findStudentByLastName(
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName);

    /**
     * 
     * @param firstName
     * @return
     *     returns java.util.List<finaltaskstudentsclient.Student>
     */
    @WebMethod
    @WebResult(name = "student", targetNamespace = "")
    @RequestWrapper(localName = "findStudentByFirstName", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.FindStudentByFirstName")
    @ResponseWrapper(localName = "findStudentByFirstNameResponse", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.FindStudentByFirstNameResponse")
    @Action(input = "http://ws/Students/findStudentByFirstNameRequest", output = "http://ws/Students/findStudentByFirstNameResponse")
    public List<Student> findStudentByFirstName(
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName);

    /**
     * 
     * @return
     *     returns java.util.List<finaltaskstudentsclient.Group>
     */
    @WebMethod
    @WebResult(name = "groups", targetNamespace = "")
    @RequestWrapper(localName = "getGroups", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.GetGroups")
    @ResponseWrapper(localName = "getGroupsResponse", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.GetGroupsResponse")
    @Action(input = "http://ws/Students/getGroupsRequest", output = "http://ws/Students/getGroupsResponse")
    public List<Group> getGroups();

    /**
     * 
     * @return
     *     returns java.util.List<finaltaskstudentsclient.Student>
     */
    @WebMethod
    @WebResult(name = "student", targetNamespace = "")
    @RequestWrapper(localName = "getStudents", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.GetStudents")
    @ResponseWrapper(localName = "getStudentsResponse", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.GetStudentsResponse")
    @Action(input = "http://ws/Students/getStudentsRequest", output = "http://ws/Students/getStudentsResponse")
    public List<Student> getStudents();

    /**
     * 
     * @param book
     */
    @WebMethod
    @RequestWrapper(localName = "addBook", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.AddBook")
    @ResponseWrapper(localName = "addBookResponse", targetNamespace = "http://ws/", className = "finaltaskstudentsclient.AddBookResponse")
    @Action(input = "http://ws/Students/addBookRequest", output = "http://ws/Students/addBookResponse")
    public void addBook(
        @WebParam(name = "book", targetNamespace = "")
        Student book);

}