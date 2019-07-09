package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class SquareTest {
    /**
     * Тест.
     * Каждое число до 3 включительно должно быть возведено в квадрат: 1, 4, 9.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }
    /**
     * Тест.
     * Каждое число до 7 включительно должно быть возведено в квадрат: 1, 4, 9, 16, 25, 36, 49.
     */
    @Test
    public void whenBound7Then14916253649() {
        int bound = 7;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49};
        assertThat(rst, is(expect));
    }
    /**
     * Тест.
     * При передачи 0 возвращает пустой массив.
     */
    @Test
    public void whenBound33Then149() {
        int bound = 0;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {};
        assertThat(rst, is(expect));
    }
}