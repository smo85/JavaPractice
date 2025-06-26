import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        varargsTest( "name", "is", "sarah");

//        firstOfFirst(Arrays.asList("one", "two"), Collections.emptyList());


    }

    private static void varargsTest(String...values) {
        for(String i : values) {
            System.out.println(i);
        }
    }

    static String firstOfFirst(List<String>... strings) {
        List<Integer> ints = Collections.singletonList(42);
        Object[] objects = strings;
        objects[0] = ints; // Heap pollution

        return strings[0].get(0); // ClassCastException
    }
}

