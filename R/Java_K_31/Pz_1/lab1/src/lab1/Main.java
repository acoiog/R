package lab1; 

import java.util.Random;  
import java.util.Arrays;  

public class Main {  

    public int countLessThanSeven(int[] arr) {
        int count = 0;  // лічильник для першого завдання
        for (int elem : arr) {  
            if (elem < 7) {  
                count++;  
            }
        }
        return count;  
    }

    public double productBetweenZeros(int[] arr) {  // Знаходимо перший та другий нуль
        int firstZero = -1; 
        int secondZero = -1;  
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == 0) {  
                if (firstZero == -1) {  
                    firstZero = i;  
                } else if (secondZero == -1) {  
                    secondZero = i;  
                    break;  
                }
            }
        }

        if (secondZero == -1) {  // виняток якщо не знайшли два нулі 
            return 1.0;  
        }//добуток
        double prod = 1.0; 
        for (int i = firstZero + 1; i < secondZero; i++) {  
            prod *= arr[i];  
        }
        return prod; 
    }

   
    public void printResults() {//створення масиву 
        Random rand = new Random(); 
        int n = 20;  
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {  
            arr[i] = rand.nextInt(201) - 100;  //[-100;100]
        }
        System.out.println("Масив: " + Arrays.toString(arr));  
        int count = countLessThanSeven(arr);  // Викликаємо  методи
        double prod = productBetweenZeros(arr);  
        System.out.printf("Елементів < 7: %d%n", count);  
        System.out.printf("Добуток між 0: %.0f%n", prod);  
    }

    
    public static void main(String[] args) {
        new Main().printResults(); 
    }
}