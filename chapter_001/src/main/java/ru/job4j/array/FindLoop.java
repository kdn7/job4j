package ru.job4j.array;

/**
 * Программа для поиска в массиве.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class FindLoop {
    /**
     * Метод ищет заданное значение в массиве.
     * @param data массив.
     * @param el значение, которое необходимо найти.
     * @return номер элемента массива либо -1 в случае если заданное значение в массиве отсутствует.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}