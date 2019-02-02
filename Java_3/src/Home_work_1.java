/**
 * @version 02.02.2019
 * @autor Martynyuk Alexey
 * Java_3 Lesson_1
 */
public class Home_work_1 {
    public static void main(String[] args) {
        String[] words = {"a","b","c","d","e","f"};
        toString(words);
        changeArr2(words, 2,5);
        System.out.println();
        toString(words);

    }

    //поменяет местами каждые два элемента

    public static void changeArr (String[] str) {
        for (int i = 0; i < str.length; i++) {
            String temp = str[i];
            str[i] = str[++i];
            str[i] = temp;
        }
    }

    //поменяет местами элементы индексы которых переданны в параметрах метода

    public static void changeArr2 (String[] str, int one, int two) {
            String temp1 = str[one];
            str[one] = str[two];
            str[two] = temp1;

    }

    //отображаем массив

    public static void toString (String[] str) {
        for (String s : str) {
            System.out.print(s + ", ");
        }
    }
}
