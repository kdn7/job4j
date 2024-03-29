package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Программа для расчета расстояния между двумя точками в системе координат.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Point {

    private final int x;
    private final int y;
    private int z;

    /**
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * @param x координата x.
     * @param y координата y.
     * @param z координата z.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Метод рассчитывает расстояние между до другой точки.
     * @param that точка, до которой нужно посчитать расстояние.
     * @return расстояние.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод рассчитывает расстояние между до другой точки в трехмерном пространстве.
     * @param that точка, до которой нужно посчитать расстояние.
     * @return расстояние.
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    /**
     * Вывод информации - показывает координать точки.
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}