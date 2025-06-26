import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basics {
    public static void main(String[] args) {

        // inefficient
//        List<String> words = Arrays.asList("one", "seven", "eleven");
//        if(words.contains("seven")) {
//            System.out.println("found the word!");
//        }
        Map<User, User> users = new HashMap<>();
        User user1 = new User(1L, "John", "john@domain.com");
        User user2 = new User(2L, "Jennifer", "jennifer@domain.com");
        User user3 = new User(3L, "Mary", "mary@domain.com");
        users.put(user1, user1);
        users.put(user2, user2);
        users.put(user3, user3);
        if (users.containsKey(user1)) {
            System.out.print("User found in the collection");
        }


    }

    public static class User {
        long id;
        String name;
        String email;

        public User(long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public int hashCode() {
            int hash = 7;
            hash = 31 * hash + (int) id;
            hash = 31 * hash + (name == null ? 0 : name.hashCode());
            hash = 31 * hash + (email == null ? 0 : email.hashCode());
            System.out.println("hashCode() called - Computed hash: " + hash);
            return hash;
        }
    }
}

