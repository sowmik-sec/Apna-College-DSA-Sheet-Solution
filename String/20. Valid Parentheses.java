import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(help(s));
    }

    private static boolean help(String s) {
        Stack<Character> st = new Stack<>();
        boolean ahs = true;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[') {
                st.push(c);
            }
            else if(c==')' && !st.empty() && st.peek()=='(') {
                st.pop();
            }
            else if(c=='}' && !st.empty() && st.peek()=='{') {
                st.pop();
            }
            else if(c==']' && !st.empty() && st.peek()=='[') {
                st.pop();
            }
            else {
                ahs = false;
            }
        }
        if(!ahs || !st.empty()) return false;
        return true;
    }
}
