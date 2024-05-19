#include <stdio.h>

int main() {
    double sum = 0.0;

    for (int i = 2; i <= 7; i++) {
        double product = 1.0;
        for (int j = 1; j <= i - 1; j++) {
            product *= (double)i / j;
        }
        sum += product;
    }

    printf("Result: %.2f\n", sum);

    return 0;
}
