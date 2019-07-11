package ru.job4j.array;
/**
 * Сравнение значений в матрице по диагонали.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class MatrixCheck {
    /**
     * Метод проверяет равенство значений в матрице по диагонали (значения в различных диагоналях могут быть различны).
     * @param data матрица где необходимо сравнить диагонали.
     * @return true если значения равны, false - нет.
     */
    public boolean mono(boolean[][] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0][0] != data[i][i]) return false;
            if (data[data.length - 1][data.length - 1] != data[data.length - 2 - i][data.length - 2 - i]) return false;
        }
        return true;
    }
}