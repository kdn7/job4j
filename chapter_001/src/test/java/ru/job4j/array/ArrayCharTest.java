package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class ArrayCharTest {
    /**
     * Тест.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    /**
     * Тест.
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }

    /**
     * Тест.
     */
    @Test
    public void whenNotStartWithPrefixThenTrueRu() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Проверка", "Пров");
        assertThat(result, is(true));
    }

    /**
     * Тест.
     */
    @Test
    public void whenNotStartWithPrefixThenTrueRu2() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("_а с ё?", "_а с ё");
        assertThat(result, is(true));
    }

    /**
     * Тест.
     */
    @Test
    public void whenNotStartWithPrefixThenFalseRuEnC() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("c английской с", "с а");
        assertThat(result, is(false));
    }
}
