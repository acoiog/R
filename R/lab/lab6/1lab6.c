#include <stdio.h>
#include <limits.h>

int main() {
    char choice;

    do {
        int n, m;

        
        printf("Введіть кількість рядків (n): ");
        scanf("%d", &n);
        printf("Введіть кількість стовпців (m): ");
        scanf("%d", &m);

        int matrix[n][m];

        
        printf("Введіть елементи матриці:\n");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                scanf("%d", &matrix[i][j]);
            }
        }

        int max = INT_MIN;
        int min = INT_MAX;
        int count_max = 0;
        int count_min = 0;

        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        // Підрахунок кількості входжень 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == max) {
                    count_max++;
                }
                if(matrix[i][j] == min) {
                    count_min++;
                }
            }
        }

       
        printf("Максимальний елемент: %d, кількість входжень: %d\n", max, count_max);
        printf("Мінімальний елемент: %d, кількість входжень: %d\n", min, count_min);

        
        printf("Бажаєте продовжити (1 - так, 2 - ні)? ");
        scanf(" %c", &choice);
    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
