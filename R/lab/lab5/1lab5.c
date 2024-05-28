#include <stdio.h>

void find_sum_of_top_three(double arr[], int n) {
    
    if (n < 3) {
        printf("Масив повинен містити принаймні три елементи.\n");
        return;
    }

 
    double max1 = -1e9, max2 = -1e9, max3 = -1e9;

  
    for (int i = 0; i < n; i++) {
        if (arr[i] > max1) {
            max3 = max2;
            max2 = max1;
            max1 = arr[i];
        } else if (arr[i] > max2) {
            max3 = max2;
            max2 = arr[i];
        } else if (arr[i] > max3) {
            max3 = arr[i];
        }
    }

    double sum_top_three = max1 + max2 + max3;
    printf("Сума трьох найбільших чисел: %.2f\n", sum_top_three);
}

int main() {
    char choice;
    do {
        int n;
        printf("Введіть кількість елементів масиву: ");
        scanf("%d", &n);

        double arr[n];
        for (int i = 0; i < n; i++) {
            printf("Введіть елемент %d: ", i + 1);
            scanf("%lf", &arr[i]);
        }

        find_sum_of_top_three(arr, n);

        printf("Бажаєте продовжити (1/2)? ");
        scanf(" %c", &choice);
    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
