//Напишите метод, который сжимает строку.
//
//
//        Пример: вход aaaabbbcaaadd.
//        результат - a4b3ca3d2


package lesson2.lesson.task1;

public class task2 {
    public static void main(String[] args) {
        String value = "aaaaaaaabbbbbccaddddddda";
        System.out.println(outptResult(value));
    }

    public static StringBuilder outptResult (String value){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < value.length()-1; i++) {
            if (value.charAt(i) == value.charAt(i+1)) {
                count ++;
            } else{
                stringBuilder.append(value.charAt(i));
                if (count != 1) stringBuilder.append(count);
                count = 1;
            }
        }
        stringBuilder.append(value.charAt(value.length()-1));
        if (count != 1) stringBuilder.append(count);
        return stringBuilder;
    }

}
