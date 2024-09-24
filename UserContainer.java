import java.util.HashMap;

public class UserContainer<T extends User>{
    User[] users;
    HashMap<String, User> userMap;

    public Pair<String> getInfo(String id) {
        User user = userMap.get(id);
        return new Pair<>(user.getName(), user.getRole());
    }

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    public void removeUser(String id) {
        userMap.remove(id);
    }

}