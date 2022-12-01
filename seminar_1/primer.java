
package seminar_1;

import java.time.LocalDateTime;

public class primer {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World");
        String a = "Пока, мир!";
        System.out.println(a);
        int b = LocalDateTime.now().getHour();
        b = b+5;
        System.out.println(b);
        System.out.println(LocalDateTime.now().getHour());
        int c [] = new int []{1,2,3,4,5};
        System.out.printf("%d %d %d %d %d", c[0], c[1], c[2], c[3], c[4]);
    }
}