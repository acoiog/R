import java.io.*;
import java.util.Scanner;

public class Lab5_Task2_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №5. Завдання 2, варіант 6");
        System.out.println("Дано файл, елементами якого є окремі символи.");
        System.out.println("Перевірити, чи перші два символи є цифрами.");
        System.out.println("Якщо так — визначити, чи утворене двозначне число парне.");
        System.out.println("1  —  Вказати файл та перевірити");
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
                processFile(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void processFile(Scanner scanner) {
        System.out.print("\nВведіть назву файлу (наприклад, data.txt): ");
        String fileName = scanner.nextLine().trim();

        if (fileName.isEmpty()) {
            System.out.println("Назва файлу не може бути порожньою!");
            return;
        }

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Файл \"" + fileName + "\" не знайдено!");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }

            String text = content.toString().trim();

            if (text.length() < 2) {
                System.out.println("У файлі менше двох символів!");
                return;
            }

            char first = text.charAt(0);
            char second = text.charAt(1);

            System.out.println("\nПерші два символи у файлі: '" + first + "' та '" + second + "'");

            if (Character.isDigit(first) && Character.isDigit(second)) {
                String numStr = "" + first + second;
                int number = Integer.parseInt(numStr);

                System.out.println("Це цифри → утворене число: " + number);

                if (number % 2 == 0) {
                    System.out.println("Число ПАРНЕ");
                } else {
                    System.out.println("Число НЕПАРНЕ");
                }
            } else {
                System.out.println("Перші два символи НЕ є цифрами.");
            }

        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}