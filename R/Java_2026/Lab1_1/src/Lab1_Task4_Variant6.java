import java.util.Scanner;

public class Lab1_Task4_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №1. Завдання 4, варіант 6");
        System.out.println("Обчислення функції");
        System.out.println("1  —  Ввести значення a, y, z та обчислити");
        System.out.println("0  —  Вихід з програми");

        while (true) {
            System.out.print("\nВведіть команду (1 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("exit") ||
                    command.equalsIgnoreCase("вихід") || command.equalsIgnoreCase("q")) {
                System.out.println("\nПрограма завершена. Дякуємо за використання!");
                break;
            }
            else if (command.equals("1")) {
                calculateFunction(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void calculateFunction(Scanner scanner) {
        System.out.println("\nОБЧИСЛЕННЯ ФУНКЦІЇ");

        try {
            int a = readInt(scanner, "Введіть ціле число a: ");
            int y = readInt(scanner, "Введіть ціле число y: ");
            int z = readInt(scanner, "Введіть ціле число z: ");

            double inside = y * y - 2.0 * a + Math.pow(Math.cos(z), 2);

            if (inside < 0) {
                System.out.println("Помилка: вираз під коренем від'ємний (y² - 2a + cos²(z) < 0).");
                System.out.println("Обчислення неможливе в дійсних числах.");
                return;
            }

            double sqrtValue = Math.sqrt(inside);
            double x = a * sqrtValue;

            System.out.println("Вхідні дані:");
            System.out.println("a = " + a);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
            System.out.printf("Вираз під коренем = %.2f%n", inside);
            System.out.printf("√(вираз) = %.2f%n", sqrtValue);
            System.out.printf("Результат: x = %.2f%n", x);

        } catch (Exception ex) {
            System.out.println(" Сталася неочікувана помилка: " + ex.getMessage());
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.nextLine();
            }
        }
    }
}