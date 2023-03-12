//Задан целочисленый список ArrayList. Найти минимальное,
// максимальное и среднее арифметическое из этого писка


package lesson3.homework.task2;

import lesson3.homework.task1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class task2 {

    public static void maxValue(ArrayList<Integer> arrayList){
        System.out.println("Максимальное число равно: " + Collections.max(arrayList));
    }

    public static void minValue(ArrayList<Integer> arrayList){
        System.out.println("Минимальное число равно: " + Collections.min(arrayList));
    }

    public static void averageValue(ArrayList<Integer> arrayList){
        int sum = 0;
        int index = 0;
        for (Integer elements : arrayList ) {
            sum = sum + elements;
            index++;
        }
        try {
            System.out.println("Среднеарифмитическое равно: "+ sum/index);
        } catch (Exception e) {
            System.out.println("Деление на ноль");
        }

    }


    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 12, 11, 111, 13, 1, 4, 5, 67, 7, 0, 8));
        task2.maxValue(arrayList);
        task2.minValue(arrayList);
        task2.averageValue(arrayList);
    }

}
