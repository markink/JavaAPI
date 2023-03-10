//Реализуйте алгоритм сортировки
//пузырьком числового массива (введён вами),
//результат после каждой итерации
//(после перемещения числа) запишите в лог-файл.

package lesson2.homework.task1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task1 {

    public static void writeLog (int value){
        String str = Integer.toString(value);
        try {
            FileWriter fileWriter = new FileWriter("src/lesson2/homework/task1/log.txt", true);
            fileWriter.write(str);
            fileWriter.write(System.lineSeparator());
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи");
        }
    }

    public static int[] sortArray(int [] array) throws IOException {
        boolean isSorted = false;
        int [] newArray = array;
        int buf;
        while (isSorted == false) {
            isSorted = true;
            System.out.println(Arrays.toString(newArray));
            for (int i = 0; i < newArray.length-1; i++) {
                if (newArray[i] > newArray [i+1]) {
                    isSorted = false;
                    buf = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = buf;
                    System.out.println(newArray[i]);
                    writeLog(newArray[i]);
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        return array;
    }


    public static void main(String[] args) throws IOException {
        int [] array = {11, 3, 14, 16, 7};
        int [] secondArray = sortArray(array);
    }
}
