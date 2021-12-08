package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        List<User> sorted = users.stream()
                        .sorted((o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()))
                .limit(3)
                .collect(Collectors.toList());
        for (User user: sorted) {
            System.out.println(user);
        }
    }

}

