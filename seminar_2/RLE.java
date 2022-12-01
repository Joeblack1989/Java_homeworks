import java.lang.String;
public class RLE {
    

    public static void main(String[] args){

        String inStr = "SSasdfdfhnjhhhhhjjkjkk";
        String outStr = encodingRLE(inStr);
        System.out.println(inStr);
        System.out.println(outStr);
    }
    public static String encodingRLE(String inputStr) {
        if (inputStr.length() == 0 ){
            return "";
        }
        String resStr = "";
        int count = 1;
        char inChar = inputStr.charAt(0);
        for (int i = 1; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == inChar) {
                count += 1;
            }
            else{
                resStr += count + Character.toString(inChar);
                inChar = inputStr.charAt(i);
                count = 1;
            }
        }
        
        resStr += count + Character.toString(inChar);
        return resStr;
    }
}

