package lesson4.homework.task3;

import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static int intPrompt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String stringPrompt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String calculateValue(int value1, String sign, int value2, LinkedList<Integer> linkedList) {
        if (sign.equals("+")) {
            System.out.println(value1+value2);
            linkedList.add(value1+value2);
            return task3.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"), linkedList);
        } else if (sign.equals("-")) {
            System.out.println(value1 - value2);
            linkedList.add(value1-value2);
            return task3.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"), linkedList);        } else if (sign == "*") {

        } else if (sign.equals("*")) {
            System.out.println(value1*value2);
            linkedList.add(value1*value2);
            return task3.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"), linkedList);
        } else if (sign.equals("/")) {
            try {
                System.out.println(value1/value2);
                linkedList.add(value1/value2);
            } catch (Exception e){
                System.out.println("Деление на ноль");
                return task3.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"), linkedList);
            }
            return task3.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"), linkedList);
        } else if (sign.equals("0")) {
            return "Конец";

        }else if (sign.equals("Отмена")) {
            //Добавили провреку слова "Отмена". В качестве первого значения ередали и удалили последнее значение которое хранилось в linkedList.
            return task3.calculateValue(linkedList.pollLast(),  stringPrompt("Введите знак (0 если хотите выйти)"), intPrompt("Введите 2 значение"), linkedList);

        } else {
            System.out.println("Вы не правильно ввели знак");
            return task3.calculateValue(intPrompt("Введите 1 значение"),  stringPrompt("Введите знак"), intPrompt("Введите 2 значение"), linkedList);
        }
        return "Конец";
    }

    public static void main(String[] args) {
        int inputValue1 = task3.intPrompt("Введите 1 значение");
        String sign = task3.stringPrompt("Введите знак");
        int inputValue2 = task3.intPrompt("Введите 2 значение");
        //К прошлой версии калькулятора добавили linkedList в котором буду храниться овтеты.
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(inputValue1+inputValue2);

        System.out.println(task3.calculateValue(inputValue1, sign, inputValue2, ll));
    }

}