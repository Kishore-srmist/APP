import java.util.*;
import java.util.stream.*;

class Main {
    static int calculateBill(int units) {
        return units * 6;
    }

    public static void main(String[] args) {
        List<Integer> units = Arrays.asList(8, 12, 15, 7, 20);

        List<Integer> high = units.stream()
            .filter(x -> x > 10)
            .collect(Collectors.toList());

        System.out.println("Above 10 units: " + high);

        List<Integer> cost = units.stream()
            .map(x -> calculateBill(x))
            .collect(Collectors.toList());

        System.out.println("Daily cost: " + cost);

        int totalUnits = units.stream()
            .reduce(0, (x, y) -> x + y);

        int totalBill = cost.stream()
            .reduce(0, (x, y) -> x + y);

        System.out.println("Total units: " + totalUnits);
        System.out.println("Total bill: Rs. " + totalBill);
    }
}
