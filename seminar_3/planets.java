// 1. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
// 2. Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class planets {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Нептун");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Плутон");
        ArrayList<String> new_planets = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int f = random.nextInt(0, 9);
            new_planets.add(planets.get(f));
        }
        System.out.println(new_planets);
        int count = 0;
        for (int i = 0; i < planets.size(); i++) {
            count = 0;
            for (int j = 0; j < planets.size(); j++) {
                if (planets.get(i).equals(new_planets.get(j))) {
                    count += 1;
                }
            if (count > 1) {
                new_planets.remove(j);
            }
            }
            System.out.println(planets.get(i) + " встречается " + count + " раз");
        }
    }
}
