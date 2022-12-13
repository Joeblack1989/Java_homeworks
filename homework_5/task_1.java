package homework_5;

import java.util.HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class task_1 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> tb_book = new HashMap<>();
            tb_book.put("Сидоренко Илья", "89165789465, 4785963210, 1478489798");
            tb_book.put("Иванов Сергей", "89165475274, 47875578210, 1253339798");
            tb_book.put("Сергеев Иван", "89165475274");
            System.out.println(tb_book);

        }


}

