#include <stdio.h>

int main() {
    int sum = 0;
    int i = 21;
    do {
        sum += i * i;
        i += 2;
    } while (i <= 29);
    printf("Сума квадратів всіх непарних чисел у діапазоні [20:30] = %d\n", sum);
    return 0;
}
