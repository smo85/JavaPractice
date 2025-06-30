import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Basics {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three");
        ArrayList<String> newList = new ArrayList<>();
//        list.forEach(System.out::println);  // processing order is defined
//        System.out.println(" ");
////        list.stream().forEach(System.out::println);  // processing order not defined
//        list.parallelStream().forEach(System.out::println);
        list.forEach(value -> {
            newList.add(addAnA(value));
        });
        newList.forEach(System.out::println);
    }

    private static String addAnA(String value) {
        return value + "a";
    }



}

