#include <stdio.h>

int main() {
    int sum = 0;
    for (int i = 21; i <= 29; i += 2) {
        sum += i * i;
    }
    printf("Сума квадратів всіх непарних чисел у діапазоні [20:30] = %d\n", sum);
    return 0;
}
