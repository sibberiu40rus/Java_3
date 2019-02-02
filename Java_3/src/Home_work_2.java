
import java.util.ArrayList;
import java.util.Arrays;


public class Home_work_2 {
    public static void main(String[] args) {
        String[] words = {"a","b","c","d","e","f"};
        ArrayList<String> symbols = new ArrayList<>();

        //первый вариант

        symbols.addAll(Arrays.asList(words));

        //arrToList(words, symbols);
        System.out.println(symbols);

    }

    // второй вариант

    public static void arrToList (String[] str, ArrayList<String> arrList) {
        for (int i = 0; i < str.length; i++) {
            arrList.add(str[i]);
        }
    }
}
