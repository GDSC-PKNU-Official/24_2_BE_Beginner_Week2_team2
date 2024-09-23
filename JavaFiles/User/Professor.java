public class Professor extends User {
    public Professor(String id, String name){
        setId(id);
        setName(name);
        setRole(Role.PROFESSOR.toString());
    }
}
