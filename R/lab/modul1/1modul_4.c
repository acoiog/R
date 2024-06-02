#include <stdio.h>

int main() {
    int number;
    char choice;

    do {
        
        printf("Введіть ціле число: ");
        scanf("%d", &number);

        
        if (number % 2 == 0) {
            printf("Число %d є парним.\n", number);
        } else {
            printf("Число %d є непарним.\n", number);
        }

        
        printf("Бажаєте продовжити (1 - так, 2 - ні)? ");
        scanf(" %c", &choice);
    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
