//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

package lesson4.homework.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class task2 {

    private static LinkedList <Integer> enqueue (LinkedList<Integer> linkedList, int element) {
        //enqueue() - помещает элемент в конец очереди,
        linkedList.addLast(element);
        return linkedList;
    }

    private static Integer dequeue (LinkedList<Integer> linkedList) {
//        возвращает первый элемент из очереди и удаляет его,
        int firstElem;
        firstElem = linkedList.poll();
        return firstElem;
    }

    private static Integer first(LinkedList<Integer> linkedList) {
        //возвращает первый элемент из очереди, не удаляя.
        int firstValue = linkedList.get(0);
        return firstValue;
    }


    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4));
        System.out.println(task2.dequeue(ll));
        System.out.println(task2.enqueue(ll, 6));
        System.out.println(task2.first(ll));
        System.out.println(ll);
    }

}
