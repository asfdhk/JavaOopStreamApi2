import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 5, "White");
        Cat cat2 = new Cat("Luska", 5, "White");
        Cat cat3 = new Cat("Barsic", 2, "Red");
        Cat cat4 = new Cat("Kuzia", 3, "Grey");
        List<Cat> list = List.of(cat1, cat2, cat3, cat4);


        List<Cat> result = list.stream()
                .filter(cat -> cat.getWeight() >= 3)
                .sorted(Comparator.comparing(Cat::getName))
                .toList();

        System.out.println("Результат: " + result);
    }
}

