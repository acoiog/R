import java.util.Scanner;

public class Lab2_Task3_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №2. Завдання 3, варіант 6");
        System.out.println("Обчислення добутку: (a+1)(a+1+2)...(a+1+2+...+n)");
        System.out.println("1  —  Ввести значення a та n та обчислити");
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
                calculateProduct(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void calculateProduct(Scanner scanner) {
        System.out.println("\nОБЧИСЛЕННЯ ДОБУТКУ");

        double a = readDouble(scanner, "Введіть дійсне число a: ");
        int n = readNatural(scanner, "Введіть натуральне число n (n ≥ 1): ");

        double product = 1.0;
        double currentSum = 0.0;

        System.out.println("\nПроміжні обчислення:");

        for (int i = 1; i <= n; i++) {
            currentSum += (a + i);
            product *= currentSum;


            System.out.printf("Після %d-го кроку: сума = %.2f | добуток = %.2f%n",
                    i, currentSum, product);
        }

        System.out.printf("Фінальний результат: (a+1)(a+2)...(a+n) = %.6f%n", product);
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Помилка! Введіть число.");
                scanner.nextLine();
            }
        }
    }

    private static int readNatural(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= 1) {
                    scanner.nextLine();
                    return value;
                } else {
                    System.out.println("Помилка! Число повинно бути ≥ 1.");
                }
            } else {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.nextLine();
            }
        }
    }
}