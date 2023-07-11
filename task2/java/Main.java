import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "!dsajj%jhhd dUHHU";
        String result = sort(text);
        System.out.println(result);
    }

    public static String sort(String text) {
        return text.replaceAll("[^a-zA-Z]", "");
    }
}

