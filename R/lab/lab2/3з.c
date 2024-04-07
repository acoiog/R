#include <stdio.h>
#include <math.h>

int main() {
    int a, y;
    float x;

    
    printf("Введіть значення змінних a і y: ");
    scanf("%d %d", &a, &y);

    
    x = a * sqrt(pow(y, 2) - 2 * a);

    
    printf("Результат обчислення функції: %.2f\n", x);

    return 0;
}
