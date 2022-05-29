import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "nagaram";
        String t = "anagram";
        System.out.println(anagram(s,t));
    }

    private static boolean anagram(String s, String t) {
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int i = 0;
        if(s.length()!=t.length()) return false;
        while(i<s.length()) {
            if(c1[i]!=c2[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
