import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(45, 67, 32, 80, 55);

        List<Integer> passed = marks.stream()
            .filter(x -> x >= 50)
            .collect(Collectors.toList());

        System.out.println("Passed marks: " + passed);

        List<Integer> grace = marks.stream()
            .map(x -> Math.min(x + 5, 100))
            .collect(Collectors.toList());

        System.out.println("Grace marks: " + grace);

        int total = grace.stream()
            .reduce(0, (x, y) -> x + y);

        System.out.println("Total marks: " + total);
    }
}
