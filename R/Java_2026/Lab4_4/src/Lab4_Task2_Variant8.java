import java.util.Random;
import java.util.Scanner;

public class Lab4_Task2_Variant8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №4. Завдання 2, варіант 8");
        System.out.println("Перевірка симетричності квадратної матриці відносно головної діагоналі");
        System.out.println("Матриця генерується випадковими числами з діапазону [-100; 100]");
        System.out.println("1  —  Згенерувати матрицю та перевірити симетричність");
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
        System.out.println("\nГЕНЕРАЦІЯ КВАДРАТНОЇ МАТРИЦІ");

        int n = readPositiveInt(scanner, "Введіть розмірність матриці n (n ≥ 1): ");

        int[][] matrix = generateRandomMatrix(n);

        System.out.println("\nЗгенерована матриця " + n + "×" + n + ":");
        printMatrix(matrix);

        boolean isSymmetric = isSymmetricMainDiagonal(matrix);

        System.out.println("\nРезультат перевірки:");
        if (isSymmetric) {
            System.out.println("Матриця є симетричною відносно головної діагоналі.");
        } else {
            System.out.println("Матриця НЕ є симетричною відносно головної діагоналі.");
        }
    }

    private static int[][] generateRandomMatrix(int n) {
        Random random = new Random();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(201) - 100;
            }
        }
        return matrix;
    }

    private static boolean isSymmetricMainDiagonal(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d ", value);
            }
            System.out.println();
        }
    }

    private static int readPositiveInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                scanner.nextLine();
                if (val >= 1) return val;
                System.out.println("n має бути ≥ 1");
            } else {
                System.out.println("Введіть ціле число");
                scanner.nextLine();
            }
        }
    }
}