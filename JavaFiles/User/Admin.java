package user;

public class Admin extends User {
    public Admin(String id, String name) {
        setId(id);
        setName(name);
        setRole(Role.ADMIN.toString());
    }
}
