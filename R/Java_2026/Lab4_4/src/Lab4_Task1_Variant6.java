import java.util.Scanner;

public class Lab4_Task1_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №4. Завдання 1, варіант 6");
        System.out.println("Знайти суму найбільших елементів кожного рядка матриці");
        System.out.println("1  —  Ввести матрицю та обчислити");
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
        System.out.println("\nВВЕДЕННЯ МАТРИЦІ");

        int n = readPositiveInt(scanner, "Введіть кількість рядків n (n ≥ 1): ");
        int m = readPositiveInt(scanner, "Введіть кількість стовпців m (m ≥ 1): ");

        int[][] A = new int[n][m];

        System.out.println("Введіть елементи матриці " + n + "×" + m + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = readInt(scanner, "A[" + (i+1) + "][" + (j+1) + "] = ");
            }
        }

        System.out.println("\nВведена матриця:");
        printMatrix(A);

        int totalSum = 0;
        System.out.println("\nНайбільші елементи по рядках:");

        for (int i = 0; i < n; i++) {
            int maxInRow = A[i][0];
            for (int j = 1; j < m; j++) {
                if (A[i][j] > maxInRow) {
                    maxInRow = A[i][j];
                }
            }
            System.out.printf("Рядок %d: max = %d%n", i + 1, maxInRow);
            totalSum += maxInRow;
        }

        System.out.println("\nСума найбільших елементів усіх рядків: " + totalSum);
    }

    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                scanner.nextLine();
                if (val >= 1) return val;
                System.out.println("Значення має бути ≥ 1");
            } else {
                System.out.println("Введіть ціле число");
                scanner.nextLine();
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

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%4d ", elem);
            }
            System.out.println();
        }
    }
}