import java.io.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("."))
                break;

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            for (char c : str.toCharArray()) {
                try {
                    if (c == '(' || c == '[') {
                        stack.push(c);
                    } else if (c == ')') {
                        if ('(' != stack.pop()) {
                            isValid = false;
                        }
                    } else if (c == ']') {
                        if ('[' != stack.pop()) {
                            isValid = false;
                        }
                    }
                } catch (EmptyStackException e) {
                    isValid = false;
                }
            }
            isValid = stack.isEmpty() && isValid;
            sb.append(isValid ? "yes\n" : "no\n");
        }
        System.out.print(sb);
        br.close();
    }
}
