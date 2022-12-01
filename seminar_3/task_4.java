// Каталог товаров книжного магазина сохранен 
// в виде двумерного списка List<ArrayList<String>> 
// так, что на 0й позиции каждого внутреннего списка 
// содержится название жанра, а на остальных позициях 
// - названия книг. Напишите метод для заполнения данной структуры.

import java.util.ArrayList;
import java.util.List;


public class task_4 {
    public static void main(String[] args) {
        ArrayList<String> prosa = new ArrayList<>();
        prosa.add("проза");
        prosa.add("Война и мир");
        prosa.add("12 стульев");
        final List<ArrayList<String>> ganres_and_book = new ArrayList<>();
        ganres_and_book.add(prosa);
        System.out.println(prosa);
        System.out.println(ganres_and_book);
        prosa.clear();
        prosa.add("поэзия");
        prosa.add("Черный человек");
        prosa.add("Бородино");
        ganres_and_book.add(prosa);

    }

}
