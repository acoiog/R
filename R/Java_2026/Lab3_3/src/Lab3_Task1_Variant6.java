import java.util.Scanner;

public class Lab3_Task1_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №3. Завдання 1, варіант 6");
        System.out.println("Дано масив цілих чисел a[i].");
        System.out.println("Знайти кількість від'ємних елементів.");
        System.out.println("Якщо кількість від'ємних > середнє арифметичне — додати 10 до кожного елемента.");
        System.out.println("Інакше — замінити всі елементи на 0.");
        System.out.println("1  —  Ввести розмір масиву та елементи");
        System.out.println("0  —  Вихід");

        while (true) {
            System.out.print("\nВведіть команду (1 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("вихід") ||
                    command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("q")) {
                System.out.println("\nПрограма завершена. Дякуємо!");
                break;
            }
            else if (command.equals("1")) {
                solveTask(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void solveTask(Scanner scanner) {
        System.out.println("\nВЕДЕННЯ МАСИВУ");

        int n = readPositiveInt(scanner, "Введіть розмір масиву n (n ≥ 1): ");

        int[] a = new int[n];

        // Заповнення масиву з клавіатури
        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            a[i] = readInt(scanner, "a[" + (i + 1) + "] = ");
        }

        int negativeCount = 0;
        int sum = 0;

        for (int num : a) {
            sum += num;
            if (num < 0) negativeCount++;
        }

        double average = (double) sum / n;

        System.out.println("\nАналіз масиву:");
        System.out.println("Кількість від'ємних елементів: " + negativeCount);
        System.out.printf("Середнє арифметичне: %.2f%n", average);

        // Основна логіка
        if (negativeCount > average) {
            System.out.println("\nКількість від'ємних елементів більша за середнє → додаємо 10 до кожного елемента:");
            for (int i = 0; i < n; i++) {
                a[i] += 10;
            }
            printArray(a, "Оновлений масив");
        } else {
            System.out.println("\nКількість від'ємних елементів НЕ більша за середнє → заміняємо всі елементи на 0:");
            for (int i = 0; i < n; i++) {
                a[i] = 0;
            }
            printArray(a, "Масив після заміни");
        }
    }

    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value >= 1) return value;
                else System.out.println("Розмір масиву має бути ≥ 1.");
            } else {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.nextLine();
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

    private static void printArray(int[] arr, String title) {
        System.out.println(title + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = %d%n", i + 1, arr[i]);
        }
    }
}