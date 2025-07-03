import java.util.Optional;
import java.util.Random;

public class Basics {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Integer testValue = randomNumber.nextInt(100);
        System.out.println(isEven(testValue) + " " + testValue);
        Optional<String> evenString = Optional.ofNullable(isEven(testValue));
        String someString = evenString.orElseGet(() -> thisOtherFunction());
        // so this or else runs regardless, but it only returns the string if evenString is null
        System.out.println(someString);
    }

    private static String isEven(Integer num) {
        if(num % 2 == 0) {
            return "even!";
        }
        return null;
    }

    private static String thisOtherFunction() {
        System.out.println("I am running!");
        return "hello";
    }
}


