import java.util.ArrayList;
import java.util.Scanner;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class listik {
    public static void main(String[] args) {
        ArrayList<String> new_List = new ArrayList<>();
        Scanner ad_str = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            new_List.add(ad_str.next());
        }
        System.out.println(new_List);
        int in = 0;

        for (int i = 0; i < new_List.size(); i++) {
            try {
                in = Integer.parseInt(new_List.get(i));
                new_List.remove(i);
            } catch (Exception e) {

            }
        }
        System.out.println(new_List);
        // final ArrayList<Object>  list =new ArrayList<>();

        // list.add("man");
        // list.add(5);
        // Object c = list.get(1);
        // System.out.println(c instanceof Integer);
           
    }

}

