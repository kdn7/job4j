package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class FindLoopTest {
    /**
     * Тест.
     * Поиск значения (value) в массиве (input).
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    /**
     * Тест.
     * Поиск значения (value) в массиве (input), в данном тесте заданное значение отсутвтвует в массиве - результат
     * должен быть -1.
     */
    @Test
    public void whenArrayHas55ThenNone() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 55;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    /**
     * Тест.
     * Поиск значения (value) в массиве (input).
     */
    @Test
    public void whenArrayHas15Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 21, 7, 98, 15, 16, 15, 15, 55, 100, 33, 18, 98};
        int value = 15;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
}