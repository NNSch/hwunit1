package ru.netology.service;

//import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testCashbackHackEquivalence() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testCashbackHackUpThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int actual = service.remain(amount);
        int expected = 50;

        assertEquals(actual, expected);

    }
    @org.testng.annotations.Test
    public void testCashbackHackThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void TestCashbackHackOverThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

}