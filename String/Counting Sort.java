import java.util.Scanner;

public class CountingSort {
    void sort(char[] s) {
        int[] count = new int[256];
        char[] ch = s;
        char[] output = new char[s.length];
        for (int i = 0; i < 256; i++) {
            count[i] = 0;
        }
        for (int i = 0; i <s.length; i++) {
            count[ch[i]]++;
        }
        for (int i = 0,k=0; i < 256; i++) {
            if(count[i]>0) {
                for(int j=0;j<count[i];j++) {
                    output[k++] = (char)i;
                }
            }
        }
        System.out.println(output);
        for (int i = 0; i < s.length; i++) {
            s[i] = output[i];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        CountingSort ob = new CountingSort();
        char[] ch = new char[n];
        for (int i = 0; i < n; i++) {
            ch[i] = in.next().charAt(0);
        }
        ob.sort(ch);
        for(char c:ch) System.out.print(c);
    }
}
