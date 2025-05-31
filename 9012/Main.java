import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            boolean valid = true;
            for (char c : br.readLine().toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    try {
                        stack.pop();
                    } catch (EmptyStackException e) {
                        valid = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                valid = false;
            }

            if (valid) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}
