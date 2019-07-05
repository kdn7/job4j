package ru.job4j.condition;

public class SqArea {
    public int square(int p, int k) {
        int w = p / (2 + 2 * k);
        return w * w * k;
    }
}
