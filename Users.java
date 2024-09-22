import java.util.HashMap;
import java.util.Map;

public class Users {
    private static Map<Integer, String> userList = new HashMap<>();

    // 회원 등록
    public static void addUser(int userId, String name) {
        userList.put(userId, name);
    }
    public static void removeUser(int userId) {
        if(userList.remove(userId) != null) {
            System.out.println("회원 탈퇴 완료");
        } else {
            //throw new UserNotFoundException("회원 ID 존재 하지 않음");
        }
    }
    public static boolean checkExistUser(int userId) {
        return userList.containsKey(userId);
    }

}
