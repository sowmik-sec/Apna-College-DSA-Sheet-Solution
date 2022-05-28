import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(is_palindrome(s));
    }

    private static boolean is_palindrome(String s) {
        String temp = new String();
        for(int i=0;i<s.length();i++) {
            if(Character.isAlphabetic(Character.toLowerCase(s.charAt(i)))) {
                temp += Character.toLowerCase(s.charAt(i));
            }
            if(Character.isDigit(s.charAt(i))) temp += s.charAt(i);
        }
        int l = 0, r = temp.length()-1;
        while(l<r) {
            if(temp.charAt(l)!=temp.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}
