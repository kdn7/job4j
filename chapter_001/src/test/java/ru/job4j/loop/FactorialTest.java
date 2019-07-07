package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
    /**
     * Тест
     * Проверяется что факториал числа 5 равен 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    /**
     * Тест
     * Проверяется что факториал 0 равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}