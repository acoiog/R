#include <stdio.h>

int main() {
    int num1, num2;

    
    printf("Введення двох чисел: ");
    scanf("%d %d", &num1,&num2);


    // 1
    int sum_cubed = (num1 * num1 * num1) + (num2 * num2 * num2);
    printf("Сума чисел у кубі: %d\n", sum_cubed);

    // 2
    float division_result = (float)num2 / num1;
    printf("Результат ділення другого числа на перше: %.2f\n", division_result);

    // 3
    int product = num1 * num2;
    printf("Добуток чисел: %d\n", product);

    return 0;
}
