import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

public class task_sort {
    public static void main (String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(100);
        for (int i = 0; i <10; i++) {
            arrlist.add(new Random().nextInt(100));
        }
        System.out.println(arrlist);
        Collections.sort(arrlist);
        System.out.println(arrlist);

    }
}
