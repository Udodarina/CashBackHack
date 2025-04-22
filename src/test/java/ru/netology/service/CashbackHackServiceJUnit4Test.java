package ru.netology.service; // Указываем пакет

import org.junit.Test; // Импортируем аннотацию Test
import static org.junit.Assert.*; // Импортируем статические методы для ассертов

public class CashbackHackServiceJUnit4Test {
    // Определяем класс тестов
    @Test // Указываем, что это тестовый метод
    public void testRemain() {
        CashbackHackService service = new CashbackHackService(); // Создаем экземпляр сервиса
        assertEquals(100, service.remain(900)); // Проверяем, что нужно докупить 100
        assertEquals(0, service.remain(1000)); // Проверяем, что нужно докупить 0
        assertEquals(900, service.remain(1100)); // Проверяем, что нужно докупить 900
    }
}