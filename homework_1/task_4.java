// *+Задано уравнение вида q + w = e. При q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package homework_1;
import java.util.Scanner;
public class task_4 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String equasion = iScanner.nextLine();
        iScanner.close();
        int x = Integer.parseInt(equasion.substring(11)) -  Integer.parseInt(equasion.substring(6, 7));
        // System.out.println(x);
        if(x < 0){
            int new_x = -x + 2;
            int y = Integer.parseInt(equasion.substring(10, 11)) -  Integer.parseInt(equasion.substring(0, 1)) - 1;
            if(y < 0){
                System.out.println("Решений нет");
            }
            else{
                String result = equasion.substring(0, 1) + new_x + equasion.substring(2, 5) + y + equasion.substring(6);
                System.out.println(result);
            }
        }
        else{
            int y = Integer.parseInt(equasion.substring(10, 11)) -  Integer.parseInt(equasion.substring(0, 1));
            if(y < 0){
                System.out.println("Решений нет");
            }
            else{
                String result = equasion.substring(0, 1) + x + equasion.substring(2, 5) + y + equasion.substring(6);
                System.out.println(result);
            }


        }
    }
}