package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import ws.db.Group;
import ws.db.Student;
import ws.db.StudentsDAO;


@WebService(name = "Students")  //changing the name 
public class StudentsService {
    
    private StudentsDAO dao;
    
    public StudentsService(StudentsDAO dao){
        this.dao = dao;
    }
    
    @WebMethod
    public @WebResult(name = "student") List<Student> getStudents(){
        List<Student> students = dao.getStudents();
        return students;
    }
    
    @WebMethod
    public @WebResult(name = "student") List<Student> findStudentByFirstName(@WebParam(name = "firstName") String firstName){
        List<Student> students = dao.findStudentByFirstName(firstName);
        return students;
        
    }
    
    @WebMethod
    public @WebResult(name = "student") List<Student> findStudentByLastName(@WebParam(name = "lastName") String lastName){
        List<Student> students = dao.findStudentByLastName(lastName);
        return students;
        
    }
    
    @WebMethod
    public @WebResult(name = "groups") List<Group> getGroups (){
        List<Group> group = dao.getGroups();
        return group;
    }
    
    @WebMethod
    public void addBook(@WebParam(name = "book") Student student) {
        dao.addStudent(student);
        
    }
    
}
