package seminar_1;
/* Дан массив nums = [3,2,2,3]  и число val = 3
 * Если в массиве есть числа, равные начению val, нужно перенести эти элементы в конец массива
*/

import java.util.*;

public class task_4 {
    public static void main (String [] args) {
        int [] nums = {3, 2, 2, 3};
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            }

    }
}
