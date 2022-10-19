import java.util.HashMap;
import java.util.Map;

public class PhoneNumbers {

    private final Map<String, String> map;

    public PhoneNumbers() {
        map  = new HashMap<>(20);
    }

    public void add(String name, String num) {
        map.put(name, num);
    }

    public void showAll() {
        map.forEach((k, v) -> System.out.printf("%s %s\n", k, v));
    }
}
