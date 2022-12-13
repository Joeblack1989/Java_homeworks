package seminar_6;

import java.util.HashSet;
import java.util.Random;

// Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class task_1 {
    public static void main(String[] args) throws Exception {
        Integer [] massive = new Integer [1000];
        Random random = new Random();
        for (int index = 0; index < massive.length; index++) {
            massive[index] = random.nextInt(0,25);
        }
        System.out.println(massive); // выводится ссылка на первый элемент
        HashSet<Integer> set_massive = new HashSet<>(); // сам Set -родитель, поэтому лучше что-то конкретное
        for (int index = 0; index < massive.length; index++) {
            set_massive.add(massive[index]);
        }
        System.out.println(set_massive); // выводится нормально
        Float procent = ((float)set_massive.size()/massive.length * 100);
        System.out.println(procent + "%");
    }
}
