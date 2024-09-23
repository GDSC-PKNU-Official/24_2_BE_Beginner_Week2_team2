package user;

import java.util.HashMap;
import java.util.Map;

public class UserContainer {
    private static Map<String, User> userMap = new HashMap<String, User>();

    public static Pair<String> getInfo(String id) {
        User user = userMap.get(id);
        return new Pair<>(user.getName(), user.getRole());
    }

    public static void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    public static void removeUser(String id) {
        userMap.remove(id);
    }

    public static User findUser(String id) {
        return userMap.get(id);
    }
}
