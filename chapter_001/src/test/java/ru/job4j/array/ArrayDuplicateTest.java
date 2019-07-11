package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    /**
     * Тест.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrDup = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"}, arrayExpect = {"Привет", "Мир", "Супер"};
        String[] result = arrDup.deleteRepeatingEl(array);
        assertThat(result, is(arrayExpect));
    }

    /**
     * Тест.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        ArrayDuplicate arrDup = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер",
                "Мир", "Привет", "Супер", "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Привет", "Супер",
                "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет", "Супер", "Мир",
                "Привет", "Супер", "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет",
                "Мир", "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет", "Супер",
                "Мир", "Привет", "Супер", "Мир", "Мир", "Привет","Мир", "Мир", "Привет", "Супер", "Мир", "Привет",
                "Супер", "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет","Мир",
                "Привет", "Супер", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет", "Супер", "Мир", "Привет", "Супер",
                "Мир", "Мир","Мир", "Привет", "Супер", "Мир", "Привет", "Супер", "Мир", "Мир", "Привет", "Супер", "Мир",
                "Привет", "Супер", "Мир", "Мир", "Супер", "Мир", "Привет"},
                arrayExpect = {"Привет", "Мир", "Супер"};
        String[] result = arrDup.deleteRepeatingEl(array);
        assertThat(result, is(arrayExpect));
    }

    /**
     * Тест.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
        ArrayDuplicate arrDup = new ArrayDuplicate();
        String[] array = {"1", "1", "2", "2", "3"}, arrayExpect = {"1", "3", "2"};
        String[] result = arrDup.deleteRepeatingEl(array);
        assertThat(result, is(arrayExpect));
    }
}
