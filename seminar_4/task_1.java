package seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

public class task_1 {
    public static void main(String[] args) {
        Scanner user_string = new Scanner(System.in);
        String s = user_string.next();
        String[] text = new String[2];
        LinkedList<String> text_nw = new LinkedList<>();
        while (!s.equals("end")) {
            text = s.split("~");
            int pos_num = Integer.parseInt(text[1]);
            if (text[0].equals("print")) {
                System.out.println(text_nw.get(pos_num));
                text_nw.remove(pos_num);
            } else {
                text_nw.add(pos_num, text[0]);
                System.out.println(text_nw);
            }
            s = user_string.next();
        }
        System.out.println(text_nw);
    } 
}
