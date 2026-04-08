import java.util.Random;
import java.util.Scanner;

public class Lab3_Task2_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №3. Завдання 2, варіант 6");
        System.out.println("1) Кількість від’ємних елементів масиву");
        System.out.println("2) Сума елементів після мінімального за модулем елемента");
        System.out.println("1 — Спосіб А (введення з клавіатури)");
        System.out.println("2 — Спосіб Б (випадкові числа [-100; 100])");
        System.out.println("0 — Вихід");

        while (true) {
            System.out.print("\nВведіть команду (1, 2 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("вихід") ||
                    command.equalsIgnoreCase("exit")) {
                System.out.println("\nПрограма завершена. Дякуємо!");
                break;
            }
            else if (command.equals("1")) {
                modeA_Keyboard(scanner);
            }
            else if (command.equals("2")) {
                modeB_Random();
            }
            else {
                System.out.println("Невідома команда! Введіть 1, 2 або 0.");
            }
        }

        scanner.close();
    }

    //ВВЕДЕННЯ З КЛАВІАТУРИ
    private static void modeA_Keyboard(Scanner scanner) {
        System.out.println("\nСпосіб А: Введення масиву з клавіатури");

        int n = readPositiveInt(scanner, "Введіть кількість елементів n (n ≥ 1): ");
        int[] array = new int[n];

        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = readInt(scanner, "Елемент [" + (i + 1) + "] = ");
        }

        processArray(array, "Спосіб А (з клавіатури)");
    }

    //ВИПАДКОВІ ЧИСЛА
    private static void modeB_Random() {
        System.out.println("\nСпосіб Б: Заповнення випадковими числами [-100; 100]");

        int n = readPositiveIntConsole("Введіть кількість елементів n (n ≥ 1): ");
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(201) - 100; // від -100 до 100
        }

        System.out.println("Масив заповнено випадковими числами:");
        printArray(array);

        processArray(array, "Спосіб Б (випадкові числа)");
    }

    private static void processArray(int[] arr, String modeName) {
        int negativeCount = countNegative(arr);
        int minAbsIndex = findMinAbsIndex(arr);
        int sumAfterMinAbs = sumAfterIndex(arr, minAbsIndex);

        System.out.println("\nРезультати (" + modeName + "):");
        System.out.println("1) Кількість від’ємних елементів: " + negativeCount);

        if (minAbsIndex == -1) {
            System.out.println("2) Мінімальний за модулем елемент не знайдено (масив порожній).");
        } else {
            System.out.println("   Індекс мінімального за модулем елемента: " + (minAbsIndex + 1));
            System.out.println("2) Сума елементів після нього: " + sumAfterMinAbs);
        }
    }

    private static int countNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) count++;
        }
        return count;
    }

    private static int findMinAbsIndex(int[] arr) {
        if (arr.length == 0) return -1;

        int minIndex = 0;
        int minAbs = Math.abs(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            if (currentAbs < minAbs) {
                minAbs = currentAbs;
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int sumAfterIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length - 1) return 0;

        int sum = 0;
        for (int i = index + 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = %d%n", i + 1, arr[i]);
        }
    }

    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                scanner.nextLine();
                if (val >= 1) return val;
                System.out.println("❌ n має бути ≥ 1");
            } else {
                System.out.println("❌ Введіть ціле число");
                scanner.nextLine();
            }
        }
    }

    private static int readPositiveIntConsole(String prompt) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine();
                if (val >= 1) return val;
                System.out.println(" n має бути ≥ 1");
            } else {
                System.out.println("Введіть ціле число");
                sc.nextLine();
            }
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                scanner.nextLine();
                return val;
            } else {
                System.out.println("Введіть ціле число");
                scanner.nextLine();
            }
        }
    }
}