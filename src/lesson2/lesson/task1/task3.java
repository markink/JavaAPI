//Напишите метод, который принимает на
//вход строку (String) и
//определяет является ли строка
//палиндромом (возвращает boolean значение).

package lesson2.lesson.task1;

public class task3 {

    public static void main(String[] args) {
        String value = "А луна канула";
        System.out.println(isTrue(value));
    }

    public static boolean isTrue (String value) {
        value = value.replace(" ", "").toLowerCase();
        for (int i = 0; i < value.length()/2; i++) {
            if (value.charAt(i) != value.charAt(value.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

}
