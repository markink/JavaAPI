//Пусть дан произвоиьный список целых
// чисел, удалить из него четные числа

package lesson3.homework.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {

    public static ArrayList<Integer> deleteEvenValues(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) {
                arrayList.remove(i--);
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 12, 11, 111, 13, 1, 4, 5, 67, 7, 0, 8));
        task1.deleteEvenValues(arrayList);

        System.out.print("Массив после удаления четных чисел" + arrayList);
    }
}
