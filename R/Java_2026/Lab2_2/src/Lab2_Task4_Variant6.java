import java.util.Scanner;

public class Lab2_Task4_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №2. Завдання 4, варіант 6");
        System.out.println("Обчислення функції y = log₂(x) на інтервалі [1; 2] з кроком 0.025");
        System.out.println("1  —  Побудувати таблицю");
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
                buildTable();
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void buildTable() {
        double a = 1.0;
        double b = 2.0;
        double dx = 0.025;

        System.out.println("\nРезультати обчислення функції y = log₂(x)");
        System.out.println("│─────────────────────────────────────│");
        System.out.println("│      x          │    y = log₂(x)    │");
        System.out.println("│─────────────────────────────────────│");

        for (double x = a; x <= b + 1e-9; x += dx) {   // +1e-9 для уникнення проблем з округленням
            try {
                if (x <= 0) {
                    System.out.printf("│ %12.4f   │   НЕВИЗНАЧЕНО (log від не додатнього) │%n", x);
                    continue;
                }

                double y = Math.log(x) / Math.log(2);   // log₂(x)

                System.out.printf("│ %12.4f   │   %12.6f      │%n", x, y);

            } catch (Exception e) {
                System.out.printf("│ %12.4f   │   ПОМИЛКА                 │%n", x);
            }
        }

        System.out.println("│──────────────────────────────────────│");
        System.out.println("Таблиця побудована успішно.");
    }
}