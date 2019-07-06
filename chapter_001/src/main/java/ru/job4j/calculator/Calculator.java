package ru.job4j.calculator;

/**
 * Элементарный калькулятор.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Calculator {

    /**
     * Сложение двух чисел.
     *
     * @param first первое слагаемое.
     * @param second второе слагаемое.
     * @return сумма.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Вычитание одного числа из другого.
     *
     * @param first уменьшаемое.
     * @param second вычитаемое.
     * @return разность.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Операция деления.
     *
     * @param first делимое.
     * @param second делитель.
     * @return отношение.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Умножение двух чисел
     *
     * @param first первый множитель
     * @param second второй множитель
     * @return произведение
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}