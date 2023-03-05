//Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит
//        из чередующихся символов c1 и c2, начиная с c1.

package lesson2.lesson.task1;

public class task1 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int N = 666666;
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < N / 2; i++) {
            newString.append(c1);
            newString.append(c2);
        }
        System.out.println(newString);
//        String chars = Character.toString(c1)+Character.toString(c2);
//
//        String strString = new String();
//        for (int i = 0; i < N/2; i++){
//            strString += c1 + c2;
//        }
//        System.out.println(strString);
    }



}
