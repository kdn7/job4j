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
    public void whenDataNotMonoByTwoElementThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true},
                {true, false},
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Тест.
     * Матрица х3 вернет ложь.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse2() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {true, true, true},
                {true, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Тест.
     * Матрица х3 вернет ложь.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse3() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {true, true, true},
                {true, true, false}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Тест.
     * Матрица х3 вернет ложь.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse4() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {true, true, true},
                {false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Тест.
     * Матрица х3 вернет ложь.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse5() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {false, true, true},
                {true, true, true},
                {true, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Тест.
     * Матрица х3 вернет истину.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse6() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false, true},
                {false, true, false},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}
