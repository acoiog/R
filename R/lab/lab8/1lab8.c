#include <stdio.h>
#include <stdlib.h> 


int countUniqueElements(int *arr, int size) {
    int uniqueCount = 1; 

    for (int i = 1; i < size; i++) {
        int isUnique = 1; 

        
        for (int j = 0; j < i; j++) {
            if (*(arr + i) == *(arr + j)) {
                isUnique = 0; 
                break;
            }
        }

        if (isUnique) {
            uniqueCount++; 
        }
    }

    return uniqueCount;
}

int main() {
    int n;
    int choice; 

    do {
        printf("Введіть розмір масиву: ");

        
        while (scanf("%d", &n) != 1 || n <= 0) {
            printf("Некоректне введення розміру масиву. Будь ласка, введіть ціле додатнє число: ");
            while (getchar() != '\n'); 
        }

        int arr[n];
        printf("Введіть елементи масиву:\n");
        for (int i = 0; i < n; i++) {
            
            while (scanf("%d", &arr[i]) != 1) {
                printf("Некоректне введення елементу масиву. Будь ласка, введіть ціле число: ");
                while (getchar() != '\n'); 
            }
        }

        
        int uniqueCount = countUniqueElements(arr, n);

        printf("Кількість різних елементів у масиві: %d\n", uniqueCount);

        
        printf("Хочете продовжити? (Введіть 1 для так, 0 для виходу): ");
        while (scanf("%d", &choice) != 1 || (choice != 0 && choice != 1)) {
            printf("Некоректне введення. Введіть 1 для продовження або 0 для виходу: ");
            while (getchar() != '\n'); 
        }

    } while (choice == 1);

    printf("Програма завершила роботу.\n");

    return 0;
}