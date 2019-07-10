package ru.job4j.array;
/**
 * Программа для зеркального переворота массива.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Turn {
    /**
     * Метод переворачивает массив.
     * @param array массив, который необходимо перевернуть.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }
}