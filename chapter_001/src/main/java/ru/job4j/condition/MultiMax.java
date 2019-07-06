package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if(result < second) result = second;
        if(result < third) result = third;
        return result;
    }
}