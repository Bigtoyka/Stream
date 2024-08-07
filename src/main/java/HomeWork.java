import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        List<Integer> filtred = filter(numbers, (int n) -> {
            return n % 5 == 0;
        });
        for (int i : filtred) {
            System.out.println(i);
        }
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> res = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
