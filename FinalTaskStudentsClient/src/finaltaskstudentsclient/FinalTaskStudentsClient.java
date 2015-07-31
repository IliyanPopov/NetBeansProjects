package finaltaskstudentsclient;

import java.util.List;

public class FinalTaskStudentsClient {

    public static void main(String[] args) {

        StudentsServiceService service = new StudentsServiceService(); // we are creating a proxy object
        Students port = service.getStudentsPort();                    // and using it
        
        List<Student> students = port.getStudents();
           
        
        for (Student student : students) {

            System.out.println(student.getLastName());

        }

    }

}
