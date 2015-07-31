package students;

public class Student {
    String Name;
    int Id;

    public Student(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }
    
    public Student getFriend(){
        Student friend = new Student("Sredno Grozen", 7);
        return friend;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Student{" + "Name=" + Name + ", Id=" + Id + '}';
    }

    
    
}


