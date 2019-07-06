package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax4To2Then4() {
        Max max = new Max();
        int result = max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax10To33Then33() {
        Max max = new Max();
        int result = max.max(10, 33);
        assertThat(result, is(33));
    }
    @Test
    public void whenMax12To12Then12() {
        Max max = new Max();
        int result = max.max(12, 12);
        assertThat(result, is(12));
    }
}