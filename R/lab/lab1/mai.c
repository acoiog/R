#include <stdio.h>
#include <math.h>

int main() {
    double x1, y1, x2, y2, x3, y3;
    printf("Введіть координати першої вершини (x1, y1): ");
    scanf("%lf %lf", &x1, &y1);
    printf("Введіть координати другої вершини (x2, y2): ");
    scanf("%lf %lf", &x2, &y2);
    printf("Введіть координати третьої вершини (x3, y3): ");
    scanf("%lf %lf", &x3, &y3);


    double side1 =  sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    double side2 =  sqrt(pow(x2 - x3, 2) + pow(y2 - y3, 2));
    double side3 =  sqrt(pow(x1 - x3, 2) + pow(y1 - y3, 2));

    // Обчислення периметрa
    double perimeter = side1 + side2 + side3;
    // Півпериметр для обчислення площі 
    double s = perimeter / 2;
    // Обчислення площі за формулою Герона
    double plo1 = sqrt(s * (s - side1) * (s - side2) * (s - side3));

    printf("Периметр трикутника: %.2f\n", perimeter);
    printf("Площа трикутника: %.2f\n", plo1);

    return 0;
}