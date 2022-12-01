public class Palindrome {
    public static void main(String[] args) throws Exception {
        String stringFirst = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(stringFirst));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        char leftSymbol = 0;
        char rightSymbol = 0;
        boolean validleft = false;
        boolean validright = false;

        while (left < right) {
            leftSymbol = str.charAt(left);
            rightSymbol = str.charAt(right);

            if (!Character.isLetterOrDigit(rightSymbol)) {
                right--;
            } else {
                validright = true;
            }
            if (!Character.isLetterOrDigit(leftSymbol)) {
                left++;
            } else {
                validleft = true;
            }
            if (validleft && validright) {
                if (leftSymbol == rightSymbol) {
//                    System.out.println(leftSymbol);
                    right--;
                    left++;
                    validleft = false;
                    validright = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
