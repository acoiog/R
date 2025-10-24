package lab2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Тест загального випадку
     */
    @Test
    public void testSumIndicesMaxMin() {
        System.out.println("sumIndicesMaxMin {5,2,8,1,9}");
        int[] arr = {5, 2, 8, 1, 9};
        Main instance = new Main();
        int expResult = 7;
        int result = instance.sumIndicesMaxMin(arr);
        assertEquals(expResult, result);
    }

    /**
     * Тест випадку з однаковими елементами
     */
    @Test
    public void testSumIndicesMaxMinAllEqual() {
        System.out.println("sumIndicesMaxMin {3,3,3}");
        int[] arr = {3, 3, 3};
        Main instance = new Main();
        int expResult = 0;
        int result = instance.sumIndicesMaxMin(arr);
        assertEquals(expResult, result);
    }

    /**
     * Тест одного елемента
     */
    @Test
    public void testSumIndicesMaxMinSingleElement() {
        System.out.println("sumIndicesMaxMin {10}");
        int[] arr = {10};
        Main instance = new Main();
        int expResult = 0;
        int result = instance.sumIndicesMaxMin(arr);
        assertEquals(expResult, result);
    }

    /**
     * Тест з негативними числами
     */
    @Test
    public void testSumIndicesMaxMinNegative() {
        System.out.println("sumIndicesMaxMin {-1,-5,2}");
        int[] arr = {-1, -5, 2};
        Main instance = new Main();
        int expResult = 3;
        int result = instance.sumIndicesMaxMin(arr);
        assertEquals(expResult, result);
    }

    /**
     * Тест з max/min на початку
     */
    @Test
    public void testSumIndicesMaxMinAtStart() {
        System.out.println("sumIndicesMaxMin {9,1,5,2}");
        int[] arr = {9, 1, 5, 2};
        Main instance = new Main();
        int expResult = 1;
        int result = instance.sumIndicesMaxMin(arr);
        assertEquals(expResult, result);
    }

    /**
     * Тест виводу для порожнього масиву в printResults
     */
    @Test
    public void testPrintResultsEmptyArray() {
        System.out.println("printResults з порожнім масивом");
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        try {
            Main instance = new Main();
            instance.printResults();
        } finally {
            System.setOut(originalOut);
        }
        String output = bos.toString();
    }
}