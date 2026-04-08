import java.util.Scanner;
public class Lab1_Task1_Variant6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна №1 | Завдання 1 | Варіант 6");
        System.out.println("1 - Спосіб А (тернарний оператор)");
        System.out.println("2 - Спосіб Б (if ... else)");
        System.out.println("0 - Вихід");

        while (true) {
            System.out.print("Введіть команду (1, 2 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("вихід") ||
                    command.equalsIgnoreCase("exit")) {
                System.out.println("Програма завершена.");
                break;
            }
            else if (command.equals("1")) {
                computeTernary(scanner);
            }
            else if (command.equals("2")) {
                computeIfElse(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1, 2 або 0.");
            }
        }

        scanner.close();
    }

    private static void computeTernary(Scanner sc) {
        System.out.print("СПОСІБ А: СКОРОЧЕНА ФОРМА\n");

        int a = readInt(sc, "Введіть ціле число a: ");
        int b = readInt(sc, "Введіть ціле число b: ");
        int c = readInt(sc, "Введіть ціле число c: ");

        double y = (c > 0)
                ? Math.sqrt(Math.max(0, b - a + 2 * Math.sqrt(c)))
                : (c == 0)
                  ? (a != 0 ? (double) b / (c - 6 * a) : Double.NaN)
                  : b + 12.0 * c * c * c;

        printCompactResult(a, b, c, y, "А");
    }

    private static void computeIfElse(Scanner sc) {
        System.out.print("СПОСІБ Б: ПОВНА ФОРМА\n");

        int a = readInt(sc, "Введіть ціле число a: ");
        int b = readInt(sc, "Введіть ціле число b: ");
        int c = readInt(sc, "Введіть ціле число c: ");

        double y;

        if (c > 0) {
            double inside = b - a + 2 * Math.sqrt(c);
            y = (inside >= 0) ? Math.sqrt(inside) : Double.NaN;
            if (inside < 0) System.out.println("Помилка: вираз під коренем від'ємний!");
        } else if (c == 0) {
            y = (a != 0) ? (double) b / (c - 6 * a) : Double.NaN;
            if (a == 0) System.out.println("Помилка: ділення на нуль!");
        } else {
            y = b + 12.0 * c * c * c;
        }

        printCompactResult(a, b, c, y, "Б");
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine();
                return val;
            } else {
                System.out.println("Помилка! Введіть ціле число.");
                sc.nextLine();
            }
        }
    }

    private static void printCompactResult(int a, int b, int c, double y, String mode) {
        System.out.println("Вхідні дані: a = " + a + ", b = " + b + ", c = " + c);

        if (Double.isNaN(y)) {
            System.out.println("Результат: обчислення неможливе");
        } else {
            System.out.printf("Результат: y = %.2f%n", y);
        }
    }
}