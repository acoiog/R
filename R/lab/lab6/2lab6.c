#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 5  

void generateMatrix(int matrix[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            matrix[i][j] = (rand() % 201) - 100; 
        }
    }
}

void printMatrix(int matrix[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%4d ", matrix[i][j]);
        }
        printf("\n");
    }
}

int isSymmetric(int matrix[N][N]) {
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (matrix[i][j] != matrix[j][i]) {
                return 0; 
            }
        }
    }
    return 1; 
}

int main() {
    char choice;
    srand(time(NULL)); 

    do {
        int matrix[N][N];
        generateMatrix(matrix);

        printf("Згенерована матриця:\n");
        printMatrix(matrix);

        if (isSymmetric(matrix)) {
            printf("Матриця є симетричною відносно головної діагоналі.\n");
        } else {
            printf("Матриця не є симетричною відносно головної діагоналі.\n");
        }

        printf("Бажаєте продовжити (1 - так, 2 - ні)? ");
        scanf(" %c", &choice);
    } while (choice == '1');

    printf("Дякую за користування програмою!\n");

    return 0;
}
