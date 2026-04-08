import java.io.*;
import java.util.Scanner;

public class Lab5_Task3_Variant11 {

    public static void main(String[] args) {
        System.out.println("Лабораторна робота №5. Завдання 3");
        System.out.println("Варіант 11 (а + б):");
        System.out.println("а) Підрахунок кількості слів у кожному реченні");
        System.out.println("б) Виведення найдовшого речення");
        System.out.println("Програма читає текст з файлу input.txt");
        System.out.println("Результат записується у файл output.txt");

        processTask();

        System.out.println("\nПрограма завершена.");
    }

    private static void processTask() {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        if (!inputFile.exists()) {
            System.out.println("Файл input.txt не знайдено в поточній папці!");
            return;
        }

        StringBuilder fullText = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                fullText.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Помилка читання файлу input.txt: " + e.getMessage());
            return;
        }

        String text = fullText.toString().trim();

        if (text.isEmpty()) {
            System.out.println("Файл input.txt порожній!");
            return;
        }

        String[] sentences = text.split("[.!?]+");

        int maxWords = 0;
        String longestSentence = "";

        StringBuilder result = new StringBuilder();
        result.append("Результати аналізу тексту:\n");

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i].trim();
            if (sentence.isEmpty()) continue;

            String[] words = sentence.split("\\s+");
            int wordCount = words.length;

            result.append(String.format("Речення %d (%d слів): %s%n",
                    i + 1, wordCount, sentence));

            if (wordCount > maxWords) {
                maxWords = wordCount;
                longestSentence = sentence;
            }
        }

        result.append("Найдовше речення (" + maxWords + " слів):\n");
        result.append(longestSentence + "\n");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(result.toString());
            System.out.println("Результати успішно записані у файл output.txt");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл output.txt: " + e.getMessage());
        }
        System.out.println("\n" + result.toString());
    }
}