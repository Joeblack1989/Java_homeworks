package homework_3;

import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее 
// из этого списка
public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> new_list = new ArrayList<Integer>();
        new_list.add(78);
        new_list.add(2);
        new_list.add(2);
        new_list.add(4);
        new_list.add(5);
        new_list.add(6);
        new_list.add(7);
        Collections.sort(new_list);
        System.out.println(new_list);
        System.out.println(Collections.max(new_list));
        System.out.println(Collections.min(new_list));
        int sum =0;
        for (int i = 0; i < new_list.size(); i++) {
            sum += new_list.get(i);
        }
        System.out.println(Double.valueOf(sum)/2);
    }

}