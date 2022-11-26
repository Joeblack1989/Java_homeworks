// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

package homework_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        String digit = iScanner.nextLine();
        int n = Integer.valueOf(digit);
        iScanner.close();
        double res = (n * (n + 1)) / 2;
        System.out.println("Треугольное число = " + res);
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал = " + factorial);
    }

}