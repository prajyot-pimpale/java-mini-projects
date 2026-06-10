import java.util.*;
import java.util.function.*;

public class ScientificCalculator {

    static Map<String, BiFunction<Double, Double, Double>> ops = new LinkedHashMap<>();
    static Map<String, Function<Double, Double>> unaryOps = new LinkedHashMap<>();

    static {
        // Binary
        ops.put("+", (a, b) -> a + b);
        ops.put("-", (a, b) -> a - b);
        ops.put("*", (a, b) -> a * b);
        ops.put("/", (a, b) -> b != 0 ? a / b : Double.NaN);
        ops.put("%", (a, b) -> a % b);
        ops.put("pow", (a, b) -> Math.pow(a, b));

        // Unary
        unaryOps.put("sqrt", a -> Math.sqrt(a));
        unaryOps.put("abs", a -> Math.abs(a));
        unaryOps.put("ceil", a -> Math.ceil(a));
        unaryOps.put("floor", a -> Math.floor(a));
        unaryOps.put("sin", a -> Math.sin(Math.toRadians(a)));
        unaryOps.put("cos", a -> Math.cos(Math.toRadians(a)));
        unaryOps.put("log", a -> Math.log10(a));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> history = new ArrayList<>();

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║    Scientific Calculator     ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Binary : + - * / % pow");
        System.out.println("Unary  : sqrt abs ceil floor sin cos log");
        System.out.println("Type 'history' or 'exit'\n");

        while (true) {
            System.out.print(">> ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Bye!");
                break;
            }

            if (input.equals("history")) {
                if (history.isEmpty()) System.out.println("No history");
                else history.forEach(System.out::println);
                continue;
            }

            String[] parts = input.split(" ");

            try {
                double result;

                if (parts.length == 2 && unaryOps.containsKey(parts[0])) {
                    // Unary: sqrt 16
                    double a = Double.parseDouble(parts[1]);
                    result   = unaryOps.get(parts[0]).apply(a);
                    String entry = parts[0] + "(" + a + ") = " + result;
                    System.out.println("= " + result);
                    history.add(entry);

                } else if (parts.length == 3 && ops.containsKey(parts[1])) {
                    // Binary: 10 + 5
                    double a = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[2]);
                    result   = ops.get(parts[1]).apply(a, b);

                    if (Double.isNaN(result))
                        System.out.println("Cannot divide by zero");
                    else {
                        String entry = a + " " + parts[1] + " " + b + " = " + result;
                        System.out.println("= " + result);
                        history.add(entry);
                    }
                } else {
                    System.out.println("Invalid input. Example: 10 + 5  or  sqrt 16");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid number format");
            }
        }

        sc.close();
    }
}