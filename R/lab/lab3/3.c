#include <stdio.h>

int main() {
    int series_number;

    printf("Введіть номер серії: ");
    scanf("%d", &series_number);

    switch(series_number) {
        case 1:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 1\nДата прем'єри: 5 квітня 2019 року\n");
            break;
        case 2:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 2\nДата прем'єри: 12 квітня 2019 року\n");
            break;
        case 3:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 3\nДата прем'єри: 19 квітня 2019 року\n");
            break;
        case 4:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 4\nДата прем'єри: 26 квітня 2019 року\n");
            break;
        case 5:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 5\nДата прем'єри: 3 травня 2019 року\n");
            break;
        case 6:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 6\nДата прем'єри: 10 травня 2019 року\n");
            break;
        case 7:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 7\nДата прем'єри: 17 травня 2019 року\n");
            break;
        case 8:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 8\nДата прем'єри: 24 травня 2019 року\n");
            break;
        case 9:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 9\nДата прем'єри: 31 травня 2019 року\n");
            break;
        case 10:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 10\nДата прем'єри: 7 червня 2019 року\n");
            break;
        case 11:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 11\nДата прем'єри: 14 червня 2019 року\n");
            break;
        case 12:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 12\nДата прем'єри: 21 червня 2019 року\n");
            break;
        case 13:
            printf("Назва: Brigada Costa del Sol - Сезон 1, Епізод 13\nДата прем'єри: 28 червня 2019 року\n");
            break;
        default:
            printf("Для введеного номера серії немає інформації.\n");
    }

    return 0;
}
