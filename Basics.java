import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Basics {
    public static void main(String[] args) {

        String cat = "Isis";
        System.out.println(cat + ": " + canTheCatJumpTheFenceSwitch(cat));

    }

    private static String canTheCatJumpTheFence(String cat) {
        String response;
        if (cat.equals("Isis")) {
            response = "Only seen it with a towel";
        } else if (cat.equals("Miso")) {
            response = "Yes! She wants out!!";
        } else if (cat.equals("Sasha")) {
            response = "Haven't seen it yet but I'm hopeful!";
        } else {
            response = "Please provide a valid cat!";
        }
        return response;
    }

    private static String canTheCatJumpTheFenceSwitch(String cat) {
        String response;
        switch (cat) {
            case "Isis":
            case "Miso":
                response = "Yes! She wants out!!";
                break;
            case "Sasha":
                response = "Haven't seen it yet but I'm hopeful!";
                break;
            default:
                response = "Please provide a valid cat!";
                break;
        }
        return response;
    }

}

