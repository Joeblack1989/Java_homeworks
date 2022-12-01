package seminar_2;

import java.util.Scanner;

public class task_1 {
    public static void main(String [] args) {
        Scanner ns = new Scanner(System.in);
        int n = ns.nextInt();
        String c1 = ns.next();
        String c2 = ns.next();
        ns.close();
        // String c1 = "f";
        // String c2 = "t";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i +=2) {
            s.append(c1+c2);
        }
        System.out.println(s);
    }
}
