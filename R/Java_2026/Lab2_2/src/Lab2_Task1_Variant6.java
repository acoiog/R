import java.util.Scanner;

public class Lab2_Task1_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №2. Завдання 1, варіант 6");
        System.out.println("Обчислення функції: t = (1 + z) * (x + y/z) / (x - 1/(1 + x²))");
        System.out.println("Програма перевіряє коректність значень у циклі.");
        System.out.println("1  —  Ввести значення x, y, z");
        System.out.println("0  —  Вихід з програми");

        while (true) {
            System.out.print("\nВведіть команду (1 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("вихід") ||
                    command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("q")) {
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
        System.out.println("\nВВЕДЕННЯ ЗНАЧЕНЬ");

        while (true) {   // Цикл продовжується, поки не будуть коректні значення
            try {
                int x = readInt(scanner, "Введіть ціле число x: ");
                int y = readInt(scanner, "Введіть ціле число y: ");
                int z = readInt(scanner, "Введіть ціле число z: ");

                // Перевірка на можливе ділення на нуль
                if (z == 0) {
                    System.out.println("Помилка: ділення на нуль (y/z). Задайте z ≠ 0.");
                    continue;
                }
                if (x == 0 && 1 + x * x == 0) { // теоретично неможливо, але для повноти
                    System.out.println("Помилка: ділення на нуль у знаменнику.");
                    continue;
                }

                double numerator = (1 + z) * (x + (double) y / z);
                double denominator = x - 1.0 / (1 + x * x);
                double t = numerator / denominator;


                System.out.println("\nВхідні дані: x = " + x + ", y = " + y + ", z = " + z);
                System.out.printf("Результат: t = %.2f%n", t);

                break;

            } catch (Exception e) {
                System.out.println("Сталася помилка. Спробуйте ще раз.");
            }
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