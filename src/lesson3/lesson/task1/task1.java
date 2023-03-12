package lesson3.homework.task1;

import java.util.ArrayList;
import java.util.Collection;

public class task1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }

        arrayList.sort(null);
        System.out.println(arrayList);
    }
}
