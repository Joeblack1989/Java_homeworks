import java.util.HashMap;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class morph {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String str_1 = scan.nextLine();
        char[] m_str_1 = str_1.toCharArray();
        System.out.println("Введите второе слово: ");
        String str_2 = scan.nextLine();
        char[] m_str_2 = str_2.toCharArray();
        Boolean flag = true;
        if(str_1.length() != str_1.length() ){
            flag = false;
        }
        else{
            HashMap<Character, Character> morph = new HashMap<>();
            for (int index = 0; index < m_str_1.length; index++) {
                if(morph.get(m_str_1[index]) != null){
                    if(morph.get(m_str_1[index]) == (m_str_2[index])){ 
                        morph.put(m_str_1[index], m_str_2[index]);
                        System.out.println(morph.get(m_str_1[index]));
                    }
                    else{
                        flag = false;
                    }
                
                }
                else {
                    morph.put(m_str_1[index], m_str_2[index]);
                }
        }
        System.out.println(flag);
}
}
}

