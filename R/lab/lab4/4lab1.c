#include <math.h>
#include <stdio.h>

int main() {
  float x, y, result;
  char choice;

  do {
  printf("Введіть значення x: ");
  scanf("%f", &x);
  printf("Введіть значення y: ");
  scanf("%f", &y);

  // Перевірка за допомогою циклу while
  while (fabs(x) <= 2 || x * x + 4 == 0 || x + 2 == 0) {
    printf("Ділення на 0 або вираз має невизначений результат. Введіть інші "
           "значення x: ");
    scanf("%f", &x);
  }

  result = (1 + y) * (x + y / (x * x + 4)) / (exp(-x - 2) + 1 / (x * x + 4));

  printf("Значення функції при x = %.2f та y = %.2f: %.2f\n", x, y, result);

    printf("Бажаєте продовжити (1/2)? ");
            scanf(" %c", &choice);
        } while(choice == '1' || choice == '1');

        printf("Дякую за користування програмою!\n");

        return 0;
    }