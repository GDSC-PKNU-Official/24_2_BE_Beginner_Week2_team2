import java.util.Queue;

public class User<T> {
    private final String id;
    private final String name;
    private final String role;
    private Queue<T> books;

    /*
     * At first, User object had planned to implemented by
     * pulling out from somewhere it exists with recognized by id.
     * But, User object doesn't come out from DB or somewhere.
     * We cannot pull the value of it, which is name, role, out.
     * Because it has NO resource of pulling out from.
     * And I decided make dummy data of user.
     * Therefore, name, role, should have assigned when it generated.
     * -- Commented by Jae Min --
     * */
    public User(String id, String name, String role, Queue<T> books) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Queue<T> getBook() {
        return books;
    }

    public void returnBook(T book) {

    }
}