package DWITE.Year_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class R2_All_Is_Balanced {
    public static void main(String[] args) throws IOException {
        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String str = user.readLine();
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (!stack.empty() && (c == ')' && stack.peek() =='(') || (c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else if (c == ')' || c == ']' || c == '}') {
                    stack.push(c);
                    break;
                }
            }

            if (stack.empty()) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }
        }
    }
}
