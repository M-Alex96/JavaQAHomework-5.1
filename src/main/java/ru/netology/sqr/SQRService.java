package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int x, int y) {
        int scrAmount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    scrAmount++;
                }
            }
        }
        return scrAmount;
    }
}



