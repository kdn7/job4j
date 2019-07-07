package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Калугин Дмитрий (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    /**
     * Тест
     * Проверяется доска шириной и высотой 3 клетки.
     * Вывод должен соответствовать:
     * Х Х
     *  Х
     * Х Х
     */
    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }
    /**
     * Тест
     * Проверяется доска шириной и высотой 8 клеток.
     * Вывод должен соответствовать:
     * Х Х Х Х
     *  Х Х Х Х
     * Х Х Х Х
     *  Х Х Х Х
     * Х Х Х Х
     *  Х Х Х Х
     * Х Х Х Х
     *  Х Х Х Х
     */
    @Test
    public void when8x8() {
        Board board = new Board();
        String rsl = board.paint(8, 8);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X X X %s X X X X%sX X X X %s X X X X%sX X X X %s X X X X%sX X X X %s X X X X%s",
                        ln, ln, ln, ln, ln, ln, ln, ln)
                )
        );
    }

}