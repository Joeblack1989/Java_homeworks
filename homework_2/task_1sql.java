package homework_2;

// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.io.FileReader;
import java.util.Scanner;

public class task_1sql {

    public static void main(String[] args) throws Exception {

        FileReader rd = new FileReader("C:/Users/User/Documents/Учеба Java/homework_2/task_1.json");
        Scanner st = new Scanner(rd);
        String s = st.nextLine();
        st.close();
        rd.close();
        s = s.substring(1, s.length() - 1);
        s = s.replaceAll("\"", "");
        String[] words = s.split(",");
        for (int i = 0; i < words.length; i++) {
            String[] temp = words[i].split(": ");
            if (!temp[1].equals("null")) {
                System.out.println(temp[0] + " and " + temp[1]);
            }
        }
    }

}

