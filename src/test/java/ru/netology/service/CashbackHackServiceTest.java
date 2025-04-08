package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
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