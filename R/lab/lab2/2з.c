#include <stdio.h>

int main() {
    
    int a, b, c;

    
    printf("Введіть значень a, b і c: ");
    scanf("%d %d %d", &a, &b, &c);

    
    float y = (2*a + 1 + c) / (float)b - (3*b + c) / (float)c;

    
    printf("Значення функції y = %.2f\n", y);

    return 0;
}
