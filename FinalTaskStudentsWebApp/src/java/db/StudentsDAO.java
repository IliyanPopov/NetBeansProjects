package db;

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

        String label = rs.getString("label");
        String faculty = rs.getString("faculty");

        Student s = new Student(id, firstName, lastName, email, phone, gpa, groupId);
        s.setLabel(label);
        s.setFaculty(faculty);

        return s;
    }

    public List<Student> getStudents() {
        List<Student> result = new ArrayList<>();
        String sql = "SELECT s.*, g.label, g.faculty FROM students s, groups g "
                + " WHERE s.group_id = g.id "
                + " ORDER BY id";

        try (Statement st = db.createStatement();
                ResultSet rs = st.executeQuery(sql);) {

            while (rs.next()) {
                Student s = readStudentFromResultSet(rs);
                result.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Student getStudent(int id) {
        Student result = null;
        String sql = "SELECT s.*, g.label, g.faculty FROM students s, groups g "
                + " WHERE s.id=? AND s.group_id = g.id";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = readStudentFromResultSet(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Student> findStudentByFirstName(String firstName) {
        List<Student> result = new ArrayList<>();

        String sql = "SELECT s.*, g.label, g.faculty FROM students s, groups g"
                + " WHERE firstname LIKE ? AND s.group_id = g.id";
        String searchTerm = "%" + firstName + "%";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, searchTerm);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = readStudentFromResultSet(rs);
                result.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Student> findStudentByLastName(String lastName) {
        List<Student> result = new ArrayList<>();

        String sql = "SELECT s.*, g.label, g.faculty FROM students s, groups g "
                + " WHERE lastname LIKE ? AND s.group_id = g.id";
        String searchTerm = "%" + lastName + "%";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, searchTerm);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = readStudentFromResultSet(rs);
                result.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addStudent(Student student) {
        String sql = "INSERT INTO students(firstname, lastname, email, phone, gpa, group_id) "
                + " VALUES(?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setDouble(5, student.getGpa());
            ps.setInt(6, student.getGroupId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String firstname, String lastname,
            String email, String phone, double gpa) {
        
        String sql = "UPDATE students SET firstname=?, lastname=?, email=?, "
                + " phone=?, gpa=? WHERE id=?";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setDouble(5, gpa);

            ps.setInt(6, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Group> getGroups() {
        List<Group> result = new ArrayList<>();

        String sql = "SELECT * FROM groups ORDER BY id";

        try (Statement st = db.createStatement();
                ResultSet rs = st.executeQuery(sql);) {

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String label = rs.getString("label");
                String faculty = rs.getString("faculty");

                Group b = new Group(id, label, faculty);
                result.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Group getGroup(int id) {
        String sql = "SELECT * FROM groups WHERE id = ?";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();

            String label = rs.getString("label");
            String faculty = rs.getString("faculty");

            Group g = new Group(id, label, faculty);
            return g;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addGroup(Group group) {
        String sql = "INSERT INTO groups (label, faculty) VALUES(?, ?)";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, group.getLabel());
            ps.setString(2, group.getFaculty());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteGroup(int id) {
        String sql = "DELETE FROM groups WHERE id=?";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGroup(int id, String label, String faculty) {
        String sql = "UPDATE groups SET label=?, faculty=? WHERE id=?";

        try (PreparedStatement ps = db.prepareStatement(sql)) {
            ps.setString(1, label);
            ps.setString(2, faculty);
            ps.setInt(3, id);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
