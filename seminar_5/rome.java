import java.util.HashMap;
import java.util.Scanner;

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

public class rome {
    

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        String str = scan.nextLine();
        char[] m_str = str.toCharArray();
        HashMap<Character, Integer> digits = new HashMap<>();
        digits.put('I', 1);
        digits.put('V', 5);
        digits.put('X', 10);
        digits.put('L', 50);
        digits.put('C', 100);
        digits.put('D', 500);
        digits.put('M', 1000);
        int itog = 0;
        for (int index = 0; index < m_str.length - 1; index++) {
            if(digits.get(m_str[index]) < digits.get(m_str[index + 1])){
                itog -= digits.get(m_str[index]);  
            }
        else{
            itog += digits.get(m_str[index]);
        }
        
        System.out.println(itog);

}
itog += digits.get(m_str[m_str.length - 1]);
System.out.println(itog);
}
}