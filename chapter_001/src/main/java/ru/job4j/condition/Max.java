package ru.job4j.condition;

/**
 * Программа для определенич максимального числа.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Метод для определенич максимального числа из двух чисел.
     * @param left первое число.
     * @param right второе число.
     * @return максимальное число.
     */
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    /**
     * Метод определения максимального из трех чисел.
     * @param num1 первое число.
     * @param num2 второе число.
     * @param num3 третье число.
     * @return максимальное из заданных чисел.
     */
    public int max(int num1, int num2, int num3) {
        return max(num1, max(num2, num3));
    }

    /**
     * Метод определения максимального из четырех чисел.
     * @param num1 первое число.
     * @param num2 второе число.
     * @param num3 третье число.
     * @param num4 четвертое число.
     * @return максимальное из заданных чисел.
     */
    public int max(int num1, int num2, int num3, int num4) {
        return max(num1, max(num2, num3, num4));
    }
}
