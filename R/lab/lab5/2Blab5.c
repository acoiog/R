#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h>

void find_min_and_sum_between_negatives(int arr[], int n) {
    int min_element = INT_MAX;
    int first_neg_index = -1, second_neg_index = -1;

    
    for (int i = 0; i < n; i++) {
        if (arr[i] < min_element) {
            min_element = arr[i];
        }
        if (arr[i] < 0) {
            if (first_neg_index == -1) {
                first_neg_index = i;
            } else if (second_neg_index == -1) {
                second_neg_index = i;
            }
        }
    }

    
    if (first_neg_index == -1 || second_neg_index == -1) {
        printf("В масиві повинно бути принаймні два від'ємні елементи.\n");
        return;
    }

   
    int sum_between_negatives = 0;
    for (int i = first_neg_index + 1; i < second_neg_index; i++) {
        sum_between_negatives += arr[i];
    }

    printf("Мінімальний елемент масиву: %d\n", min_element);
    printf("Сума елементів між першими двома від'ємними елементами: %d\n", sum_between_negatives);
}

int main() {
    char choice;
    do {
        int n;
        printf("Введіть кількість елементів масиву: ");
        scanf("%d", &n);

        int arr[n];
        srand(time(0));
        for (int i = 0; i < n; i++) {
            arr[i] = rand() % 201 - 100; 
        }

        printf("Згенерований масив: ");
        for (int i = 0; i < n; i++) {
            printf("%d ", arr[i]);
        }
        printf("\n");

        find_min_and_sum_between_negatives(arr, n);

        printf("Бажаєте продовжити (1/2)? ");
        scanf(" %c", &choice);
    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
