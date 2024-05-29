#include <stdio.h>
#include <math.h>

int main() {
    char choice;

    do {
        double x, y, z;
        printf("Введіть значення x: ");
        scanf("%lf", &x);
        printf("Введіть значення y: ");
        scanf("%lf", &y);
        printf("Введіть значення z: ");
        scanf("%lf", &z);

        if (x == 0) {
            printf("Помилка: x не може бути рівним нулю.\n");
            continue; 
        }

        double b = (1 + cos(y - 2)) / ((pow(x, 4) / 2) + pow(sin(z), 2));

        printf("Значення b: %.4lf\n", b);

        printf("Бажаєте продовжити (так - 1, ні - інше)? ");
        scanf(" %c", &choice); 

    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
