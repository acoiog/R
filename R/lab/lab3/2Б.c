#include <stdio.h>
#include <math.h>

  int main() {
    char choice;

    do {
        int f, r;
        double e;

    printf("Введіть значення f: ");
    scanf("%d", &f);

    printf("Введіть значення r: ");
    scanf("%d", &r);

    if (f == 5) {
        e = 3*f + 2*r;
      printf("Результат: %.2lf\n", e);
    } else if (f == 0) {
        e = sqrt(8*r) / (2*f - 4);
      printf("Результат: %.2lf\n", e);
    } else if (f == -5) {
        e = f*r - 9;
      printf("Результат: %.2lf\n", e);
    }if (f != 5 && f != 0 && f != -5) {
      printf("Неправильне значення f. Будь ласка, введіть ще раз.\n");
  }
      printf("Бажаєте продовжити (1/2)? ");
              scanf(" %c", &choice);
          } while(choice == '1' || choice == '1');

          printf("Дякую за користування програмою!\n");

          return 0;
      }
