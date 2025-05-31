import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    queue.offer(Integer.valueOf(command[1]));
                    break;
                case "pop":
                    Integer e = queue.poll();
                    sb.append(e == null ? -1 : e).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    Integer f = queue.peek();
                    sb.append(f == null ? -1 : f).append('\n');
                    break;
                case "back":
                    Integer b = queue.peekLast();
                    sb.append(b == null ? -1 : b).append('\n');
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }
}
