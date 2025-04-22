package ru.netology.service; // Указываем пакет

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; // Импортируем аннотацию Test
import static org.junit.jupiter.api.Assertions.*; // Импортируем статические методы для ассертов

class CashbackHackServiceTest { // Определяем класс тестов

    @Test // Указываем, что это тестовый метод
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected =100;
        assertEquals(expected, actual);
       // Assertions Assert;
       //Assert.assertEquals(service.remain(900), 100);
        //Assert.assertEquals(service.remain(1000), 0);
        //Assert.assertEquals(service.remain(1100), 900);

    }
}