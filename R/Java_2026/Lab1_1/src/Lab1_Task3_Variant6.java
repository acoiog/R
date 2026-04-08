import java.util.Scanner;
public class Lab1_Task3_Variant6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторна робота №1. Завдання 3, варіант 6");
        System.out.println("Програма: Поштовий індекс → Назва міста.Використовується switch ... case");
        System.out.println("1  —  Ввести поштовий індекс");
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
                findCityByIndex(scanner);
            }
            else {
                System.out.println("Невідома команда! Введіть 1 або 0.");
            }
        }

        scanner.close();
    }

    private static void findCityByIndex(Scanner scanner) {
        System.out.println("\nПОШУК МІСТА ЗА ІНДЕКСОМ");

        System.out.print("Введіть поштовий індекс (4 цифр): ");
        String input = scanner.nextLine().trim();

        if (!input.matches("\\d{4}")) {
            System.out.println("Помилка! Поштовий індекс має складатися з 4 цифр.");
            return;
        }

        int index = Integer.parseInt(input);

        String city;

        switch (index) {
            case 1001:  city = "Київ";          break;
            case 2000:  city = "Чернігів";      break;
            case 3000:  city = "Львів";         break;
            case 4000:  city = "Харків";        break;
            case 5000:  city = "Одеса";         break;
            case 6000:  city = "Дніпро";        break;
            case 7000:  city = "Запоріжжя";     break;
            case 8000:  city = "Миколаїв";      break;
            case 5800: city = "Чернівці";      break;
            case 7900: city = "Івано-Франківськ"; break;
            case 8800: city = "Ужгород";       break;
            case 4900: city = "Вінниця";       break;
            default:
                city = null;
        }


        if (city != null) {
            System.out.println("Поштовий індекс " + index + " належить місту:" + city );
        } else {
            System.out.println("На жаль, місто з індексом " + index + " у базі не знайдено.");
            System.out.println("   Спробуйте один із відомих індексів (наприклад 5800).");
        }
    }
}