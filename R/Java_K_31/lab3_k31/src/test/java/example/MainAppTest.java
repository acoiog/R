package example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainAppTest {
    @Test
    @DisplayName("Об'єм: a=1, b=2, c=3 → V=6")
    void testVolume() {
        assertEquals(6.0, ParallelepipedTab.calculateVolume(1, 2, 3), 0.001);
    }

    @Test
    @DisplayName("Площа: a=1, b=2, c=3 → S=22")
    void testSurfaceArea() {
        assertEquals(22.0, ParallelepipedTab.calculateSurfaceArea(1, 2, 3), 0.001);
    }


    @Test
    @DisplayName("Невалідний маршрут")
    void testInvalidRoute() {
        assertEquals("Невірний номер маршруту (1-9)", TramRouteTab.getRouteInfo(10));
    }

    // Решта case для 100% покриття
    @Test void testRoute2() { assertEquals("Початкова: Центр → Кінцева: Вокзал", TramRouteTab.getRouteInfo(2)); }
    @Test void testRoute3() { assertEquals("Початкова: Вокзал → Кінцева: Парк", TramRouteTab.getRouteInfo(2)); }
    @Test void testRoute5() { assertEquals("Початкова: Ринок → Кінцева: Університет", TramRouteTab.getRouteInfo(5)); }
    @Test void testRoute6() { assertEquals("Початкова: Університет → Кінцева: Стадіон", TramRouteTab.getRouteInfo(6)); }
    @Test void testRoute7() { assertEquals("Початкова: Стадіон → Кінцева: Госпіталь", TramRouteTab.getRouteInfo(6)); }
    @Test void testRoute8() { assertEquals("Початкова: Госпіталь → Кінцева: Аеропорт", TramRouteTab.getRouteInfo(8)); }
    @Test void testRoute9() { assertEquals("Початкова: Аеропорт → Кінцева: Депо", TramRouteTab.getRouteInfo(9)); }
}