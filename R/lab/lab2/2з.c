#include <stdio.h>

int main() {

   const int a = 1, b = 15, c = 7;
    float y = (2*a + 1 + c) / (float)b - (3*b + c) / (float)c;
    printf("Значення функції y = %.2f\n", y);

    return 0;
}
