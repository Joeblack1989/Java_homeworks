package homework_2;

import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class task_2 {
    public static void main(String[] args) throws Exception {
        int[] arr = { 5, 4, 3, 276, 9, 24, 57, -23 };
        FileWriter log = new FileWriter("log_arr.txt");
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    flag = false;
                }
                log.append(Arrays.toString(arr));
                log.append("\n");
            }
        }
        log.close();
    }
}