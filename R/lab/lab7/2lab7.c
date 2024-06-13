#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 10 
#define LOWER -100 
#define UPPER 100 

void initializeArray(int arr[], int size) {
    srand(time(0)); 
    for (int i = 0; i < size; i++) {
        
        arr[i] = (rand() % (UPPER - LOWER + 1)) + LOWER;
    }
}

// Функція для підрахунку додатних елементів у масиві
int countPositive(int arr[], int size) {
    int count = 0; 
    for (int i = 0; i < size; i++) {
        if (arr[i] > 0) {
            count++; 
        }
    }
    return count;
}

// Функція для знаходження добутку елементів до мінімального за модулем елемента
int productUpToMinAbs(int arr[], int size) {
    int minAbsIndex = 0; 
    // Знаходимо індекс елемента з мінімальним значенням 
    for (int i = 1; i < size; i++) {
        if (abs(arr[i]) < abs(arr[minAbsIndex])) {
            minAbsIndex = i;
        }
    }
    int product = 1; 
    // Обчислюємо добуток елементів 
    for (int i = 0; i < minAbsIndex; i++) {
        product *= arr[i];
    }
    return product;
}


void displayArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]); 
    }
    printf("\n");
}

int main() {
    int arr[SIZE]; 

    initializeArray(arr, SIZE);

    printf("Елементи масиву: ");
    displayArray(arr, SIZE);

    int positiveCount = countPositive(arr, SIZE);
    printf("Кількість додатних елементів: %d\n", positiveCount);

    int product = productUpToMinAbs(arr, SIZE);
    printf("Добуток елементів до мінімального за модулем елемента: %d\n", product);

    return 0;
}
