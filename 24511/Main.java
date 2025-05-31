import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        boolean[] isStack = new boolean[N];
        for (int i = 0; i < N; i++) {
            isStack[i] = line[i].equals("1");
        }
        line = br.readLine().split(" ");
        Deque<Integer> queues = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if (!isStack[i]) {
                queues.offerLast(Integer.valueOf(line[i]));
            }
        }
        int M = Integer.parseInt(br.readLine());
        line = br.readLine().split(" ");
        int[] insertions = new int[M];
        for (int i = 0; i < M; i++) {
            insertions[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i < M; i++) {
            queues.offerFirst(insertions[i]);
            sb.append(queues.pollLast()).append(' ');
        }

        System.out.print(sb);
        br.close();
    }
}
