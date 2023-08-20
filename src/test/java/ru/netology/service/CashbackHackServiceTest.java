package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testCashbackHackService() {

        CashbackHackService service = new CashbackHackService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testCashbackHackUpThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testCashbackHackThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testCashbackHackUpTwoThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);

    }

}