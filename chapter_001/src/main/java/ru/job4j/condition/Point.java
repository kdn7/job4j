package ru.job4j.condition;

/**
 * Программа для расчета расстояния между двумя точками в системе координат.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Point {
    /**
     * Метод для расчета расстояния между двумя точками в системе координат.
     *
     * @param x1 координаты первой точки по оси x.
     * @param y1 координаты первой точки по оси y.
     * @param x2 координаты второй точки по оси x.
     * @param y2 координаты второй точки по оси y.
     * @return расстояние между первой и второй точкой.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}