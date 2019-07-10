package ru.job4j.array;
/**
 * Таблица умножения.
 *
 * @author Дмитрий Калугин (kdn7777777@gmail.com).
 */
public class Matrix {
    /**
     * Метод строит матрицу в виде таблицы умножения.
     * @param size размер матрицы.
     * @return матрица, состоящая из массивов, в которых элемент равен произведению его порядкового номера на
     * порядковый номер массива, в котором он находится.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }
}
