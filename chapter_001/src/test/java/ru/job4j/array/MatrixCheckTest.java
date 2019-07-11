package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheckTest {
    /**
     * Тест.
     * Матрица х3 вернет истину.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Тест.
     * Матрица х3 вернет ложь.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Тест.
     * Матрица х6 (четная, не пересекается в центре, значеная по диагонали различные) вернет истину.
     */
    @Test
    public void whenDataNotMonoByFalseThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, false, false, false, false, true},
                {false, false, true, false, true, false},
                {true, false, false, true, false, false},
                {true, false, true, false, false, false},
                {false, true, true, false, false, false},
                {true, false, false, false, false, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Тест.
     * 1 элемент вернет истину.
     */
    @Test
    public void whenDataNotMonoByOneElementThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Тест.
     * Матрица х2 вернет ложь.
     */
    @Test
    public void whenDataNotMonoByTwoEementThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {true, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
