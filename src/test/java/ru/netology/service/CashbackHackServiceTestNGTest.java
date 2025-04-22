package ru.netology.service; // Указываем пакет

import org.testng.Assert; // Импортируем Assert из TestNG
import org.testng.annotations.Test; // Импортируем аннотацию Test

public class CashbackHackServiceTestNGTest {
    // Определяем класс тестов
    @Test // Указываем, что это тестовый метод
    public void testRemain() {
        CashbackHackService service = new CashbackHackService(); // Создаем экземпляр сервиса
        Assert.assertEquals(service.remain(900), 100); // Проверяем, что нужно докупить 100
        Assert.assertEquals(service.remain(1000), 0); // Проверяем, что нужно докупить 0
        Assert.assertEquals(service.remain(1100), 900); // Проверяем, что нужно докупить 900
    }
}
