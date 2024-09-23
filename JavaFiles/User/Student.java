package user;

public class Student extends User {
    public Student(String id, String name) {
        setId(id);
        setName(name);
        setRole(Role.STUDENT.toString());
    }
}
