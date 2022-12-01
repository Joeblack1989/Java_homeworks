public class task_2 {
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 0, 1, 1};
        int count = 0;
        int elem = 1;
        int max_count_1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                count++;
                if (max_count_1 < count) {
                    max_count_1 = count;
                }
            } 
            else {
                count = 0;
            } 
        }
        System.out.println(count);
    }
}
