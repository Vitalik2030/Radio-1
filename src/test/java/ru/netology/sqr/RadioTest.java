package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void testOverMinSetCurrentStation() {
        Radio rad = new Radio();
        rad.setStation(-1);

        int expected = 0;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation() {
        Radio rad = new Radio();
        rad.setStation(5);

        int expected = 5;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testOverMaxSetCurrentStation() {
        Radio rad = new Radio();
        rad.setStation(10);

        int expected = 0;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAfterMaximalStation() {
        Radio rad = new Radio();
        rad.setStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio rad = new Radio();
        rad.setStation(4);

        rad.nextStation();

        int expected = 5;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownLimitPrevStation() {
        Radio rad = new Radio();
        rad.setStation(0);

        rad.prevCurrentStation();

        int expected = 9;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testInLimitPrevStation() {
        Radio rad = new Radio();
        rad.setStation(9);

        rad.prevCurrentStation();

        int expected = 8;
        int actual = rad.getStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpOverLimitVolume() {
        Radio rad = new Radio();
        rad.setVolume(10);

        rad.upCurrentVolume();

        int expected = 10;
        int actual = rad.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpInLimitVolume() {
        Radio rad = new Radio();
        rad.setVolume(0);

        rad.upCurrentVolume();

        int expected = 1;
        int actual = rad.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownOverLimitVolume() {
        Radio rad = new Radio();
        rad.setVolume(0);

        rad.downVolume();

        int expected = 0;
        int actual = rad.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownInLimitVolume() {
        Radio rad = new Radio();
        rad.setVolume(7);

        rad.downVolume();

        int expected = 6;
        int actual = rad.getVolume();

        assertEquals(expected, actual);
    }
}