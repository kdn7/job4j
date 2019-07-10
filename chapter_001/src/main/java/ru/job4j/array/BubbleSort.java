package ru.job4j.array;
/**
 * Сортировка массива.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class BubbleSort {
    /**
     * Метод сортирует массив пузырьковым методом.
     * @param array массив, который необходимо рассортировать.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length - i; j++) {
                if(array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
