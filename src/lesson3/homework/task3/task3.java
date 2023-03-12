//Дополнительное. Реализовать алгоритм сортировки слияением
//[5, 1, 2, 3, 4]
//[

package lesson3.homework.task3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class task3 {
    public static ArrayList<Integer> newArray (ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(arrayList1);
        arrayList.addAll(arrayList2);
        arrayList.sort(Comparator.naturalOrder());
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<Integer>(Arrays.asList(67, 7, 0, 8));
        ArrayList <Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(10, 12, 11, 111, 13, 1, 4, 5));
        System.out.println("Объеденённый отсортированный массив: " + task3.newArray(arrayList1, arrayList));

    }
}
