package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(11, 4, 2);
        assertThat(result, is(11));
    }

    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(12, 14, 12);
        assertThat(result, is(14));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(11, 114, 201);
        assertThat(result, is(201));
    }

    @Test
    public void whenNumbersSame() {
        MultiMax check = new MultiMax();
        int result = check.max(55, 55, 55);
        assertThat(result, is(55));
    }
}