package homework_2;

import java.io.FileWriter;
import java.util.Scanner;

// К калькулятору из предыдущего дз добавить логирование.
public class task_4 {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float number_1 = Float.parseFloat(iScanner.nextLine());
        System.out.println("Введите второе число: ");
        float number_2 = Float.parseFloat(iScanner.nextLine());
        System.out.println("Введите знак: ");
        String sign = iScanner.nextLine(); 
        float result = 0;
        iScanner.close();
        FileWriter file = new FileWriter("log_calculator.txt", true);
        switch (sign){
            case "+":
                result = number_1 + number_2;
                break;
            case "-":
                result = number_1 - number_2;
                break;
            case "*":
                result = number_1 * number_2;
                break;
            case "/":
                result = number_1 / number_2;
                break;
            case "^":
                result = (int) Math.pow(number_1, number_2);
                break;   
        }  
        file.write("\n" + number_1 + " " + sign + " " + number_2 + " = " + result);
        file.close();
        }
}
