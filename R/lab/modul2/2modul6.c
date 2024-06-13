#include <stdio.h>
#include <limits.h>


void inputMatrix(int matrix[10][10]) {
    printf("Введіть елементи матриці 10x10:\n");
    for (int i = 0; i < 10; i++) {
        printf("Рядок %d: ", i + 1);
        for (int j = 0; j < 10; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }
}


void printMatrix(int matrix[10][10]) {
    printf("Матриця 10x10:\n");
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}


int findMax(int matrix[10][10]) {
    int max = INT_MIN;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (matrix[i][j] > max) {
                max = matrix[i][j];
            }
        }
    }
    return max;
}


int findMin(int matrix[10][10]) {
    int min = INT_MAX;
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (matrix[i][j] < min) {
                min = matrix[i][j];
            }
        }
    }
    return min;
}


double calculateAverage(int max, int min) {
    return (max + min) / 2.0;
}

int main() {
    int matrix[10][10];

    // Введення елементів матриці
    inputMatrix(matrix);

    // Виведення елементів матриці
    printMatrix(matrix);

    // Знаходження максимального та мінімального елементів
    int max = findMax(matrix);
    int min = findMin(matrix);

    // Обчислення середнього арифметичного
    double average = calculateAverage(max, min);

    
    printf("Максимальний елемент: %d\n", max);
    printf("Мінімальний елемент: %d\n", min);
    printf("Середнє арифметичне максимального та мінімального елементів: %.2f\n", average);

    return 0;
}
