import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Basics {
    public static void main(String[] args) {

        Map<Integer, String> catMap = new HashMap<>();
        catMap.put(1, "Isis");
        catMap.put(2, "Sasha");
        catMap.put(3, "Miso");

        catMap.forEach((key, cat) -> System.out.println(key + " " + cat));
        catMap.entrySet().forEach(entry -> System.out.println(entry.getValue() + " - " + entry.getKey()));
    }
}

