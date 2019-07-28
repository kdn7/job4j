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
    @Test
    public void whenMax1To2To3Then3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax4To2To3Then4() {
        Max max = new Max();
        int result = max.max(4, 2, 3);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax100To33To1Then100() {
        Max max = new Max();
        int result = max.max(100, 33, 1);
        assertThat(result, is(100));
    }
    @Test
    public void whenMax12To12To12Then12() {
        Max max = new Max();
        int result = max.max(12, 12, 12);
        assertThat(result, is(12));
    }
    @Test
    public void whenMax1To2To3To4Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax4To2To5To3Then5() {
        Max max = new Max();
        int result = max.max(4, 2, 5, 3);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax10To33To11To4Then33() {
        Max max = new Max();
        int result = max.max(10, 33, 11, 4);
        assertThat(result, is(33));
    }
    @Test
    public void whenMax12To12To12To12Then12() {
        Max max = new Max();
        int result = max.max(12, 12, 12, 12);
        assertThat(result, is(12));
    }
    @Test
    public void whenMax3To1To2To3Then3() {
        Max max = new Max();
        int result = max.max(3, 1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax7To4To2To3Then7() {
        Max max = new Max();
        int result = max.max(7, 4, 2, 3);
        assertThat(result, is(7));
    }
    @Test
    public void whenMax101To100To33To1Then101() {
        Max max = new Max();
        int result = max.max(101, 100, 33, 1);
        assertThat(result, is(101));
    }
    @Test
    public void whenMax12To12To12To1Then13() {
        Max max = new Max();
        int result = max.max(12, 12, 12, 13);
        assertThat(result, is(13));
    }
}