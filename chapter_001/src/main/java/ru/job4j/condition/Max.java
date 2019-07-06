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
}
