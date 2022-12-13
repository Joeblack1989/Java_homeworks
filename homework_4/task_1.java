package homework_4;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("12");
        list.add("3");
        list.add("7");
       
    
        LinkedList<String> reversed_list= new LinkedList<>();
        for (int index = 0; index < list.size() ; index++) {
            reversed_list.addFirst(list.get(index));
        }
        System.out.println("Исходный список: " + list);
        System.out.println("Развернутый список: " + reversed_list);
    }
}