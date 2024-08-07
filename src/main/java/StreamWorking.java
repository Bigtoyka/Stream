import java.util.ArrayList;
import java.util.List;

public class StreamWorking {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        users.stream()
                .filter(user -> user.getName().contains("l"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Пользователь не найден"));

    }
}
