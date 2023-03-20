package ru.mtsbank.lesson.four;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1, 0, 25, 7, -4, 10, 5, 8};

        System.out.println("Сумма чётных элементов массива: " + Arrays.stream(array).filter(i -> i % 2 == 0).sum());
    }

}
