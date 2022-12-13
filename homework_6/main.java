package homework_6;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ

// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main (String[] args) throws Exception {
        notebook laptop1 = new notebook("1D 3A 3F", "8", "126", "15.6", "black", "China");
        notebook laptop2 = new notebook("0D 2C 3F", "8", "512", "15.6", "black", "China");
        notebook laptop3 = new notebook("9N 2C 8H", "16", "126", "15.6", "white", "USA");
        notebook laptop4 = new notebook("1D 2H 5K", "8", "126", "15.6", "black", "Russia");
        List<notebook> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        HashMap<String, String> filter_criteria = new HashMap<>();
        filter_criteria.put("Размер экрана(в дюймах)","15.6");
        filter_criteria.put("Страна-производитель","Russia");
        List<notebook> filtered_list = new ArrayList<>();
        filtered_list = notebook.filter(laptops, filter_criteria);
        System.out.println(filtered_list);

    }

}

