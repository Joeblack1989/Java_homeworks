package seminar_1;

import java.text.Format;
import java.util.Scanner;
import java.util.Formatter;

public class privet {

    public privet() {
        Hello();
    }

    public void Hello() { 
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет, " + name);
        scan.close();
    }
}

