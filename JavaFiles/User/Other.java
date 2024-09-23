public class Other extends User {
    public Other(String id, String name) {
        setId(id);
        setName(name);
        setRole(Role.OTHER.toString());
    }
}
