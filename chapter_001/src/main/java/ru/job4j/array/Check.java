package ru.job4j.array;
/**
 * Программа проверяет являются ли все значения в массиве одинаковыми.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Check {
    /**
     * Метод проверяет являются ли все значения в массиве true или false.
     * @param data массив, который необходимо проверить.
     * @return true, если все значения одинаковые; false, если хотябы одно значение отличается.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if(data[0] != data[i]) result = false;
        }
        return result;
    }
}
