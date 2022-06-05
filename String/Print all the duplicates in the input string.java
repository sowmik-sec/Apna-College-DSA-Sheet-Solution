import java.util.Scanner;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        duplicates(s);
    }

    private static void duplicates(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if(count[i]>0) {
                System.out.println((char)i+", count = "+count[i]);
            }
        }
    }
}