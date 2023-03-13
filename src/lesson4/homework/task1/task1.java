//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод(не void), который вернет “перевернутый” список.
package lesson4.homework.task1;

import java.util.Arrays;
import java.util.LinkedList;

public class task1 {

    private static LinkedList <Integer> reverseLinkedList (LinkedList<Integer> linkedList) {
        LinkedList <Integer> newLinkedList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            newLinkedList.addLast(linkedList.get(linkedList.size()-i-1));
        }
        return newLinkedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> reverseLl = reverseLinkedList(ll);
        System.out.println(reverseLl);
    }

}
