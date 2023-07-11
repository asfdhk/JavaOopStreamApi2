import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "adfasf sdfdsfsds sddf dsf sdfdsds hjjh";
        String result = sort(text);
        System.out.println(result);
    }
    public static String sort(String text) {
        return String.join(" ", Arrays.stream(text.split(" "))
                .filter(word -> word.length() <= 5)
                .toArray(String[]::new));
    }
}

