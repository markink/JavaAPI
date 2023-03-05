//Записать в простой
//nекстовый файл слово
//        TEST 10 раз, обработайте исключения.

package lesson2.lesson.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class task4 {
    public static void main(String[] args) {
        String value = "TEST\n";
        writeToText(value);
    }

    public static void writeToText (String value){
        int index = 10;
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            for (int i = 0; i < index; i++) {
                fileWriter.write(value);
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи");
        }
    }

}
