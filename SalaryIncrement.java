import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(30000, 45000, 35000, 50000, 25000);

        List<Integer> eligible = salary.stream()
            .filter(x -> x < 40000)
            .collect(Collectors.toList());

        System.out.println("Eligible salaries: " + eligible);

        List<Double> revised = salary.stream()
            .map(x -> x < 40000 ? x * 1.10 : (double) x)
            .collect(Collectors.toList());

        System.out.println("Revised salaries: " + revised);

        double total = revised.stream()
            .reduce(0.0, (x, y) -> x + y);

        System.out.println("Total salary: " + total);
    }
}
