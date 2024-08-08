import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add((int) (Math.random() * 100 + 100));
        }
        List<String> list = numbers.stream()
                .filter(integer -> integer % 5 == 0 && integer % 2 == 0)
                .map((integer) -> Math.sqrt(integer)) //Math::sqrt - так тоже можно
                .map((n) -> "Корень: " + n)
                .collect(Collectors.toList());
        for (String str : list) {
            System.out.println(str);
        }
    }
}
