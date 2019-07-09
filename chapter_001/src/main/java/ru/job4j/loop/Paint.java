package ru.job4j.loop;

import java.util.function.BiPredicate;


/**
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 * @version $Id$
 * @since 0.1
 */
@SuppressWarnings("ALL")
public class Paint {
    /**
     * Вспомогательный метод для понимания принципа построения "пирамиды". В данном методе реализуется правая часть
     * "пирамиды" вида:
     * ^
     * ^^
     * ^^^
     * ^^^^
     * @param height высота "пирамиды".
     * @return строка, состоящая из "^", пробелов и символа переноса строки, которая должна "нарисовать" правую
     * часть "пирамиды".
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }
    /**
     * Вспомогательный метод для понимания принципа построения "пирамиды". В данном методе реализуется левая часть
     * "пирамиды" вида:
     *    ^
     *   ^^
     *  ^^^
     * ^^^^
     * @param height высота "пирамиды".
     * @return строка, состоящая из "^", пробелов и символа переноса строки, которая должна "нарисовать" левую
     * часть "пирамиды".
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Программа построения "пирамиды" вида:
     *    ^
     *   ^^^
     *  ^^^^^
     * ^^^^^^^
     * по заданной высоте.
     *
     *
     * @param height высота "пирамиды".
     * @return строка, состоящая из "^", пробелов и символа переноса строки, которая должна "нарисовать пирамиду".
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Метод строит "пирамиду" или ее часть в зависимости от переданных в нее данных.
     *
     * @param height высота пирамиды.
     * @param widht ширина пирамиды.
     * @param predict дженерик???))),
     * @return строка, состоящая из "^", пробелов и символа переноса строки, которая должна "нарисовать пирамиду"
     * или ее часть.
     */
    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}