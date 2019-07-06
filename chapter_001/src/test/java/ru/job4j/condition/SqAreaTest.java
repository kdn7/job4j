package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Калугин Дмитрий (kdn7777777@gmail.com)
 * @version 1
 * @since 06.07.2019
 */
public class SqAreaTest {
    /**
     * Test
     */
    @Test
    public void p4k1s1() {
        assertThat(new SqArea().square(4, 1), is(1));
    }

    /**
     * Test
     */
    @Test
    public void p6k2s2() {
        assertThat(new SqArea().square(6, 2), is(2));
    }
}