package ru.job4j.loop;
/**
 * Программа для построения "шахматной доски".
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Board {
    /**
     * Метод создает прототип шахматной доски в виде строки при помощи знаков "Х" и " ".
     * @param width ширина доски.
     * @param height высота доски.
     * @return возвращает строку, состоящую из символов "Х", " " и символа переноса строки.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Если сумма индексов четная - пишем "Х", нечетная - пробел.
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}