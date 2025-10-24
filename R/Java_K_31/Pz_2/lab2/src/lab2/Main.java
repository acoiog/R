package lab2;

public class Main {
    public int sumIndicesMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Масив не може бути null або порожнім");
        }
        int maxIdx = 0;
        int minIdx = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }
        return maxIdx + minIdx;
    }

    public void printResults() {
        int[] arr = {5,10,150,3,0};  // Порожній для тесту
        try {
            int sum = sumIndicesMaxMin(arr);
            System.out.println("Масив: " + java.util.Arrays.toString(arr));
            System.out.println("Сума індексів максимального та мінімального елементів: " + sum);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
            System.out.println("Масив невалідний — використовуйте непорожній!");
        }
    }
    public static void main(String[] args) {
        Main program = new Main();
        program.printResults();
    }
}