#include <stdio.h>
#include <math.h>

int main() {
    int f = 5, r = 0;

    // Варіант А: з використанням скороченої форми оператора розгалуження if
    int e_A;
    if (f != 0) {
        e_A = 3 * f + 2 * r;
    } else {
        e_A = sqrt(8 * r) / (2 * f - 4);
    }
    printf("Variant A: e = %d\n", e_A);

    // Варіант Б: з використанням повної форми оператора розгалуження if...else if
    int e_B;
    if (f != 0) {
        e_B = 3 * f + 2 * r;
    } else if (f == 0) {
        e_B = sqrt(8 * r) / (2 * f - 4);
    } else if (f == -5) {
        e_B = f * r - 9;
    }
    printf("Variant B: e = %d\n", e_B);

    return 0;
}
