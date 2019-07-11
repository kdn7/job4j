package ru.job4j.array;

import java.util.Arrays;
/**
 * Дубликаты в массиве.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class ArrayDuplicate {
    /**
     * Метод удаляет повторяющиеся элементы в массиве.
     * @param array массив, который необходимо проверить на наличие повторяющихся элементов.
     * @return массив без повторяющихся элементов.
     */
    public String[] deleteRepeatingEl(String[] array) {
        int index = 0, count = 0; // count счетчик повторяющихся элементов.
        while(index + count < array.length) {
            for (int i = index + 1; i < array.length - count; i++) {
                if (array[index].equals(array[i])) {
                    String tmp = array[i];
                    array[i] = array[array.length - 1 - count];
                    array[array.length - 1 - count] = tmp;
                    i--;
                    count++;
                }
            }
            index++;
        }
        return Arrays.copyOf(array, array.length - count);
    }
}
