package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void usualPositiveTest() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void closeToRange() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSQR(100, 101);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void noSquareRoots() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSQR(90, 99);

        Assertions.assertEquals(expected, actual);
    }
}
