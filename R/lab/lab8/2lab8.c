#include <stdio.h>
#include <stdlib.h>

#define SIZE 10 


void inputArray(int *array, int size) {
    printf("Введіть елементи масиву (%d чисел):\n", size);
    for (int i = 0; i < size; i++) {
        printf("Елемент %d: ", i + 1);
        scanf("%d", &array[i]);
    }
}


void printArray(int *array, int size) {
    printf("Елементи масиву:\n");
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}


int countElementsGreaterThanFive(int *array, int size) {
    int count = 0;
    for (int i = 0; i < size; i++) {
        if (array[i] > 5) {
            count++;
        }
    }
    return count;
}

int sumElementsAfterMax(int *array, int size) {
    int maxIndex = 0;
    
    for (int i = 1; i < size; i++) {
        if (array[i] > array[maxIndex]) {
            maxIndex = i;
        }
    }
    int sum = 0;
    
    for (int i = maxIndex + 1; i < size; i++) {
        sum += array[i];
    }
    return sum;
}

int main() {
int array[SIZE];
    char choice;

    do {
        inputArray(array, SIZE);

        printArray(array, SIZE);

        int countGreaterThanFive = countElementsGreaterThanFive(array, SIZE);
        printf("Кількість елементів масиву, більших за число п'ять: %d\n", countGreaterThanFive);

        int sumAfterMax = sumElementsAfterMax(array, SIZE);
        printf("Сума елементів масиву, розташованих після максимального елемента: %d\n", sumAfterMax);

printf("Хочете продовжити? (Введіть 1 для так, 0 для виходу): ");
        while (scanf("%d", &choice) != 1 || (choice != 0 && choice != 1)) {
            printf("Некоректне введення. Введіть 1 для продовження або 0 для виходу: ");
            while (getchar() != '\n'); 
        }

    } while (choice == 1);

    printf("Програма завершила роботу.\n");

    return 0;
}