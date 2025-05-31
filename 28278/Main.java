import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().trim().split(" ");

            switch (command[0]) {
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    sb.append(stack.pop()).append('\n');
                    break;
                case "3":
                    sb.append(stack.size()).append('\n');
                    break;
                case "4":
                    sb.append(stack.size() > 0 ? 0 : 1).append('\n');
                    break;
                case "5":
                    sb.append(stack.peep()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }
}

class Stack {
    private final int[] s = new int[1_000_000];
    private int loc = -1;

    void push(int x) {
        s[++loc] = x;
    }

    int pop() {
        if (loc >= 0) {
            return s[loc--];
        }
        return -1;
    }

    int peep() {
        if (loc >= 0) {
            return s[loc];
        }
        return -1;
    }

    int size() {
        return loc + 1;
    }
}
