#include <stdio.h>


void inputArray(double arr[], int n) {
    for (int i = 0; i < n; i++) {
        int validInput = 0;
        while (!validInput) {
            printf("Введіть елемент %d: ", i + 1);
            if (scanf("%lf", &arr[i]) != 1) {
                printf("Неправильне значення. Введіть дійсне число.\n");
                while (getchar() != '\n'); 
            } else {
                validInput = 1;
            }
        }
    }
}


void printArrayReverse(double arr[], int n) {
    printf("Елементи масиву в зворотному порядку: ");
    for (int i = n - 1; i >= 0; i--) {
        printf("%.0lf ", arr[i]); 
    }
    printf("\n");
}

int main() {
    int n;
    char choice;

    do {
        
        printf("Введіть розмір масиву: ");
        while (scanf("%d", &n) != 1 || n <= 0) {
            printf("Неправильне значення. Введіть натуральне число.\n");
            while (getchar() != '\n'); 
        }

        double arr[n];

        // Виклик функції для введення елементів масиву
        inputArray(arr, n);

        // Виклик функції для виведення елементів масиву в зворотному порядку
        printArrayReverse(arr, n);

        
printf("Хочете продовжити? (Введіть 1 для так, 0 для виходу): ");
        while (scanf("%d", &choice) != 1 || (choice != 0 && choice != 1)) {
            printf("Некоректне введення. Введіть 1 для продовження або 0 для виходу: ");
            while (getchar() != '\n'); 
        }

    } while (choice == 1);

    printf("Програма завершила роботу.\n");

    return 0;
}