import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Queue<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++)
            queue.offer(i);
        
        for (int i = 0; i < N - 1; i++) {
            queue.poll();
            queue.offer(queue.poll());
        }

        sb.append(queue.poll());
        
        System.out.print(sb);
        br.close();
    }
}
