package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    /**
     * Тест.
     * Сортировка массива из 10 элементов.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] array = {6, 10, 1, 5, 8, 7, 3, 9, 2, 4}, arrayExpect = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = sort.sort(array);
        assertThat(result, is(arrayExpect));
    }

    /**
     * Тест.
     * Сортировка массива из 14 элементов.
     */
    @Test
    public void whenSortArrayWithFourteenElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] array = {6, -1, 10, -3, 1, 5, 8, 7, -2, 3, 9, 0, 2, 4},
                arrayExpect = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = sort.sort(array);
        assertThat(result, is(arrayExpect));
    }

    /**
     * Тест.
     * Сортировка массива из 2 элементов.
     */
    @Test
    public void whenSortArrayWithTwoElementsThenSortedArray() {
        BubbleSort sort = new BubbleSort();
        int[] array = {6, 2}, arrayExpect = {2, 6};
        int[] result = sort.sort(array);
        assertThat(result, is(arrayExpect));
    }
}
