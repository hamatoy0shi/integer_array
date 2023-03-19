package ru.mtsbank.lesson.four;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1,0,25,7,-4,10,5,8};
        int sum = 0;

        for (int value : array){
            if (value%2 == 0)
                sum += value;
        }

        System.out.println("Сумма чётных элементов массива: " + sum);

    }

}
