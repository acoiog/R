#include <stdio.h>
#include <math.h>

int main() {
    double u, v;
    double x, y;
    double z;
    char choice;

    do {
        printf("Введіть значення u: ");
        scanf("%lf", &u);
        printf("Введіть значення v: ");
        scanf("%lf", &v);

        
        x = u;
        y = v;
        double f1 = (x + y) / (x * x + x * y + y * y) + x / (1 + y * y) + y / (1 + x * x);

        
        x = u * u;
        y = v * v;
        double f2 = (x + y) / (x * x + x * y + y * y) + x / (1 + y * y) + y / (1 + x * x);

        
        z = f1 + f2;

        
        printf("Результат z = %.2lf\n", z);

        
        printf("Введіть '1' щоб продовжити або будь-який інший символ щоб вийти: ");
        scanf(" %c", &choice);
    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
