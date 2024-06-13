#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>


double Area(double x1, double y1, double x2, double y2, double x3, double y3) {
    return fabs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
}
// Функція для перевірки, чи лежать всі три точки на одній прямій
bool areCollinear(double x1, double y1, double x2, double y2, double x3, double y3) {
    return fabs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) < 1e-10;
}

int main() {
   
    double x1_1, y1_1, x2_1, y2_1, x3_1, y3_1;
    double x1_2, y1_2, x2_2, y2_2, x3_2, y3_2;

    
    printf("Введіть координати першого трикутника (x1 y1 x2 y2 x3 y3): ");
    if (scanf("%lf %lf %lf %lf %lf %lf", &x1_1, &y1_1, &x2_1, &y2_1, &x3_1, &y3_1) != 6) {
        printf("Помилка введення! Переконайтесь, що ввели шість чисел.\n");
        return 1;
    }

    printf("Введіть координати другого трикутника (x1 y1 x2 y2 x3 y3): ");
    if (scanf("%lf %lf %lf %lf %lf %lf", &x1_2, &y1_2, &x2_2, &y2_2, &x3_2, &y3_2) != 6) {
        printf("Помилка введення! Переконайтесь, що ввели шість чисел.\n");
        return 1;
    }

    
    if (areCollinear(x1_1, y1_1, x2_1, y2_1, x3_1, y3_1)) {
        printf("Всі три вершини першого трикутника лежать на одній прямій. Це не трикутник.\n");
        return 1;
    }


    if (areCollinear(x1_2, y1_2, x2_2, y2_2, x3_2, y3_2)) {
        printf("Всі три вершини другого трикутника лежать на одній прямій. Це не трикутник.\n");
        return 1;
    }

    
    double area1 = Area(x1_1, y1_1, x2_1, y2_1, x3_1, y3_1);
    
    double area2 = Area(x1_2, y1_2, x2_2, y2_2, x3_2, y3_2);

    
    if (area1 > area2) {
        printf("Перший трикутник має більшу площу: %.2f\n", area1);
    } else if (area2 > area1) {
        printf("Другий трикутник має більшу площу: %.2f\n", area2);
    } else {
        printf("Обидва трикутники мають однакову площу: %.2f\n", area1);
    }

    return 0;
}
