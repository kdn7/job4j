package ru.job4j.loop;
/**
 * Программа для расчета факториала.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Factorial {
    /**
     * Метод считает факториал заданного числа.
     * @param n число, от которого нужно посчитать факториал.
     * @return факториал.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}