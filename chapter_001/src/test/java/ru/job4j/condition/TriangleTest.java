package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author Калугин Дмитрий (kdn7777777@gmail.com)
 * @version 1
 * @since 06.07.2019
 */
public class TriangleTest {
    /**
     * Тест.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(2, 0);
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(point1, point2, point3);
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}
