//Дана строка (получение через обычный
//текстовый файл!!!)
//"фамилия":"Иванов","оценка":"5","предмет":"Математика"
//"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//Написать метод(ы), который распарсит строку и, используя \
// StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.




package lesson2.homework.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task2 {

    public static void parseAndPrint(String input) {
        String[] lines = input.split("\n"); // разбиваем строку на массив строк по символу переноса строки
        for (String line : lines) {
            String[] parts = line.split(","); // разбиваем каждую строку на части по символу ","
            String surname = parts[0].split(":")[1].replace("\"", ""); // получаем фамилию студента
            String grade = parts[1].split(":")[1].replace("\"", ""); // получаем оценку
            String subject = parts[2].split(":")[1].replace("\"", ""); // получаем предмет
            StringBuilder sb = new StringBuilder();
            sb.append("Студент ").append(surname).append(" получил ").append(grade)
                    .append(" по предмету ").append(subject).append(".");
            System.out.println(sb.toString()); // выводим готовую строку
        }
    }

    public static void main(String[] args) throws IOException {
        String firstLine = null;
        try (BufferedReader br = new BufferedReader(new FileReader("src/lesson2/homework/task2/file.txt"))) {
            firstLine = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(firstLine);
        parseAndPrint(firstLine);

    }
}
