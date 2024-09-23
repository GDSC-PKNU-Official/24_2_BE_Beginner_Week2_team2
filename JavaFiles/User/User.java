import java.util.List;

abstract class User<T> {
    private String id;
    private String name;
    private String role;
    private List<T> books;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public List<T> getBook() {
        return books;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBook(List<T> books) {
        this.books = books;
    }
}
