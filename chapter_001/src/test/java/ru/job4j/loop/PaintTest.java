package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    /**
     * Проверяется построение правой части "пирамиды" с высотой 4.
     * Тест
     */
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        //System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Проверяется построение левой части "пирамиды" с высотой 4.
     * Тест
     */
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        //System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Проверяется построение "пирамиды" с высотой 4.
     * Тест
     */
    @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }

    /**
     * Проверяется построение "пирамиды" с высотой 7.
     * Тест
     */
    @Test
    public void whenPyramid7() {
        Paint paint = new Paint();
        String rst = paint.pyramid(7);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("      ^      ")
                                .add("     ^^^     ")
                                .add("    ^^^^^    ")
                                .add("   ^^^^^^^   ")
                                .add("  ^^^^^^^^^  ")
                                .add(" ^^^^^^^^^^^ ")
                                .add("^^^^^^^^^^^^^")
                                .toString()
                )
        );
    }
}