package db;

public class Group {
    
    private Integer id;
    private String label;
    private String faculty;

    public Group(Integer id, String label, String faculty) {
        this.id = id;
        this.label = label;
        this.faculty = faculty;
    }

    public Group() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", label=" + label + ", faculty=" + faculty + '}';
    }
    
}
