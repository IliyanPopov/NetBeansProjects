package ws;

import java.util.List;
import javax.xml.ws.Endpoint;
import ws.db.Group;
import ws.db.Student;
import ws.db.StudentsDAO;


public class Main {
    
    public static void main(String[] args) {
        StudentsDAO dao = new StudentsDAO();
        
        StudentsService service = new StudentsService(dao);
        
        String url = "http://localhost:666/students";
        Endpoint.publish(url, service); //simple http server will be started with this line
        
        
        
        
        Student s2 = new Student(null,"Svetlin", "Minkov", "dane@gmail.com", "+35988775580", 3.5, 4);
        dao.addStudent(s2);
        List<Student> result = dao.getStudents();
        List<Group> groupResult = dao.getGroups();
        
        
        
        for (Student student : result) {
         System.out.println(student);
        }
        
        
    }
    
}
