#include <stdio.h>
#include <math.h>

int main() {
    double a = -M_PI / 2; // Початок інтервалу
    double b = M_PI / 2; // Кінець інтервалу
    double dx = M_PI / 30; // Крок
    double x, y;

    printf("Результати обчислення функції y = (sin(x))/x на проміжку [%lf, %lf] з кроком %lf:\n", a, b, dx);
    printf("x\t|\ty\n");
    printf("----------------------\n");

    for (x = a; x <= b; x += dx) {
        if (x == 0) {
            printf("%.2lf\t|\tНевизначено\n", x);
        } else {
            y = sin(x) / x;
            printf("%.2lf\t|\t%.6lf\n", x, y);
        }
    }

    return 0;
}
