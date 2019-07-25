package ru.job4j.condition;

/**
 * Программа для расчета площади треугольника.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Triangle {
    Point point1, point2, point3; //координаты вершин.
    double a, b, c; //длины сторон.

    /**
     * Конструктор треугольника по вершинам.
     * @param point1 вершина 1.
     * @param point2 вершина 2.
     * @param point3 вершина 3.
     */
    public Triangle (Point point1, Point point2, Point point3) {
        if (this.calcSideLength(point1, point2, point3)) {
            this.point1 = point1;
            this.point2 = point2;
            this.point3 = point3;
        } else System.out.println("Треугольник с заданными координатами не существует");
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод расчета длин сторон треугольника.
     * @param point1 вершина1.
     * @param point2 вершина2.
     * @param point3 вершина3.
     * @return true - значения присвоены. false - треугольник не может быть построет так как одна из сторон длиннее
     * суммы двух других.
     */
    private boolean calcSideLength (Point point1, Point point2, Point point3) {
        double a = point1.distance(point2);
        double b = point2.distance(point3);
        double c = point1.distance(point3);
        if (this.exist(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            return true;
        } else return false;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return true - треугольник построить можно, false - нельзя.
     */
    private boolean exist(double a, double c, double b) {
        return a < b + c && b < c + a && c < a + b;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - a) * (p - b) * (p - c)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double p = period(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}