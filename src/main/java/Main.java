import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        PlanetsCalculator calculator = new PlanetsCalculator();
        Scanner scanner = new Scanner(System.in);

        long seconds = scanner.nextLong();
        scanner.nextLine();
        String planet = scanner.nextLine().toLowerCase();

        System.out.println(calculator.calculateAgeBySeconds(seconds, planet));
    }
}