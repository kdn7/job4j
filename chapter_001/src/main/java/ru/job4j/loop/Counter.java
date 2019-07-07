package ru.job4j.loop;
/**
 * Программа для расчета суммы всех четных чисел в заданном диапазоне.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Counter {
    /**
     * Метод рассчитывает сумму всех четных чисел в диапазоне от start до finish включительно.
     * @param start первое число диапазона.
     * @param finish последнее число диапазона.
     * @return сумма всех четных чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for(int i = start; i <= finish; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }
}
