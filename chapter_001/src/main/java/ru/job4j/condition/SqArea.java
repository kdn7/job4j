package ru.job4j.condition;
/**
 * Программа для расчета площади прямоугольника по заданным параметрам.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class SqArea {
    /**
     * Метод для расчета площади прямоугольника по периметру и отношению ширины к высоте.
     * @param p периметр.
     * @param k отношение ширины к высоте.
     * @return площадь.
     */
    public int square(int p, int k) {
        int w = p / (2 + 2 * k);
        return w * w * k;
    }
}
