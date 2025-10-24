package lab1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    public static final double EPS = 1e-6; 

    public MainTest() {} 

    @BeforeClass
    public static void setUpClass() throws Exception {}  

    @AfterClass
    public static void tearDownClass() throws Exception {}  

    // ТЕСТИ ДЛЯ countLessThanSeven (рахунок <7)

    @Test
    public void testCountZvichaynyy() {
        System.out.println("Тест: countLessThanSeven({1,6,7,8,-1,0})");
        int[] arr = {1, 6, 7, 8, -1, 0};
        Main instance = new Main();
        int expected = 4;
        int actual = instance.countLessThanSeven(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCountVsiVeliki() {
        System.out.println("Тест: countLessThanSeven({7,8,100})");
        int[] arr = {7, 8, 100};
        Main instance = new Main();
        int expected = 0;
        int actual = instance.countLessThanSeven(arr);
        assertEquals(expected, actual);
    }


    @Test
    public void testCountVsiMali() {
        System.out.println("Тест: countLessThanSeven({-100,0,6,-50,3})");
        int[] arr = {-100, 0, 6, -50, 3};
        Main instance = new Main();
        int expected = 5;
        int actual = instance.countLessThanSeven(arr);
        assertEquals(expected, actual);
    }

    // ТЕСТИ ДЛЯ productBetweenZeros (добуток між 0)


    @Test
    public void testProductZvichaynyy() {
        System.out.println("Тест: productBetweenZeros({1,0,2,3,0,4})");
        int[] arr = {1, 0, 2, 3, 0, 4};
        Main instance = new Main();
        double expected = 6.0;
        double actual = instance.productBetweenZeros(arr);
        assertEquals(expected, actual, EPS);
    }

    // Нулі поруч: {1,0,0,2} — очікуємо 1.0
    @Test
    public void testProductNuliPoruch() {
        System.out.println("Тест: productBetweenZeros({1,0,0,2})");
        int[] arr = {1, 0, 0, 2};
        Main instance = new Main();
        double expected = 1.0;
        double actual = instance.productBetweenZeros(arr);
        assertEquals(expected, actual, EPS);
    }

    //>2 нулів: {1,0,2,3,4,0,5,0} — очікуємо 24.0 (2*3*4, перші два).
    @Test
    public void testProductBahatoNuliv() {
        System.out.println("Тест: productBetweenZeros({1,0,2,3,4,0,5,0})");
        int[] arr = {1, 0, 2, 3, 4, 0, 5, 0};
        Main instance = new Main();
        double expected = 24.1;
        double actual = instance.productBetweenZeros(arr);
        assertEquals(expected, actual, EPS);
    }

    // Один нуль: {1,2,3,0} — очікуємо 0.0 (виняток: менше двох нулів)
    @Test
    public void testProductOdinNul() {
        System.out.println("Тест: productBetweenZeros({1,2,3,0})");
        int[] arr = {1, 2, 3, 0};
        Main instance = new Main();
        double expected = 1.0;
        double actual = instance.productBetweenZeros(arr);
        assertEquals(expected, actual, EPS);
    }

    //Без нулів: {1,2,3} — очікуємо 0.0 (виняток: менше двох нулів)
    @Test
    public void testProductBezNuliv() {
        System.out.println("Тест: productBetweenZeros({1,2,3})");
        int[] arr = {1, 2, 3};
        Main instance = new Main();
        double expected = 1.0;
        double actual = instance.productBetweenZeros(arr);
        assertEquals(expected, actual, EPS);
    }

    
    }
