package ru.job4j.loop;

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
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int width;
        width = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != width; column++) {
                // если строка равна ячейке, то рисуем галку.
                // в данном случае строка определяет, сколько галок будет в строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
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
        StringBuilder screen = new StringBuilder();
        int width;
        width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= width- column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
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
        StringBuilder screen = new StringBuilder();
        int width= 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
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