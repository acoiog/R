import java.util.Scanner;
public class Lab1_Task2_Variant6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Лабораторна робота №1. Завдання 2, варіант 6");
        System.out.println("Програма: Чи поміститься круг у квадраті?");
        System.out.println("1  —  Почати обчислення");
        System.out.println("0  —  Вихід з програми");

        while (true) {
            System.out.print("\nВведіть команду (1 або 0): ");
            String command = scanner.nextLine().trim();

            if (command.equals("0") || command.equalsIgnoreCase("exit") ||
                    command.equalsIgnoreCase("вихід") || command.equalsIgnoreCase("q")) {
                System.out.println("\nПрограма завершена. Дякуємо за використання!");
                break;
            }
            else if (command.equals("1")) {
                calculateCircleInSquare(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void calculateCircleInSquare(Scanner scanner) {
        System.out.println("\nОБЧИСЛЕННЯ: Чи поміститься круг у квадраті");

        double r = readPositiveDouble(scanner, "Введіть радіус круга r (см): ");
        double s = readPositiveDouble(scanner, "Введіть довжину сторони квадрата s (см): ");

        double areaCircle = Math.PI * r * r;
        double areaSquare = s * s;

        System.out.printf("Площа круга   = %.4f см²%n", areaCircle);
        System.out.printf("Площа квадрата = %.4f см²%n", areaSquare);

        if (areaCircle <= areaSquare) {
            System.out.println("ВИСНОВОК: Круг ПОМІСТИТЬСЯ у квадраті.");
        } else {
            System.out.println("ВИСНОВОК: Круг НЕ ПОМІСТИТЬСЯ у квадраті.");
        }
    }

    private static double readPositiveDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Значення має бути додатним (> 0)!");
                }
            } else {
                System.out.println("Помилка! Введіть число.");
                scanner.nextLine();
            }
        }
    }
}