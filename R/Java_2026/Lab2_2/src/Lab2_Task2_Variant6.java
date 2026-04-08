import java.util.Scanner;

public class Lab2_Task2_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №2. Завдання 2, варіант 6");
        System.out.println("Обчислити середнє арифметичне всіх непарних чисел у діапазоні [1;80]");
        System.out.println("1 — Спосіб А (цикл з параметром — for)");
        System.out.println("2 — Спосіб Б (цикл з передумовою — while)");
        System.out.println("3 — Спосіб В (цикл з післяумовою — do...while)");
        System.out.println("0 — Вихід");

        while (true) {
            System.out.print("\nВведіть команду (1, 2, 3 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("вихід") ||
                    command.equalsIgnoreCase("exit")) {
                System.out.println("\nПрограма завершена. Дякуємо!");
                break;
            }
            else if (command.equals("1")) {
                methodA_For();
            }
            else if (command.equals("2")) {
                methodB_While();
            }
            else if (command.equals("3")) {
                methodC_DoWhile();
            }
            else {
                System.out.println("Невідома команда! Введіть 1, 2, 3 або 0.");
            }
        }

        scanner.close();
    }

    //  А) Цикл з параметром (for)
    private static void methodA_For() {
        System.out.println("\nСпосіб А: Цикл for");

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 80; i++) {
            if (i % 2 != 0) {        // непарне число
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.printf("Середнє арифметичне непарних чисел від 1 до 80 = %.2f%n", average);
        System.out.println("Кількість непарних чисел: " + count);
    }

    //Б) Цикл з передумовою (while)
    private static void methodB_While() {
        System.out.println("\nСпосіб Б: Цикл while");

        int sum = 0;
        int count = 0;
        int i = 1;

        while (i <= 80) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
            i++;
        }

        double average = (double) sum / count;
        System.out.printf("Середнє арифметичне непарних чисел від 1 до 80 = %.2f%n", average);
        System.out.println("Кількість непарних чисел: " + count);
    }

    // В) Цикл з післяумовою (do...while)
    private static void methodC_DoWhile() {
        System.out.println("\nСпосіб В: Цикл do...while");

        int sum = 0;
        int count = 0;
        int i = 1;

        do {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
            i++;
        } while (i <= 80);

        double average = (double) sum / count;
        System.out.printf("Середнє арифметичне непарних чисел від 1 до 80 = %.2f%n", average);
        System.out.println("Кількість непарних чисел: " + count);
    }
}