#include <stdio.h>
#include <math.h>

// Функція для обчислення відстані між двома точками
float відстань(float x1, float y1, float x2, float y2) {
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

int main() {
    
    float x1 = 0, y1 = 0, x2 = 0, y2 = 3, x3 = 4, y3 = 0;

    // Обчислення сторін трикутника
    float a = відстань(x1, y1, x2, y2);
    float b = відстань(x2, y2, x3, y3);
    float c = відстань(x3, y3, x1, y1);

    // Обчислення периметра
    float периметр = a + b + c;

    // Обчислення площі за формулою Герона
    float s = периметр / 2; 
    float площа = sqrt(s * (s - a) * (s - b) * (s - c));

    printf("Периметр трикутника: %.2f\n", периметр);
    printf("Площа трикутника: %.2f\n", площа);

    return 0;
}
