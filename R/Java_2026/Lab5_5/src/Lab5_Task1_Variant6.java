import java.util.Scanner;

public class Lab5_Task1_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №5. Завдання 1, варіант 6");
        System.out.println("Робота з рядками:");
        System.out.println("а) Замінити всі великі літери на малі");
        System.out.println("б) Вивести найдовше слово у тексті");
        System.out.println("1  —  Ввести текстовий рядок та обробити");
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
                processText(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void processText(Scanner scanner) {
        System.out.println("\nВВЕДЕННЯ ТЕКСТУ");
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();

        if (text.trim().isEmpty()) {
            System.out.println("Текст порожній!");
            return;
        }

        System.out.println("\nОригінальний текст:");
        System.out.println("\"" + text + "\"");

        // а) Заміна всіх великих літер на малі
        String lowerText = text.toLowerCase();

        System.out.println("\nа) Текст після заміни великих літер на малі:");
        System.out.println("\"" + lowerText + "\"");

        // б) Пошук найдовшого слова
        String longestWord = findLongestWord(text);

        System.out.println("\nб) Найдовше слово:");
        if (longestWord.isEmpty()) {
            System.out.println("Слів у тексті не знайдено.");
        } else {
            System.out.println("\"" + longestWord + "\" (довжина = " + longestWord.length() + " символів)");
        }

    }

    private static String findLongestWord(String text) {
        String[] words = text.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            String cleanWord = word.replaceAll("[^\\p{L}\\p{N}]", "");
            if (cleanWord.length() > longest.length()) {
                longest = cleanWord;
            }
        }
        return longest;
    }
}