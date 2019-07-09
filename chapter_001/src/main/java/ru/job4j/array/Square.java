package ru.job4j.array;
/**
 * Программа создания массива квадратов чисел.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Square {
    /**
     * Метод создает массив заданной длины и заполняет его квадратами всех чисел начиная с 1 до длины этого массива.
     *
     * @param bound длина массива.
     * @return массив квадратов чисел.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}