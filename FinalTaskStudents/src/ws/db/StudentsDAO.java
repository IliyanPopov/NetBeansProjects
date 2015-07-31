package ws.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO {

    private Connection db;

    private static Connection getConnection() {
        try {
            String user = "adminStudents";
            String pass = "adminStudents";
            String url = "jdbc:mysql://localhost:3386/students";

            Class.forName("com.mysql.jdbc.Driver");
            Connection db = DriverManager.getConnection(url, user, pass);
            return db;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public StudentsDAO() {
        this.db = getConnection();
    }

    private Student readStudentFromResultSet(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("id");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String email = rs.getString("email");
        String phone = rs.getString("phone");
        double gpa = rs.getDouble("gpa");
        Integer groupId = rs.getInt("group_id");

        Student s = new Student(id, firstName, lastName, email, phone, gpa, groupId);
        return s;
    }
    
    public List<Student> getStudents() {
        List<Student> result = new ArrayList<>();
        
        String sql = "select * from students";
        
        try(Statement st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);) {
            
            while(rs.next()) {
                Student s = readStudentFromResultSet(rs);
                result.add(s);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public Student getStudent(int id) {
        Student result = null;
        String sql = "select * from students where id = ?";
        
        try(PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                result = readStudentFromResultSet(rs);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public List<Student> findStudentByFirstName(String firstName) {
        List<Student> result = new ArrayList<>();
        
        String sql = "select * from students where firstname like ?";
        String searchTerm = "%" + firstName + "%";
        
        try(PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, searchTerm);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Student s = readStudentFromResultSet(rs);
                result.add(s);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public List<Student> findStudentByLastName(String lastName) {
        List<Student> result = new ArrayList<>();
        
        String sql = "select * from students where lastname like ?";
        String searchTerm = "%" + lastName + "%";
        
        try(PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, searchTerm);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Student s = readStudentFromResultSet(rs);
                result.add(s);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public void addStudent(Student student) {
        String sql = "insert into students(firstname, lastname, email, phone, gpa, group_id) "
                + " values(?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setDouble(5, student.getGpa());
            ps.setInt(6, student.getGroupId());
            
            ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteStudent(int id) {
        String sql = "delete from students where id = ?";
        
        try(PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void updateStudent(Student student) {
        String sql = "update students set firstname=?, lastname=?, email=?, "
                + "phone=?, gpa=?, group_id=? where id=?";
        
        try (PreparedStatement ps = db.prepareStatement(sql)){
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setDouble(5, student.getGpa());
            ps.setInt(6, student.getGroupId());
            
            ps.setInt(7, student.getId());
            
            ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Group> getGroups() {
        List<Group> result = new ArrayList<>();
        
        String sql = "select * from groups";
        
        try(Statement st = db.createStatement();
            ResultSet rs = st.executeQuery(sql);) {
            
            while(rs.next()) {
                Integer id = rs.getInt("id");
                String label = rs.getString("label");
                String faculty = rs.getString("faculty");
                
                Group b = new Group(id, label, faculty);
                result.add(b);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    

}
